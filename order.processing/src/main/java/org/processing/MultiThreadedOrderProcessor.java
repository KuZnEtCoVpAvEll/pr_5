package org.processing;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.List;

public class MultiThreadedOrderProcessor {
    public static <T extends Product> void processOrders(List<T> orders) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        orders.forEach(order -> executor.submit(() -> {
            OrderProcessor<T> processor = new OrderProcessor<>(order);
            processor.process();
        }));

        executor.shutdown();
    }
}
