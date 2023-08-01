package com.souksentry.souksentry.pojos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FruitsScraper extends GenericScraper {

    @Value("#{'${souksentry.scraper.fruits.markets}'.split(',')}")
    private List<String> fruitMarkets;

    private static final String CATEGORY = "Fruits";


    @Override
    public String getCategory() {
        return CATEGORY;
    }

    @Override
    public void runAndSaveData() {

    }
}
