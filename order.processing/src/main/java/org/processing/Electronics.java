package org.processing;

import lombok.Builder;
import lombok.ToString;

@ToString
public class Electronics extends Product {
    private final String brand;

    @Builder
    public Electronics(String name, String brand) {
        super(name);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
