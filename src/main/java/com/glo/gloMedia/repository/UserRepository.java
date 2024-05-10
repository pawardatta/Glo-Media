package com.glo.gloMedia.repository;

import com.glo.gloMedia.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findAllByOrderByUserNameAsc();
     List<User> findAllByOrderByUserIdDesc();
//
    @Query("SELECT u FROM User u WHERE u.id IN (SELECT p.user.id FROM Profile p)")
    List<User> findAllUsersWithValidProfile();
}
