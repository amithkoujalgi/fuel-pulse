package io.github.amithkoujalgi.fuelprices.impl;

import io.github.amithkoujalgi.fuelprices.FetchHandler;
import io.github.amithkoujalgi.fuelprices.types.FuelType;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class GoodReturnsIn implements FetchHandler {
    public float fetch(String city, FuelType fuelType) throws IOException {
        String type = fuelType.name().toLowerCase();
        Document doc = Jsoup.connect(String.format("https://www.goodreturns.in/%s-price-in-%s.html", type, city)).get();
        return Float.parseFloat(doc.select(".fuel-block-details").text().split("/")[0].replace("₹", "").strip());
    }
}
