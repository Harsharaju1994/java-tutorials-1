package oops;

class A{
    int money = 10000000;
    String[] gadgets = {"Laptop","Tab","Mobile"};
    void getAll(){
        System.out.println(gadgets);
    }
    void money(){
        System.out.println("money = "+money);
    }
}
class B extends A{
    String[] vehicals = {"Car","Bike","Flight","Bicycle"};
    void vehicles(){
        System.out.println("vehicles are "+ vehicals);
    }
}
public class Inheritence_Sample {
    public static void main(String[] args) {
        B b = new B();
        b.getAll();
        b.money();
        b.vehicles();
    }
}
