package com.glo.gloMedia;

import com.glo.gloMedia.controller.ProfileController;
import com.glo.gloMedia.controller.UserController;
import com.glo.gloMedia.entity.Post;
import com.glo.gloMedia.entity.Profile;
import com.glo.gloMedia.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class GloMediaApplication implements CommandLineRunner {
	@Autowired
	UserController userController;
	@Autowired
	ProfileController profileController;

	public static void main(String[] args) {
		SpringApplication.run(GloMediaApplication.class, args);
	}

	@Override
	public String toString() {
		return "GloMediaApplication{" +
				"profileController=" + profileController +
				'}';
	}

	@Override
	public void run(String... args) throws Exception {

		Scanner scanner = new Scanner(System.in);

		int choice =0;


		do{
			System.out.println("Main menu");
			System.out.println("1. Add Profile");
			System.out.println("2. Delete profile");
			System.out.println("3. Get Profile By ID");
			System.out.println("4. Get all profile");
			System.out.println("5. Exit");
			choice = scanner.nextInt();
			switch (choice)
			{
				case 1:
					List<Post> posts = new ArrayList<>();
					posts.add(new Post(1004l,"I am datta"));
					posts.add(new Post(1005l,"I am good"));
					posts.add(new Post(1006l,"How are you"));
					User user = new User(0,"Datta","i am from",posts);
					Profile profile = new Profile("Datta pawar",user);
					profileController.addProfile(profile);
					break;
				case 2:
					System.out.println("Enter id to delete");
					long id = scanner.nextLong();
					profileController.deleteProfile(id);
					break;
				case 3:
					System.out.println("Enter id to view details");
					long user_id = scanner.nextLong();
					System.out.println(profileController.getProfileById(user_id));

					break;
				case 4:
					System.out.println("All profile details are");

					System.out.println(profileController.getAllProfile());
					break;
				case 5:
					System.exit(0);


			}
		}while(choice!=0 || choice>4);



		System.out.println("Profile details are : ====");

		System.out.println("Profile details are : ===="+		profileController.getProfileById(1));
		System.out.println("Profile details are : ====");

		System.out.println(userController.findAllByOrderByUserNameAsc());
		System.out.println(userController.findAllByOrderByUserIdDesc());
		System.out.println(userController.findAllUsersWithValidProfile());
		System.out.println(profileController.countProfilesWithNullDescriptions());


	}
}
