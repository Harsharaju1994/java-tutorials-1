package java8;

interface is1{
    int add(int a, int b);
}
public class Lambda_Sample {
    public static void main(String[] args) {
        is1 res = (a,b)-> (a+b);
        System.out.println(res.add(8,9));

        is1 res1 = (int a, int b) -> (a+b);
        System.out.println(res1.add(199,213));
    }
}
