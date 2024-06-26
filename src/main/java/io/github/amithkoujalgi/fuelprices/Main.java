package io.github.amithkoujalgi.fuelprices;

import io.github.amithkoujalgi.fuelprices.types.City;
import io.github.amithkoujalgi.fuelprices.types.FuelType;
import io.github.amithkoujalgi.fuelprices.types.PriceSource;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        PriceAPI priceAPI = new PriceAPI(PriceSource.GOOD_RETURNS_IN);
        System.out.println(priceAPI.fetch(City.KARNATAKA.BENGALURU_RURAL, FuelType.PETROL));
    }
}