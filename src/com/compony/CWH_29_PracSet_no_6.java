package com.compony;
import java.util.Scanner;

public class CWH_29_PracSet_no_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Que no. 1 make a float array of upto 5 values and add them .
        float[] p1 = new float[5];
        p1[0] = 2.0f;
        p1[1] = 1.0f;
        p1[3] = 4.0f;
        p1[4] = p1[1] + p1[0]; // Accha toh hum yha pe dekh sakte h ki blocks me instead of seedhe - seedhe value put karna , ke we can put the value in the form of addition or any other operation like multiply, addition, subtraction, division e.t.c of two or more than 2 numbers, so the point to be remembered
        p1[2] = 5.0f;

        System.out.println("As according to the first Que., the answer is " + (p1[0] + p1[1] + p1[2] + p1[3] + p1[4]));
        //                         [Or , we can do like below also ]
        //                 [But here we have taken the example in 'int' data type
        //                 instead of float , just for the understanding purpose]

        int[] simple = {2, 4, 5, 3, 5};
        System.out.println("As according to the another solution the answer to the  first Que., is " + simple[0] + simple[1] + simple[2] + simple[3] + simple[4]);
        //                            [OR , Harry bhaiya's method ]
        float[] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for (float element :marks  ) {
            sum = sum + element;
            System.out.println(sum);
        }


        // Que no. 2 Write a JAVA program to detect whether the entered or given integer is
        // present in the Array or not
        int e1 = sc.nextInt();

        int[] p2 = {23, 23, 34, 54, 65, 65, 23, 12, 98, 90};
        boolean tf = false;
        for (int f1 : p2) {

            if (e1 == f1) {
                tf = true;
                break;
            }
        }
        if (tf) {
            System.out.println("Yes!! This number is present in the Array "); // Define An Array
        } else {
            System.out.println("NOPE!! this number is not here in the ARRAY ");
        }

        // Que no. 3 Calculate the average marks from an Array containing
        // marks of all students in Physics using for-each loops.

        // As we already know, that to calculate the average , we have to add the total values and then divide it by the no. of total values .
        System.out.println(sum / marks.length); // marks came from the answer no.1 , from -  THe Harry BHaiya part

       // Que no. 4 Create the JAVA program to add two matrices of Size 2 * 3



    }
}