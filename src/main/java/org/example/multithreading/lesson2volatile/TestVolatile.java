package org.example.multithreading.lesson2volatile;

import java.util.Scanner;

public class TestVolatile {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start();

        Scanner scanner = new Scanner(System.in);
        scanner.hasNextLine();

        thread1.shutdown();
    }

}

class MyThread extends Thread{

    private volatile boolean running = true;

    @Override
    public void run() {
        while (running){
            System.out.println("Hello");
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void shutdown(){
        running = false;
    }
}
