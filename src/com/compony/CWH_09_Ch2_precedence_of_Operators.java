package com.compony;
import java.util.Scanner;
public class CWH_09_Ch2_precedence_of_Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("the precedence and associativity");
        //Precedence is about which operator will be evaluated first in the expression!
        //The Precedence in Java Operators:
        //Addition (+) and Subtraction (-) have the same precedence.

        //Multiplication (*), Division (/), and Modulus (%) also have the same precedence.

        //However, multiplication, division, and modulus operators have higher precedence than addition and subtraction.

  /*      int h = 10/10*4;
boolean q  = 2*10/5== h;
        System.out.println(h);
        System.out.println(q);

//        System.out.println("Quick Quize : doing in our advance style ");
//        System.out.println("put x");
//        long x  = sc.nextLong();
//        System.out.println("y");
////        long y = sc.nextLong();
       System.out.println("put v");
     long v = sc.nextLong();
        System.out.println("put u ");
        long u = sc.nextLong();
//        System.out.println("put a");
//        long a = sc.nextLong();
//        System.out.println("put b ");
////        long b = sc.nextLong();
//        System.out.println("put c");
//        long c = sc.nextLong();
//    //    System.out.println("put d ");
//    //    long d = sc.nextLong();
//
//        System.out.println("equation number 1 ");
//        System.out.println("que:: x-y/2");
//        long solve_1 = (b*b )/(2*a) -( 4*a*c) / (2*a) ;
//        System.out.println(solve_1);
//int v = 'a'+5;
        int y = 7;
                float x =  ++y * 7
                        ;
        System.out.println(x);
        float e =  v / u + --v - ++u ;
        // v/u + 4 -
        System.out.println(e); */
        double x = 5;
        double y = 8;
        double k = y / x + y;
        System.out.println(k);
        // 6/2 = 3
        System.out.printf("The calculation is as follow %d", 2 * 1 / 4 - 2 + 2 * 4);
//Associativity is about from which direction the evaluation will start , if we have two operator of same precedence
        // Precedence in Java Operators:
        //Addition (+) and Subtraction (-) have the same precedence.
        //Multiplication (*), Division (/), and Modulus (%) also have the same precedence.

       // Catch it!!
      //  For +, -, *, /, %: Left to Right (evaluated from left to right in expressions)

       // For assignment operators (=): Right to Left
    }

}
