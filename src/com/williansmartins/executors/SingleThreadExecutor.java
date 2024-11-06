package com.williansmartins.executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {
    public static void main(String[] args) {
        // Create a single-threaded executor
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Submit multiple tasks to the executor
        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            executor.submit(() -> {
                System.out.println("Task " + taskId + " is running on " + Thread.currentThread().getName());
                try {
                    Thread.sleep(500); // Simulate task processing time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        // Shutting down the executor
        executor.shutdown();
    }
}
