package org.processing;

import lombok.Builder;
import lombok.ToString;

@ToString
public class Clothing extends Product {
    private final String size;

    @Builder
    public Clothing(String name, String size) {
        super(name);
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
