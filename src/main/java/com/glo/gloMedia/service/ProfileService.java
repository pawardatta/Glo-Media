package com.glo.gloMedia.service;

import com.glo.gloMedia.entity.Profile;

import java.util.List;
import java.util.Optional;

public interface ProfileService {

    public void addProfile(Profile profile);
    public List<Profile> getAllProfile();
    public Optional<Profile> getProfileById(long profileId);
    public void deleteProfile(long profileId);
    public long countProfilesWithNullDescriptions();


}
