package com.compony;



public class CWH_31_Methods_in_Java {

    public static int subtract(int q , int w ){
        int j;
        j= q + w;
        return j ;
    }



    public static int testMethod(int x , int y, int h )// Here this is the declaration of the new method with the logic inside it
    {   x = 6;
        int z;
        if (x > y) {
            z = (x + y + h );

        } else {
            z = (x + y) * 5;
        }
        System.out.println( x );
        return z; //here return z; means that , when the logic will be
        // implemented some final value will be get assigned in the z variable
        //and after all this logic implementation , this  final value will get assigned in the variable c
        // below

    }

    public static void main(String[] args) {
        int a = 8;
        int b = 7;
        int h = 1;
        int c;
        c = testMethod(a , b, h); // here the Z variable value will come ,and get assigned in this variable
        // Remember,, the value that the z variable is containing is the finalized value , which
        // came from all the operation , logics , conditions' implementation. Likewise without making the
        // method to store the logic.
        System.out.println(c);
        /*  if (a > b) {
            c = (a + b);
        } else {
            c = (a + b) * 5;
        }
        System.out.println( c );*/
        // Instead of writing this much , and putting if - else we can simply store the Logic by declaring methods and can use anywhere in the program

        //2nd Method(way) : now we will call the method by making object of it , we generally use this method(way)
        //  when we will not write the 'static' during the declaration of the method in which the logic is stored

        int a1 = 2;
        int b1 = 1;
        int h1 = 1;
        int c1 ;
        CWH_31_Methods_in_Java obj = new CWH_31_Methods_in_Java();
        c1 = obj.testMethod(a1, b1, h1);
        System.out.println(c1);
        /*if (a1 > b1) {

            c1 = a1 + b1;
        } else {
            c1 = (a1 + b1) * 5;
        }.
        System.out.println( c1 );*/
        int uu = 1;
        int yy = 2;
        int hh ;
        hh = subtract(uu, yy);
        System.out.println(hh);



    }
}