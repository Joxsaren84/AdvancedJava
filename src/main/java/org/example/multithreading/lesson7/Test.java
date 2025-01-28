package org.example.multithreading.lesson7;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        WaitAndNotify waitAndNotify = new WaitAndNotify();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitAndNotify.produce();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitAndNotify.consume();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

    }
}

class WaitAndNotify{

    public void produce() throws InterruptedException {
        synchronized (this){
            System.out.println("Producer thread started...");
            wait();
            System.out.println("Producer thread resumed...");
        }

    }

    public void consume()throws  InterruptedException{
        Thread.sleep(2000);
        Scanner scanner = new Scanner(System.in);

        synchronized (this){
            System.out.println("Waiting for press any key...");
            scanner.hasNextLine();
            notify();
            Thread.sleep(10000);
        }
    }

}