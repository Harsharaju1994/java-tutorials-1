package oops;

abstract  class A1{
    abstract void home();
    void school(){
        System.out.println("Going to School... Bye!");
    }
}
public class Abstract_Sample extends A1 {
    @Override
    void home() {
        System.out.println("Going to Home....!");
    }

    public static void main(String[] args) {
        Abstract_Sample ab = new Abstract_Sample();
        ab.home();
        ab.school();
    }
}
