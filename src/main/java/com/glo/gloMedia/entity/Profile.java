package com.glo.gloMedia.entity;


import jakarta.persistence.*;

@Entity
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long profileId;
    private String fulllName;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    public Profile() {
    }

    public Profile(String fulllName, User user) {
        this.fulllName = fulllName;
        this.user = user;
    }

    public long getProfileId() {
        return profileId;
    }

    public void setProfileId(long profileId) {
        this.profileId = profileId;
    }

    public String getFulllName() {
        return fulllName;
    }

    public void setFulllName(String fulllName) {
        this.fulllName = fulllName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "profileId=" + profileId +
                ", fulllName='" + fulllName + '\'' +
                ", user=" + user +
                '}';
    }
}
