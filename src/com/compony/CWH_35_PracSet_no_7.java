package com.compony;
import java.util.Scanner;
public class CWH_35_PracSet_no_7 {

    static char starPattern(int n) {
        for (int i = 1; i <=n; i++) {
           // return count++;
            for (int j = i; j>0; j--) {
                char cr = '*';
                System.out.print(cr+" ");

            }
            System.out.println();
        }

        return 0;
    }

    static int Table(int m){
        int b = 1;
        //System.out.println("aap kis number ki table chahte hai?");
        int a = m;

        for(int count=1; count<=10; count++) {

            int c = a * b;
            System.out.println(a + " * " + b + " = " + c);

            b++;
        }
        return m;
    }


    public static void main(String[] args ){
        int multiply= Table(2);
        System.out.println(multiply);
        starPattern(5);
        System.out.println("Printed the pattern again");// Remember , if the value is to be return and to be used again at some places in the programs the 0nly we will return it with (Return Keyword)
        // Otherwise we will use printmethod istead return keyword as shown in the star pattern method above...
        starPattern(10);
      /*  Scanner sc = new Scanner( System.in);

        char rs = starPattern(5);
        System.out.println(rs);

        int b = 1;
        //System.out.println("aap kis number ki table chahte hai?");
        int a = sc.nextInt();
      for(int count=1; count<=10; count++) {

            int c = a * b;
            System.out.println(a + " * " + b + " = " + c);

            b++;*/

    }
    }

