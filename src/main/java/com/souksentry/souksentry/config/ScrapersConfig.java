package com.souksentry.souksentry.config;

import com.souksentry.souksentry.models.FruitsScraper;
import com.souksentry.souksentry.models.VegetablesScraper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ScrapersConfig  {

    @Bean
    public FruitsScraper createFruitsScraper() {
        return new FruitsScraper();
    }

    @Bean
    public VegetablesScraper createVegetablesScraper() {
        return new VegetablesScraper();
    }
}
