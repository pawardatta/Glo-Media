package com.glo.gloMedia.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "user_glo")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    private String userName;
    private String description;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)

    private List<Post> post;

    public User() {
    }

    public User(long userId, String username, String description, List<Post> post) {
        this.userId = userId;
        this.userName = username;
        this.description = description;
        this.post = post;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Post> getPost() {
        return post;
    }

    public void setPost(List<Post> post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + userName + '\'' +
                ", description='" + description + '\'' +
                ", post=" + post +
                '}';
    }
}
