package com.souksentry.souksentry.config;

import com.souksentry.souksentry.services.ScraperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
public class ScrapingConfig {

    @Value("${souksentry.scraping.interval}")
    private long scrapingInterval;

    @Autowired
    private ScraperService scraperService;

// add scheduled job to run scrapers

}
