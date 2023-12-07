package oops;

interface I1{
    void school();
    void home();

}
public class Interface_Sample implements I1{
    public static void main(String[] args) {
        Interface_Sample is = new Interface_Sample();
        is.home();
        is.school();
    }

    @Override
    public void school() {
        System.out.println("I am Going to School...! Bye Mom...");
    }

    @Override
    public void home() {
        System.out.println("I am Going to Hom...! Bye Mam...");
    }
}
