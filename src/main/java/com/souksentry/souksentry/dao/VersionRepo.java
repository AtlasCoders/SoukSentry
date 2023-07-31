package com.souksentry.souksentry.dao;

import com.souksentry.souksentry.models.Version;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VersionRepo extends SoukSentryRepo<Version, Long> {

    @Query("select v from Version v ORDER BY v.versionId DESC")
    Version findLatestVersion();
}
