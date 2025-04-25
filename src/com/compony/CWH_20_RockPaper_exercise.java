package com.compony;
 import java.util.Random;
 import java.util.Scanner;
 
public class CWH_20_RockPaper_exercise {

    public static void main(String[] args) {
        Random R = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Here ,\n\t this is a Game - \n\t'The Rock Paper Scissor' , You can Play it NOW!! \n Click , \n\t r = rock \n\t p = paper \n\t s = scissor");

        //**********************************************************************************(Player #1)*(Manual)******************************************************************************************
        int chances = 0;
        while (chances <= 100) {
            chances++;

            System.out.println("Aditya please enter your choice");
            // System.out.println("Player #1 ");
            String s1 = sc.next();
            // System.out.print(s1);
            if (s1.equals("r")) {
                System.out.println(" Player #1 :\t rock");
            } else if (s1.equals("p")) {
                System.out.println("Player #1 :\t paper");
            } else {
                System.out.println("Player #1 :\t scissor");
            }
            //********************************************************************************(Player #2)* (Automatic)*********************************************************************************************
            //  System.out.println("Player #2 ");
            int r1 = R.nextInt(0, 3);
            //System.out.println(r1);
            if (r1 == 0) {
                System.out.println("Player #2 :\trock");
            } else if (r1 == 1) {
                System.out.println("Player #2 :\tpaper");
            } else {
                System.out.println("Player #2 :\tscissor");
            }
            //************************************************************************************(Player #3)*(Automatic)******************************************************************************************************
            // System.out.println("Player #3");
            int r2 = R.nextInt(0, 3);
            // System.out.println(r2);
            if (r2 == 0) {
                System.out.println("Player #3 :\trock");
            } else if (r2 == 1) {
                System.out.println("Player #3 :\tpaper");
            } else {
                System.out.println("Player #3 :\tscissor");
            }
            //**************************************************************************************(Putting Conditions-OR Gate in Conditions-AND Gate)*********************************************************************************

            if ((s1.equals("r") && r1 == 0 && r2 == 0) || (s1.equals("p") && r1 == 1 && r2 == 1) || (s1.equals("s") && r1 == 2 && r2 == 2)) {
                System.out.println("\tThe Match is Draw ");
            } else if ((s1.equals("r") && r1 == 1 && r2 == 1) || (s1.equals("r") && r1 == 0 && r2 == 1) || (r2 == 0 && s1.equals("p") && r1 == 1) || (r2 == 0 && s1.equals("r") && r1 == 1) || (r1 == 0 && r2 == 1 && s1.equals("p")) || (r1 == 0 && r2 == 0 && s1.equals("p"))) {
                System.out.println("\tThe Paper  Won the game ");
            } else if ((s1.equals("r") && r1 == 2 && r2 == 2) || (s1.equals("r") && r1 == 0 && r2 == 2) || (r2 == 0 && s1.equals("s") && r1 == 2) || (r2 == 0 && s1.equals("r") && r1 == 2) || (r1 == 0 && r2 == 2 && s1.equals("s")) || (r1 == 0 && r2 == 0 && s1.equals("s"))) {
                System.out.println("\tThe rock Won the game ");
            } else if ((s1.equals("p") && r1 == 2 && r2 == 2) || (s1.equals("p") && r1 == 1 && r2 == 2) || (r2 == 1 && s1.equals("s") && r1 == 2) || (r2 == 1 && s1.equals("p") && r1 == 2) || (r1 == 1 && r2 == 2 && s1.equals("s")) || (r1 == 1 && r2 == 1 && s1.equals("s"))) {
                System.out.println("\tThe scissor won the game ");
            } else if ((s1.equals("r") && r1 == 1 && r2 == 2) || (s1.equals("s") && r1 == 0 && r2 == 1) || (s1.equals("p") && r1 == 0 && r2 == 2) || (s1.equals("p") && r1 == 2 && r2 == 0) || (s1.equals("r") && r1 == 2 && r2 == 1) || (s1.equals("s") && r1 == 1 && r2 == 0)) {
                System.out.println("\tThe rock Won the game ");
            } else {
                System.out.println("\tMay be you have entered something wrong, \n please try again and try to Enter 'r' for Rock ,'p' for  paper and 's' for Scissor ,then RUN the Program \uD83D\uDE03, \n GOODLUCK ! ");
            }
            if ((r2 == 0 && s1.equals("p") && r1 == 1) || (r1 == 0 && r2 == 1 && s1.equals("p")) || (r1 == 0 && r2 == 0 && s1.equals("p")) || (s1.equals("r") && r1 == 2 && r2 == 2) || (s1.equals("r") && r1 == 0 && r2 == 2) || (r2 == 0 && s1.equals("r") && r1 == 2) || (r1 == 1 && r2 == 2 && s1.equals("s")) || (r1 == 1 && r2 == 1 && s1.equals("s")) || (r2 == 1 && s1.equals("s") && r1 == 2) || (s1.equals("r") && r1 == 1 && r2 == 2)) {
                System.out.println("HURRAY !! \uD83E\uDD73  You Won the game ,");
            } else {
                System.out.println("Oops !! You Lost \uD83D\uDE14  \n play Again \uD83D\uDE42 ");


            }
        }
        System.out.println("\n\n\n");
    }
}