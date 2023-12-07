package oops;

class Os1{
    void run(){
        System.out.println("method Overriding...");
    }
}
public class Overriding_Sample extends Os1{
    void run(){
        System.out.println("method Overriding...!");
    }

    public static void main(String[] args) {
        Overriding_Sample os1 = new Overriding_Sample();
        os1.run();
    }
}
