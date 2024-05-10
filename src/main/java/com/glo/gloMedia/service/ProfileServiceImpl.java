package com.glo.gloMedia.service;

import com.glo.gloMedia.entity.Profile;
import com.glo.gloMedia.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfileServiceImpl implements ProfileService{

    @Autowired
    ProfileRepository profileRepository;

    @Override
    public void addProfile(Profile profile) {
        profileRepository.save(profile);

    }

    @Override
    public List<Profile> getAllProfile() {
        return profileRepository.findAll();
    }

    @Override
    public Optional<Profile> getProfileById(long profileId) {
        return profileRepository.findById(profileId);
    }

    @Override
    public void deleteProfile(long profileId) {
        profileRepository.deleteById(profileId);

    }
    @Override
    public long countProfilesWithNullDescriptions() {
        return profileRepository.countProfilesWithNullDescriptions();
    }
}
