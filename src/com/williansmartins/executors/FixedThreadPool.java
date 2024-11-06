package com.williansmartins.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {
    public static void main(String[] args) {
        // Creates a thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submitting multiple tasks to the executor
        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            executor.submit(() -> {
                System.out.println("Task " + taskId + " is running on " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000); // Simulate task processing time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        // Shutting down the executor once all tasks are complete
        executor.shutdown();
    }
}
