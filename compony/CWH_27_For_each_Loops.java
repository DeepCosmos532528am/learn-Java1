package com.compony;

import java.util.Scanner;

public class CWH_27_For_each_Loops {
    public static void main(String[] args) {


        Scanner sc = new Scanner (System.in);
        /*
        float [] marks = {98.5f, 45.5f, 79.5f, 99.5f, 80.5f};
        String [] students ={"Harry", "Rohan", "Shubham", "Lovish"};
        System.out.println(students.length);
        System.out.println(students[2]);
        */

                int[] marks = {98, 45, 79, 99, 80};
                 System.out.println(marks.length);

                // 1st - Displaying the Array (Naive way)
                System.out.println("Printing using Naive way");
                System.out.println(marks[0]);
                System.out.println(marks[1]);
                System.out.println(marks[2]);
                System.out.println(marks[3]);
                System.out.println(marks[4]);

                //2nd -  Displaying the Array (for loop)
                System.out.println("Printing using for loop");
                for (int i = 0; i < marks.length; i++) {
                    System.out.println(marks[i]);
                }

                // 3rd - Quick Quiz: Displaying the Array in Reverse order (for loop)
                System.out.println("Printing using for loop in reverse order");
                for (int i = marks.length - 1; i >= 0; i--) {
                    System.out.println(marks[i]);
                }

                // 4th - Quick Quiz: Displaying the Array (for-each loop)
                System.out.println("Printing using for-each loop");
                for (int element : marks) {
                    System.out.println(element);
                }

         int [] intt = {23,44,55,66,77};
        System.out.println(intt.length);


        for (int nn : intt){
            System.out.println(nn);


}
        System.out.println(intt);/* iss tareeke se print karne ke liye hum dekh sakte h ki ,
                print nhi ho rha kucch wiered sa hi answer h isliye hum for ke andar daal ke print karne wala method use karte h  */

        int [] sachin = new int[5];
        sachin[0] = 3;
        sachin[1] = 2;
        sachin[2] = 3;
        System.out.println("sum h: " + (sachin [2]+ sachin [0 ] + sachin [1]));

        int [] sharma ;
        sharma = new int [5];
        sharma[0] = 78;
        System.out.println(sharma[0]);
        System.out.println("idhar se dekhenge hum");

        int[]ji = {2,3,5,3};
        System.out.println(ji.length);

        for( int jee : ji )
        {
            System.out.println(jee);
        }


int [] jj = ji;
        System.out.println(jj);
        for (int ijk: jj)
        {
            System.out.println(ijk);
        }
        for( int jyu:ji )
        {
            System.out.println(jyu);
        }

        // printing the Array in reverse order using 'for-each' loop;
    int [] iik = new int[10];
        iik [0]= 0;
        iik [1]= 2;
        iik [2]= 4;
        iik [3]= 5;
        iik [4]= 2;
        iik [5]= 8;
        iik [6]= 9;
        System.out.println(iik.length);
        System.out.println("print kar rhe h yha se hum");
        for ( int i =iik.length-1 ; i >= 0; i-- ) //humne iss for-each loop k andar length me se 1 minus kiya h , ye toh ptaa h na ?!! dekho yaar aesa humne isliye kiya h kyuki blocks ka index total me jo index value hoti h usse 1 number peeche hoti h , yaad aaya
           // because of that n-1 formula, ab toh yaad aa gya hoga !!
            {
            System.out.println(iik[i]);

            }
        int [][] arrays = new int[4][3];
        arrays [0][0] = 111;
        arrays [0][1] = 222;
        arrays [0][2] = 333;
        arrays [1][0] = 444;
        arrays [1][1] = 555;
        arrays [1][2] = 666;
        arrays [2][0] = 777;
        arrays [2][1] = 888;
        arrays [2][2] = 999;
        arrays [3][1] = 11;
        arrays [3][2] = 12;
        arrays [3][0] = 10;
        //arrays [3][3] = 12;*/

        for (int i= 0  ; i<arrays.length; i++)
        {
            for (int j = 0 ; j < arrays[j].length; j++)
            {
                System.out.print(arrays[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }















        }
    }




