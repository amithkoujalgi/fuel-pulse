### Fuel Pulse

A Java library to get the fuel prices in India by city.

#### Usage

```java
package io.github.amithkoujalgi.fuelprices;

import io.github.amithkoujalgi.fuelprices.types.City;
import io.github.amithkoujalgi.fuelprices.types.FuelType;
import io.github.amithkoujalgi.fuelprices.types.PriceSource;

import java.io.IOException;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        PriceAPI priceAPI = new PriceAPI(PriceSource.NDTV);
        priceAPI.fetch(City.KARNATAKA.BIDAR, FuelType.PETROL);
        
    }
}
```