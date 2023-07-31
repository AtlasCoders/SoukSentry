package com.souksentry.souksentry.services.impl;

import com.souksentry.souksentry.dao.VersionRepo;
import com.souksentry.souksentry.models.Version;
import com.souksentry.souksentry.services.VersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VersionServiceImpl implements VersionService {

    @Autowired
    private VersionRepo versionRepo;

    @Override
    public Version getCurrentVersion() {
        Version latestVersion = versionRepo.findLatestVersion();
        if (latestVersion != null) {
            return latestVersion;
        }
        throw new RuntimeException();
    }
}
