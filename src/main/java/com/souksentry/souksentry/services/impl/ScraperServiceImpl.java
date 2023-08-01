package com.souksentry.souksentry.services.impl;

import com.souksentry.souksentry.pojos.Scraper;
import com.souksentry.souksentry.services.ScraperService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScraperServiceImpl implements ScraperService {

        private final List<Scraper> listOfScrapers;

        public ScraperServiceImpl(List<Scraper> listOfScrapers) {
            this.listOfScrapers = listOfScrapers;
        }

        public void runAllScrapers() {
            for( Scraper scraper : listOfScrapers) {
                scraper.runAndSaveData();
            }

        }
}
