package string;

import java.util.Scanner;

public class String_Sample {
    public static void main(String[] args) {

        String name = "RajaGopal";
        System.out.println(name);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.length());

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name...");
        String na = sc.nextLine();
        System.out.println("My Name is "+ na);
    }
}
