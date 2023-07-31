package com.souksentry.souksentry.controllers;

import com.souksentry.souksentry.models.Version;
import com.souksentry.souksentry.services.VersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/about")
public class AboutController {

    @Autowired
    private VersionService versionService;

    @GetMapping("/version")
    ResponseEntity<Version> getVersion() {
        Version currentVersion = versionService.getCurrentVersion();
        if (currentVersion != null) {
            return ResponseEntity.ok(currentVersion);
        }
       return null;
    }

}
