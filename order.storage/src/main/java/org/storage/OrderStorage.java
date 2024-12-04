package org.storage;

import org.processing.Product;

import java.util.ArrayList;
import java.util.List;

public class OrderStorage<T extends Product> {
    private final List<T> orders = new ArrayList<>();

    public void addOrder(T order) {
        orders.add(order);
        System.out.println("Order added: " + order);
    }

    public List<T> getOrders() {
        return orders;
    }
}
