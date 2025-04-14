package com.mycompony.src;


import java.util.Scanner;

public class CWH_19_PracSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("the 1st answer ");
        int i = sc.nextInt();
        if (i >=0){
            System.out.println("the ntrd number is " + i );
        } else {
            System.out.println("As you have entered the number" + i + " , which is not greater than the 0 , so  I can't show you any number");
        }


        System.out.println("the 2nd answer ");
        int mark1, mark2, mark3;
        System.out.println("Enter Physics Marks ");
        mark1 = sc.nextInt();
        System.out.println("Enter Chemistry Marks ");
        mark2 = sc.nextInt();
        System.out.println("Enter Maths marks ");
        mark3 = sc.nextInt();
        double Grace = (mark1 + mark2 + mark3) * 0.30;
        System.out.println("Grace is " + Grace);
        if (mark1 >= 33 && mark2 >= 33 && mark3 >= 33 && Grace >= 40 && Grace <= 60) {
            System.out.println("Congratulations !! You are passed and with  2nd Division");
        } else if (mark1 >= 33 && mark2 >= 33 && mark3 >= 33 && Grace > 60) {
            System.out.println("Congratulations !! You are Passed with 1st Division");
        } else if (Grace > 60) {
            System.out.println("Try Hard Next Time...You are failed with 1st division");
        } else {
            System.out.println("you are failed with 2nd Division");
        }

        System.out.println("Want to know, How I calculated your Grace marks !! \n\t If your answer is big Yess or NO ,then \n\t PLease Enter 'Yes' or 'no' Respectively Below ");
      String reason = sc.next();
      if(reason.equalsIgnoreCase("yes")) {
          System.out.println("Actually we are calculating the overall all percent of \n " +
                  "your gain marks to that of your overall maximum marks , \n" +
                  "we will under this thing point wise,\n here's the step-by-step explanation in an easy-to-understand format:" +
                  "1. You are asked to input your marks in three subjects: Physics, Chemistry, and Maths.\n" +
                  "\n" +
                  "2. The program calculates the total of these marks by adding them up.\n" +
                  "\n" +
                  "3. It calculates your \"Grace\" by taking 30% (0.30) of the total marks.\n" +
                  "\n" +
                  "4. Now, it checks different conditions to decide which division you fall into:\n" +
                  "\n" +
                  "5. If you pass all subjects with at least 33 marks and your Grace is between 40 and 60, you're in the \"2nd Division.\"\n" +
                  "\n" +
                  "6. If you pass all subjects with at least 33 marks and your Grace is over 60, you're in the \"1st Division.\"\n" +
                  "\n" +
                  "7. If your Grace is over 60 but you didn't meet the 2nd or 1st Division criteria, it says you \"failed with 1st Division.\"\n" +
                  "\n" +
                  "8. If none of these conditions are met, it tells you that you \"failed with 2nd Division.\"" +
                  " \n Conclusion ::: this calculation of GRACE is done to calculate the Total percentage of the \n" +
                  " total marks that the user has gain with considering total 300 marks ,\n (100 marks each )as the total 100 % " +
                  "\t I hope , It's been all clear to you now...!");
      }else{
              System.out.println("OKAY! , moving you forward");
          }




        System.out.println("The answer no. 3 ");
// iss wale answer ka stuff rough_work_2. java class me dala h ,, usme answer toh mera sahi aa rha h lekin approx me aa rha h
        // iss cheez me kaafi doubt aa rha h isliye abhi iss 3rd answer ko yha import nhi kiya kyuki abhi usme doubt h



        System.out.println("Answer no. 4");
        // wese ek cheez notice karne laayak h, wo h ki hum kucch questions ko Swith-Case ke saath - saath IF-Else Ladder Se bhi kar sakte h

        int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Please enter the no.1  to  no.7 Only ");
        }


        System.out.println("answer no. 5");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.println("Yes ! it is a Leap Year");
        } else {
            System.out.println(" No! this is not a Leap Year ");
        }



        System.out.println("answer no. 6 ");

        String web = sc.next();
        switch (web) {
            case ".Com" -> System.out.println("This is a Commercial Website");
            case ".Org " -> System.out.println("This is a Organisation Website");
            case ".in" -> System.out.println("This is an Indian Website");

        }

        System.out.println(" answer no. 6 [ OR ]");
        String orWeb = sc.next();

        if (orWeb.endsWith(".com")) {
            System.out.println(" This is a Commercial Website ");
        } else if (orWeb.endsWith(".org")) {
            System.out.println(" This is a Organisation Website ");
        } else if (orWeb.endsWith(".in")) {
            System.out.println(" This is an Indian Website ");
        } else {
            System.out.println("The Entered Website type is illegal !! \n Please enter  a Valid website type ");



            // Practice Set Ends Here**************************


        }
    }
}
