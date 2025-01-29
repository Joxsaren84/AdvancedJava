package org.example.multithreading.lesson10;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                task.firstTread();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                task.secondThread();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        task.showCounter();
    }
}

class Task{
    private int counter;
    private Lock lock = new ReentrantLock();

    private void increment(){
        for (int i = 0; i < 10000; i++) {
            lock.lock();
            counter++;
            lock.unlock();
        }
    }

    public void firstTread(){
        lock.lock();
        increment();
        lock.unlock();
    }

    public void secondThread(){
        increment();
    }

    public void showCounter(){
        System.out.println("Counter is " + counter);
    }
}