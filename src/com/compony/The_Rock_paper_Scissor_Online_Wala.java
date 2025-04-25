package com.compony;

        import java.util.Scanner;
        import java.util.Random;
public class The_Rock_paper_Scissor_Online_Wala {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        System.out.println("Welcome to Game");
        System.out.println("R for Rock");
        System.out.println("P for Paper");
        System.out.println("S for Scissor");
        int i = 0;
        int tie = 0;
        int user = 0;
        int com = 0;

        while(i<5) {
            String choice = sc.next();
            int c = ran.nextInt(3);
            switch (choice) {
                case "R" -> {
                    if (c == 0) {
                        String Pr = "Rock";
                        System.out.println("Rock : " + Pr);
                        System.out.println("Its a tie");
                        tie++;

                    } else if (c == 1) {
                        String Pr = "Paper";
                        System.out.println("Rock : " + Pr);
                        System.out.println("Computer wins");
                        com++;

                    } else {
                        String Pr = "Scissor";
                        System.out.println("Rock : " + Pr);
                        System.out.println("You win");
                        user++;

                    }
                }
                case "P" -> {
                    if (c == 0) {
                        String Pr = "Rock";
                        System.out.println("Paper : " + Pr);
                        System.out.println("You wins");
                        user++;

                    } else if (c == 1) {
                        String Pr = "Paper";
                        System.out.println("Paper : " + Pr);
                        System.out.println("Its a tie");
                        tie++;

                    } else {
                        String Pr = "Scissor";
                        System.out.println("Paper : " + Pr);
                        System.out.println("Computer win");
                        com++;

                    }
                }
                case "S" -> {
                    if (c == 0) {
                        String Pr = "Rock";
                        System.out.println("Scissor : " + Pr);
                        System.out.println("Computer wins");
                        com++;

                    } else if (c == 1) {
                        String Pr = "Paper";
                        System.out.println("Scissor : " + Pr);
                        System.out.println("You win");
                        user++;

                    } else {
                        String Pr = "Scissor";
                        System.out.println("Scissor : " + Pr);
                        System.out.println("Its a tie");
                        tie++;

                    }
                }
            }

            i++;
            System.out.println("You :"+ user +" |Computer :"+ com +"|Tie :"+tie);
        }
        if(user==com){
            System.out.println("Overall Its a tie");
        }
        else if(user>com){
            System.out.println("Overall You win");
        }
        else{
            System.out.println("Computer Wins");
        }


    }
}/*import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;
import java.util.Random;

public class The_Rock_Paper_Scissor_Online_Wala {
    public static void main(String[] args) {


              {
                String c , ans ;

                Scanner in = new Scanner(System.in);
                System.out.println("Stone , Paper or Scissor ?");
                System.out.println("Press s for stone , p for paper and sc for scissor ");
                System.out.println("Enter Your Choice");
                c=in.nextLine();
                int max,min=0;
                int rand = 0;
                max=3;
                min=1;
                rand= min +(int)(Math.random() * ((max-min)+1));
                System.out.println("Rand = " + rand);

                switch(c)
                {
                    case "s" :
                        if (rand==1){
                            System.out.println("User's Choice : Stone");
                            System.out.println("Opponent's Choice : Stone");
                            System.out.println("Draw!"); }

                        else if (rand==2){
                            System.out.println("User's Choice : Stone");
                            System.out.println("Opponent's Choice : Paper");
                            System.out.println("Opponent Wins!"); }

                        else if (rand ==3){
                            System.out.println("User's Choice : Stone");
                            System.out.println("Opponent's Choice : Scissor");
                        }
                }
            }
    }
}*/