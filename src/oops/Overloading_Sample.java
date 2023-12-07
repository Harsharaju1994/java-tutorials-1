package oops;


public class Overloading_Sample {
    int sum(int a, int b){
        return (a+b);
    }
    int sum(int a, int b, int c){
        return (a+b+c);
    }
    float sum(float a,float b){
        return (a+b);
    }
    double sum(double a,double b){
        return a+b;
    }

    public static void main(String[] args) {
        Overloading_Sample os= new Overloading_Sample();
        System.out.println(os.sum(1,3,4));
        System.out.println(os.sum(2.3,5.4));
        System.out.println(os.sum(3,5));
    }
}
