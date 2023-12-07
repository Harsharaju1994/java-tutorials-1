package basics;

public class Sample_01 {

    public static void main(String[] args) {
        int i = 10;
        if(i<14)
            System.out.println(i +" is less than 14");
        else
            System.out.println(i +" Grater than 14");

        int i1 = 19, i2 = 24 , max;

         max =(i1<i2)? (i1+i2): (i1-i2) ;
        System.out.println(max);
    }
}
