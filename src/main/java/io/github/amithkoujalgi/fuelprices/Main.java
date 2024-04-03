package io.github.amithkoujalgi.fuelprices;

import io.github.amithkoujalgi.fuelprices.types.City;
import io.github.amithkoujalgi.fuelprices.types.FuelType;
import io.github.amithkoujalgi.fuelprices.types.PriceSource;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        PriceAPI priceAPI = new PriceAPI(PriceSource.NDTV);
        System.out.println(priceAPI.fetch(City.KARNATAKA.BIDAR, FuelType.PETROL));
    }
}