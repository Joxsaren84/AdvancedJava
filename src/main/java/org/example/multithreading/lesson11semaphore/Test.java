package org.example.multithreading.lesson11semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(200);
        Connection connection = Connection.getConnection();

        for (int i = 0; i < 200; i++){
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    connection.work();
                }
            });
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(1, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

class Connection{
    private static Connection connection = new Connection();
    private int connectionsCount;

    private Semaphore semaphore = new Semaphore(10);

    private Connection() {

    }

    public static Connection getConnection() {
        return connection;
    }

    public void work(){
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        doWork();
        semaphore.release();
    }

    private void doWork(){
        synchronized (this){
            connectionsCount++;
            System.out.println(connectionsCount);
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        synchronized (this){
            connectionsCount--;
            System.out.println(connectionsCount);
        }
    }
}