package com.williansmartins.executors;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledTasks {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        // Schedule a task to run every 2 seconds
        scheduler.scheduleAtFixedRate(() -> {
            System.out.println("Scheduled task is running at " + System.currentTimeMillis());
        }, 0, 2, TimeUnit.SECONDS);
    }
}
