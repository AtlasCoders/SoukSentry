package com.souksentry.souksentry.pojos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VegetablesScraper extends GenericScraper {

    @Value("#{'${souksentry.scraper.vegetables.markets}'.split(',')}")
    private List<String> fruitMarkets;

    private static final String CATEGORY = "Vegetables";


    @Override
    public String getCategory() {
        return CATEGORY;
    }

    @Override
    public void runAndSaveData() {

    }

}
