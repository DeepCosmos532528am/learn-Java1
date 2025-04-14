package com.compony;
import java.util.Random;
import java.util.Scanner;
public class AirthmeticProbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("What is your Name Beta? :)");
        String username = sc.next();
        System.out.println("Hello " + username + "!,\nWhat type of problems you would like to practice today?\n");
        System.out.println("Please give me your preference by writing below- \n\t  'a' or '+' for addition, \n\t  's' or '-' for subtraction, \n\t  'd' or '/' for division, \n\t& 'm1' or '*' for multiplication.");

        String asdm = sc.next();
        for (int i = 0; i <= 10; i++) {
        int r1 = r.nextInt(10); // Here r1 r2 r3 r4 , are the methods to generate the random numbers automatically on which the question will generate automatically
        int r2 = r.nextInt(10);
        int r3 = r.nextInt(10);
        int r4 = r.nextInt(10);



            //***********************************************Addition*******************************************************************************************************************************************************
            if (asdm.equals("add") || asdm.equals("Add") || asdm.equals("A") || asdm.equals("a") || asdm.equals("addition") || asdm.equals("Addition") || asdm.equals("+")) {


                System.out.println(r1 + " + " + r2 + " + " + r3 + " + " + r4);
                int answer = sc.nextInt();
                int ans = r1 + r2 + r3 + r4;
                if (answer == ans) {
                    System.out.println("Very good " + username + "! The answer is correct. \n\t r1 + r2 + r3 + r4 = " + ans);
                } else {
                    System.out.println("Oh...! the Correct answer is" + ans + "\n Don't Mind , move to next");
                }

                //***********************************************Multiplication*******************************************************************************************************************************************************

            } else if (asdm.equals("multiply") || asdm.equals("Multiply") || asdm.equals("m1") || asdm.equals("M1") || asdm.equals("multiplication") || asdm.equals("multiplication") || asdm.equals("*")) {

                System.out.println(r1 + " * " + r2 + " * " + r3 + " * " + r4);
                int answer2 = sc.nextInt();
                int ans2 = r1 * r2 * r3 * r4;
                if (answer2 == ans2) {
                    System.out.println("Very good " + username + "! The answer is correct. \n\t r1 * r2 * r3 * r4 = " + ans2);
                } else {
                    System.out.println("Oh...! the Correct answer is" + ans2 + "\n Don't Mind , move to next");
                }

                //***********************************************Division*******************************************************************************************************************************************************

            }else if (asdm.equals("divide") || asdm.equals("Divide") || asdm.equals("d") || asdm.equals("D") || asdm.equals("division") || asdm.equals("Division") || asdm.equals("/")) {
                System.out.println(r1 + " / " + r2);
                float answer3 = sc.nextFloat();
                float ans3 = r1 / r2;
                if (answer3 == ans3) {
                    System.out.println("Very good " + username + "! The answer is correct. \n\t r1 / r2 = " + ans3);
                } else {
                    System.out.println("Oh...! the Correct answer is" + ans3 + "\n Don't Mind , move to next");
                }

                //***********************************************Subtraction*******************************************************************************************************************************************************

            } else if (asdm.equals("minus") || asdm.equals("Minus") || asdm.equals("S") || asdm.equals("s") || asdm.equals("subtraction") || asdm.equals("Subtraction") || asdm.equals("-")) {

                System.out.println(r1 + " / " + r2);
                int answer3 = sc.nextInt();
                int ans3 = r1 / r2;
                if (answer3 == ans3) {
                    System.out.println("Very good " + username + "! The answer is correct. \n\t r1 / r2 = " + ans3);
                } else {
                    System.out.println("Oh...! the Correct answer is" + ans3 + "\n Don't Mind , move to next");
                }

            } else {
                System.out.println("Please do mention it properly , what you want to practice today. Run the Program again ");
            }
        }

    }

}








//if ( asdm == 1)
        //int choose = sc.nextInt();
        //if ( choose >= 1 && choose <= 4 ){
            //    for (   ){


          //      }else {

        //        System.out.println("Sorry! Yet I'm not designed to get your choice in alphabet,\n Only use numerics from 1 - 4 , followed by your interest");