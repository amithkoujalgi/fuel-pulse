package io.github.amithkoujalgi.fuelprices.impl;

import io.github.amithkoujalgi.fuelprices.FetchHandler;
import io.github.amithkoujalgi.fuelprices.types.FuelType;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class NDTV implements FetchHandler {
    public float fetch(String city, FuelType fuelType) throws IOException {
        String type = fuelType.name().toLowerCase();
        Document doc = Jsoup.connect(String.format("https://www.ndtv.com/fuel-prices/%s-price-in-%s-city", type, city)).get();
        return Float.parseFloat(doc.select(".todyPricContnr .prcContnr .font-b").text().replace("₹/L", ""));
    }
}
