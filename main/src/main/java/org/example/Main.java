package org.example;

import org.processing.DataGenerator;
import org.processing.MultiThreadedOrderProcessor;
import org.processing.Product;
import org.storage.OrderStorage;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Product> orders = DataGenerator.generateSampleOrders();
        OrderStorage<Product> storage = new OrderStorage<>();

        orders.forEach(storage::addOrder);
        MultiThreadedOrderProcessor.processOrders(storage.getOrders());
    }
}
