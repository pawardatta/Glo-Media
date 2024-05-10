package com.glo.gloMedia.controller;

import com.glo.gloMedia.entity.Profile;
import com.glo.gloMedia.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProfileController {

    @Autowired
    ProfileService profileService;

    public void addProfile(Profile profile) {
        profileService.addProfile(profile);

    }


    public List<Profile> getAllProfile() {
        return profileService.getAllProfile();
    }

    public Optional<Profile> getProfileById(long profileId) {
        return profileService.getProfileById(profileId);
    }

    public void deleteProfile(long profileId) {
        profileService.deleteProfile(profileId);

    }

    public long countProfilesWithNullDescriptions() {
        return profileService.countProfilesWithNullDescriptions();
    }
}
