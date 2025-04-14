package com.mycompony.src;

import java.util.Scanner;

public class rough_work_2 {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);

        String age;
        age = sc.next();
        if (age.equals("sachin")) {
            System.out.println("you can ride bike as you are ");
        } else if (age.equals("sharma")) {
            System.out.println("the car can be driven by you!");
        } else if (age.equals("sarma")) {
            System.out.println("the truck can Be driven by you !");
        } else {
            System.out.println("the default is ready! ");
        }

// switch statements -
        String sondy = "Music";
       // System.out.println(sondy);

        switch (sondy) {
            case "Music" -> System.out.println("this  guy is definitely Sachin");
            case "music" -> System.out.println("this guy is definitely sharma ji");
            case "MuSiC" -> System.out.println("ye toh sachin ka music  h ");
            default -> System.out.println(" ye switch case ka default output h ");
        }
        System.out.println("Namaskar \uD83D\uDE4F\uD83C\uDFFB m JAVA Income tax Calculator \uD83E\uDD13  Aapka boht-boht Swagat Karti hu enter your salary!!");
//       float f = sc.nextFloat();
//        System.out.println(
//                (2.5f*0.05) +
//                        (5.0f*0.20)+
//                        ((f-10.0f)*0.30)
//        ) ;


        double salary = sc.nextDouble();

 double tax = 0;
         if (salary <= 2.5) {
            System.out.println("No Any Tax  \uD83E\uDD73 !! \n " + " income: " + salary + " Lakh  \uD83D\uDE0A  \n" + "I.Tax: " + "0%");
        } else if (salary > 2.5 && salary <= 5) {
            System.out.println("As You have mentioned that your Good Salary is " + salary + " Lakhs \uD83D\uDE0A  \n So You have to pay Only 5% of Income Tax of your total Salary \n Which Would be \n " + (((salary - 2.5) / 100) * 5) + "Lakh Rs.  ");
        } else if (salary > 5 && salary <= 10) {
            System.out.println(" As You have mentioned that your Good Salary is " + salary + " Lakhs  \uD83D\uDE0A  \n So You have to pay Only 20% of Income Tax of your total Salary \n Which Would be \n " + (((salary - 500000) / 100) * 20) + ((250000 / 100) * 5) + "Lakh Rs. ");
        } else if (salary > 10) {
             double v = +(2.5 * 0.05) + (5 * 0.20);
             tax = ((salary - 10) * 0.30) ;
             tax = tax + (2.5 * 0.05) ;
         tax = tax + (5 * 0.20);


        }
        System.out.println(tax);
         int i = 1;
         for (int k = 0 ; k < 5; k++)
         {
             System.out.println(i);
             i++;
         }
        System.out.println(i);


    }
}
