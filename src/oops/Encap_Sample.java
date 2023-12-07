package oops;

class En{
    private int a;
    private String name;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Encap_Sample {
    public static void main(String[] args) {
        En e = new En();
        e.setName("Raju");
        e.setA(37);
        System.out.println(e.getA());
        System.out.println(e.getName());
    }
}
