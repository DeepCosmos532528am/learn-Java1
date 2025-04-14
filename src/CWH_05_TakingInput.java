package com.mycompony.src;
import java.util.Scanner;
public class CWH_05_TakingInput{

    public static void main(String[] args) {
        System.out.print("write int value; ");
        Scanner sc = new Scanner (System.in);
        int i = sc.nextInt();
        System.out.print("write byte value");
        byte b = sc.nextByte();
        System.out.println("write short value");
        short s = sc.nextShort();
        System.out.println("write long value");
        long l = sc.nextLong();
        System.out.println("write char value");
       // char c = sc.next() // isme samajh nhi aa rha ki char value ka input kese lenge ...Isko kisi se pucchna padega isliye hamne abhi isse '//' lagake invalid kardiya h
        System.out.println("enter String value");
        String S = sc.next();
        System.out.println("enter any boolean value");
        boolean B = sc.nextBoolean();
        System.out.println("ab double value likhiye");
        double d = sc.nextDouble();

    }
}






