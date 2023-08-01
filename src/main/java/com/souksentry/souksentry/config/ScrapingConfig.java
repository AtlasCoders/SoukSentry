package com.souksentry.souksentry.config;

import com.souksentry.souksentry.pojos.Scraper;
import com.souksentry.souksentry.services.ScraperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;

@Configuration
@EnableScheduling
public class ScrapingConfig {

    @Autowired
    private ScraperService scraperService;

    private final List<Scraper> listOfScrapers;

    public ScrapingConfig(List<Scraper> listOfScrapers) {
        this.listOfScrapers = listOfScrapers;
    }

    @Scheduled(cron = "${souksentry.scraper.cron.interval}")
    public void scheduleFixedDelayTask() {
        for(Scraper scraper : listOfScrapers) {
            scraper.runAndSaveData();
        }
    }
}
