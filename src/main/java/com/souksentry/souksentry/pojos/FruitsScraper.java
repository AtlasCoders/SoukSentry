package com.souksentry.souksentry.pojos;

import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
@Slf4j
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
        Document doc = null;
        try {
            doc = Jsoup.connect(fruitMarkets.get(1))
                    .header("Accept-Language", "en-US")
                    .header("Accept-Encoding", "gzip,deflate,sdch")
                    .get();            // gather information from the webpage and target the price + title.
        } catch (IOException e) {
            log.error("Website wasn't accessible", e);
        }
        log.info(doc.title());
    }
}
