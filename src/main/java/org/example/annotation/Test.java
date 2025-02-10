package org.example.annotation;

@MyAnnotation
public class Test implements MyInterface {
    @MyAnnotation
    private String name;

    @MyAnnotation
    public Test(){

    }

    @MyAnnotation
    @Deprecated
    public void test(@MyAnnotation int value){
        @MyAnnotation String localVar = "hello";
    }

    @MyAnnotation
    public static void main(@MyAnnotation String[] args) {
        Test test = new Test();
        test.test(456);

    }

    @Override
    public void printHello() {
        System.out.println("hello");
    }
}
