package com.souksentry.souksentry.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class GenericScraper implements Scraper {

    public abstract String getCategory();

    @Override
    public void runAndSaveData() {

    }
}
