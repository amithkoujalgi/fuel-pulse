package io.github.amithkoujalgi.fuelprices.impl;

import io.github.amithkoujalgi.fuelprices.FetchHandler;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class NDTV implements FetchHandler {
    public float fetch(String city, String fuelType) throws IOException {
        Document doc = Jsoup.connect(String.format("https://www.ndtv.com/fuel-prices/%s-price-in-%s-city", fuelType, city)).get();
        return Float.parseFloat(doc.select(".todyPricContnr .prcContnr .font-b").text().replace("₹/L", ""));
    }
}
