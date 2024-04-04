### Fuel Pulse

<img src='https://github.com/amithkoujalgi/fuel-pulse/assets/1876165/6a599fdb-226e-4cf2-81b2-0c95188dc349' width='100' alt="ollama4j-icon">

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
        
        priceAPI.fetch(City.KARNATAKA.BENGALURU, FuelType.PETROL);

    }
}
```

### API Spec

Find the full API specifications on the [website](https://amithkoujalgi.github.io/fuel-pulse/).

### Roadmap

- [ ] Add more states/cities
- [ ] Add support for fetching prices by company (Shell, Indian Oil, etc.)
- [ ] Add support for fetching price history

### Get Involved

Contributions are most welcome! Whether it's reporting a bug, proposing an enhancement, or helping with code - any sort
of contribution is much appreciated.
