package com.compony;
import java.util.Scanner;
public class CWH_07_PSQno1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in );
        System.out.println("Project no. 2");
//        addition of some integer number
        int i = 24;
        int i1 =34;
        int i2 = 43;
        int i3 = 54;
        byte b1 = 34;
        short s1 = 32223;
        long l1 = 999999999999999999L;
        float f1 = 3.2f;
        double d1 = 757575334.2;
        System.out.println(i + i1 + i2 + i3 + b1 + s1  + l1+ f1 + d1);
        System.out.println("now we will add the numbers given by you ");
       System.out.println( "please give us any 6 numbers to add");
       int i4 = sc.nextInt();
       byte b2 = sc.nextByte();
       long l2 = sc.nextLong();
       float f2 = sc.nextFloat();
       short s2  = sc.nextShort();
       double d2 = sc.nextDouble();


        System.out.println(i4 +b2+ l2 +f2 +s2 +d2);

    }
}
