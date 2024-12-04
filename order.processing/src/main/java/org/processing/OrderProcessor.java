package org.processing;

public class OrderProcessor<T extends Product> {
    private final T product;

    public OrderProcessor(T product) {
        this.product = product;
    }

    public void process() {
        System.out.println("Processing order for: " + product);
    }
}
