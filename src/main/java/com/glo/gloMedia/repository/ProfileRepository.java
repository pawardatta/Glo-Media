package com.glo.gloMedia.repository;

import com.glo.gloMedia.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile,Long> {
    @Query("Select Count(p) From Profile p Where p.user.description IS NULL")
    long countProfilesWithNullDescriptions();
}
