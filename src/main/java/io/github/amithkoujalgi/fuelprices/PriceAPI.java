package io.github.amithkoujalgi.fuelprices;

import io.github.amithkoujalgi.fuelprices.impl.NDTV;
import io.github.amithkoujalgi.fuelprices.types.FuelType;
import io.github.amithkoujalgi.fuelprices.types.PriceSource;

import java.io.IOException;

public class PriceAPI {
    private final PriceSource source;

    public PriceAPI(PriceSource source) {
        this.source = source;
    }

    public float fetch(String city, FuelType fuelType) throws IOException {
        if (PriceSource.NDTV == source) {
            return new NDTV().fetch(city, fuelType);
        } else {
            // use a default impl
            return new NDTV().fetch(city, fuelType);
        }
    }
}
