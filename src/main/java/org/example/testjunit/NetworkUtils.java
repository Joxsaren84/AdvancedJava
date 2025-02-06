package org.example.testjunit;

public class NetworkUtils {

    public static void getConnection(){

        try {
            Thread.sleep(900);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return;
    }
}
