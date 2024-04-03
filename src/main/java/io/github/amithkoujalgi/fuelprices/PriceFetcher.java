package io.github.amithkoujalgi.fuelprices;

import io.github.amithkoujalgi.fuelprices.impl.NDTV;
import io.github.amithkoujalgi.fuelprices.types.PriceSource;

import java.io.IOException;

public class PriceFetcher {
    private PriceSource source;

    public PriceFetcher(PriceSource source) {
        this.source = source;
    }

    public float fetch(String city, String fuelType) throws IOException {
        if (PriceSource.NDTV == source) {
            return new NDTV().fetch(city, fuelType);
        } else {
            return new NDTV().fetch(city, fuelType);
        }
    }
}
