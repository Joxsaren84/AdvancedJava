package org.example.lambdaex;


interface Executable{
    int execute(int x, int y);
}

class Runner{
    public void run(Executable e){
        int n = e.execute(10, 20);
        System.out.println(n);
    }
}

public class Test1 {
    public static void main(String[] args) {
        Runner runner = new Runner();

        runner.run(new Executable() {
            @Override
            public int execute(int x, int y) {
                System.out.println("hello");
                return x + y;
            }
        });

        runner.run((int x, int y)-> {
            System.out.println("hello");
            System.out.println("good bye");
            return x + y;
        }
        );

        final int a;
        a = 30;
        runner.run((x, y)-> x + y + a);
    }
}
