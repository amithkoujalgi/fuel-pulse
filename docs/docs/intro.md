---
sidebar_position: 1
---

# Introduction

**Fuel Pulse** is Java library to get the fuel prices in India by city.

Add the dependency to your project's `pom.xml`.

```xml

<dependency>
    <groupId>io.github.amithkoujalgi</groupId>
    <artifactId>fuel-pulse</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

Use the API to access the petrol price in Bengaluru city.

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