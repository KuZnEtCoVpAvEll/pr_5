package org.processing;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class DataGenerator {
    public static List<Product> generateSampleOrders() {
        Faker faker = new Faker();
        List<Product> products = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            products.add(Electronics.builder()
                    .name(faker.commerce().productName())
                    .brand(faker.company().name())
                    .build());
            products.add(Clothing.builder()
                    .name(faker.commerce().productName())
                    .size(faker.options().option("S", "M", "L", "XL"))
                    .build());
        }

        return products;
    }
}
