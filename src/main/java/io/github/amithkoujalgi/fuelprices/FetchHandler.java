package io.github.amithkoujalgi.fuelprices;

import io.github.amithkoujalgi.fuelprices.types.FuelType;

import java.io.IOException;

public interface FetchHandler {
    float fetch(String city, FuelType fuelType) throws IOException;
}
