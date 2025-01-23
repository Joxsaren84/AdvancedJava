package org.example.multithreading.lesson1;

public class Test {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("first");
        thread1.start();
        MyThread thread2 = new MyThread("second");
        thread2.start();
        Thread runnable = new Thread(new MyRunnable("runnable"));
        runnable.start();
    }
}

class MyThread extends Thread{
    String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from MyThread " + name);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MyRunnable implements Runnable{

    String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from MyThread " + name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}