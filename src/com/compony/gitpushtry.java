package com.compony;
import java.util.Scanner;
public class gitpushtry{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("1st Program");
        String dig1 = sc.next();
        String dig2 = sc.next();
        System.out.println();
        String alpha = " abcdefghijklmnopqrstuvwxyz";
        int in1 = alpha.indexOf(dig1);
        int in2 = alpha.indexOf(dig2);
        System.out.println(in2-in1);


        System.out.println("2nd Program");
        int i = sc.nextInt();
        char ssc = " abcdefghijklmnopqrstuvwxyz".charAt(i);
        System.out.println(ssc);


        System.out.println("3rd Program");
        char dig3 = ssc;
        int in3 = alpha.indexOf(dig3);
        System.out.println(in3);




    }
}
