package com.souksentry.souksentry.config;

import com.souksentry.souksentry.dao.VersionRepo;
import com.souksentry.souksentry.models.Version;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Autowired
    private VersionRepo versionRepo;

    @Value("${souksentry.version.name}")
    private String versionName;

    @Value("${souksentry.version.number}")
    private String versionNumber;

    @PostConstruct
    void createCurrentApplicationVersionEntry() {
        Version currentVersion = new Version();
        currentVersion.setVersionNumber(versionNumber);
        currentVersion.setName(versionName);
        versionRepo.save(currentVersion);
    }
}
