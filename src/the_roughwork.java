package com.mycompony.src;

import java.util.Scanner;


public class the_roughwork {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
  System.out.println("Please Enter The Buying Price");
        int i = sc.nextInt();

        System.out.println("If there is any Additional cost that shopkeeper put in bicycle, than please enter it ");
int i3 = sc.nextInt ();
        System.out.println("Now Please Enter The Selling Price ");
        int i2 =  sc.nextInt();
       System.out.println("Total Buying Price");
        int i4 = i+i3;
        System.out.println(i4);
        System.out.println();
        System.out.println("QUESTION");
        System.out.println();
        System.out.println();
        System.out.println("A shopkeeper bought a bicycle worth Rs."+ i  +"and and  put Rs." + i3 + "in repairing of it ");
        System.out.println("and after repairing the bicycle ,he sold the bicycle worth Rs." + i2 +  ".So find the");
        System.out.println(" profit percentage that the shopkeeper got on selling that Bicycle");
        System.out.println();

        System.out.println();
        System.out.println("THE SOLUTON ");
        System.out.println();
        System.out.println();
        System.out.println("Buying Price:"+i     );
        System.out.println("Additional Price:"+i3);
       System.out.println("Selling Price:"+i2);
        System.out.println();
        System.out.println();
   float i5 = (i2-i4)*100f/i4;
        System.out.print(i5);

    System.out.println("  Percentage Profit You Got  got Betta...");






       }
       }






