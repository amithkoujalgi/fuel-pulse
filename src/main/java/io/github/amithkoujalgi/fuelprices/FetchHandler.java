package io.github.amithkoujalgi.fuelprices;

import java.io.IOException;

public interface FetchHandler {
    float fetch(String city, String fuelType) throws IOException;
}
