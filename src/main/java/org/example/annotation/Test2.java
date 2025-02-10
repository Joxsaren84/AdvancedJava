package org.example.annotation;

public class Test2 {

    @MethodInfo(purpose = "print Hello world!")
    public void printHelloWorld(){
        System.out.println("Hello world!");
    }
}
