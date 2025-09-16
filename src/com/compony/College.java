package com.compony;

import java.util.Scanner;

public class College {
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        for (int x = 1; x<7; x++) {
            int in = sc.nextInt();

            int count = 0;
            int countt = -1;
            int count2;
            int[] search = {2, 4, 3, 5, 4, 6};

            for (int srch : search) {

                if (in == srch) {

                  if ( countt == -1){
                      countt = count;
                  }
                    System.out.println(countt);

                } else {
                    System.out.println("ex");
                }

                count++;

            }

        }

       // 1st one
        System.out.println("My name printing");
        String name = "Sachin Sharma";
        System.out.println(name);
       //2nd one
        float myCGPA = 6.2f;
        System.out.println(myCGPA);
        //3rd one
        final int fnum = 40;
        //fnum= sc.nextInt();

        // Manish ko samjhaane ke liye
        String name1 = "8";
        System.out.println(name1);
    }

}
