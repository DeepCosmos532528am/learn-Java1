//CBSE Board Percentage calculator

        package com.mycompony.src;


 import java.util.Scanner;

public class CWH_06_CBSEPercentCalcu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int yuou = 0; yuou <= 10; yuou++) {
            System.out.println("Enter your Hindi Marks");
            int H = sc.nextByte();

            System.out.println("Enter your Sanskrit Marks ");
            int E = sc.nextInt();

            System.out.println("Enter your Maths Marks");
            int M = sc.nextInt();

            System.out.println("Enter your SocialStudies Marks ");
            int P = sc.nextByte();

            System.out.println("Enter your English Marks ");
            int C = sc.nextInt();

            float sum = (H + E + M + P + C) / 5f;


            System.out.println("please enter your registered password to see your result !! ");
            String password = sc.next();
            String password2 = null;
            if (sum > 33.0 && H > 33 && E > 33 && M > 33 && P > 33 && C > 33 && password.equals("sachins")) {
                System.out.println("Congratulations !! you are passed  \uD83D\uDE0A ,,\n\t Don't Worry!!,, nobody will be able to see your pecentage without your permission \n If you want to see your percentage,\n then please enter your registered Password below");
                System.out.println(" \n you can put 'no' if you do not want to see percentage \n\t Password:  ");
                password2 = sc.next();
            } else if (password.equals("sachins")) {
                System.out.print("  Try Your Best Next Time \uD83D\uDE0A ,, \n\t  Don't Worry!!,, nobody will be able to see your pecentage without your permission \n If you want to see your percentage,\n then please enter your registered Password below");
                System.out.println("you can put 'no' if you do not want to see percentage \n\t Password:  ");
                password2 = sc.next();
            }

            if (password2.equals("sachins")) {
                switch (password2) {
                    case "rain" -> System.out.println("you got " + sum + "% \n Thank you so much for using the Calculator ");
                    case "no" -> System.out.println(" Thank you so much for using the Calculator !!  ");
                    default -> System.out.println(" It seems you have entered the wrong password !! please try again ");
                }
            } else {
                System.out.println("The password entered is incorrect ");
            }
            // The method below is Another way to get output as same as the Switch case is giving above, but
            // sometimes it gives us the null pointer exception at some stages , so we will use the above one
            // See above we have find a way to avoid null pointer exception  by closing the switch case into the if-else conditionals  ,toh bhai hum null pointer exception me fase the boht dino se aaj uska bhi samadhan h humare pass...


       /* if (password2.equals("rain")){
    System.out.println("you got " + sum + "% \n Thank you so much for using the Calculator ");
}else if (password2.equals("no")){
    System.out.println(" Thank you so much for using the Calculator !!  ");
}else {
    System.out.println("The password entered is incorrect ");}*/

            //*************-----------------------------------------------*******************----------------------*************----------************--------*-----------***-*-*-*-*-*-*-*

            // System.out.println("Sorry !! you may have entered the wrong password ");


//**************************************************************************------------------------------------------------------------


//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// This is the first try to make the calculator more advance in some way , We have commented Out this program because this program is getting executed properly but after execution it is showing "null pointer exception "-ERROR
            // this ERROR can be seen when we put all the marks above 33 in all the five subjects .
            // The motive behind this program is to make the calculator to ask PASSWORD for showing the percentage if the User got failed ( less than 33 marks ) even if in one subject also.
            // But if the user got passed then the calculator will show the percentage without asking for the password
// Now the question is that why it is showing nullpointer error although if the program is getting executed properly
            // that's why we have commented out this part of code
            // this code will be jointed to the above program after the percentage calculation in the variable named as  "sum"


        /*String password = null;
        if (sum > 33.0 && H > 33 && E > 33 && M > 33 && P > 33 && C > 33) {
            System.out.println("Congratulations !! you are passed  \uD83D\uDE0A ,,\n\t Don't Worry!!,, nobody will be able to see your pecentage without your permission \n If you want to see your percentage,\n then please enter your registered Password below\n\t Password: ");
        } else {
            System.out.print("  Try Your Best Next Time \uD83D\uDE0A ,, \n\t  Don't Worry!!,, nobody will be able to see your pecentage without your permission \n If you want to see your percentage,\n then please enter your registered Password below\n\t Password: ");
            password = sc.next();
        }


        if (password.equals("sachin")) {
            System.out.println(" you got  " + sum + "thank you so much for using Percentage Calculator . \n We hope you Liked the service  ");
        }  else if (password.equals(null)) {
            System.out.println(" Thank You So Much for using Percentage Calculator .\n We hope you Liked the service ");
        }
           else {
            System.out.println(" It seems you have entered the wrong Password .  Please <<<Try Again>>> and enter correct password ") ;
}*/

//*************************************************************************************************************************************************************************************************

// This is the second try to make the calculator more advance in some diffrent way but this try didn't succeed. Actually this code was writeen to make the program to identify the creator of the program (Sachin Sharma)
//  by adding this code to the program it will identify its maker and will talk politely to its real builder where on the other hand it will talk ruidly to
//  everyone except its builder .
// Now the question comes ,why it's commented out , so it is commented out because this code is not working properly
//, but we don't know why it is not working properly ,,,,, so this issue will be seen later and will be resolved soon ...
            // this code will be jointed to the above program after the percentage calculation in the variable named as  "sum"

        /* System.out.println("aho bhagya humare jo aapne aaj hame kisi layak samjha  wese h kon h ve tu??");

            String s11 = sc.nextLine();


            if (s11 == "Sachin") {
                System.out.println("Arre...,Malik aap ,,m toh bas aese hi keh rha tha kucch bhi .  Please mujhe maaf kar dijiye jo mene aapse itni badtmeezi se baat ki.  btaaiye Sachin Sir m aapki kese sewa kar sakta hu ?? ");
            } else {
                System.out.println("sunn ve m kisi " + s11 + " - va" + s11.substring(2) + " ko nhi janta ,, faaltu bakwaas nhi ,jaldi se kaam bako aur niklo yhaa se ,,pta nhi kaha - kaha se aa jaate h !!");
            }
            String s125 = sc.nextLine();
            if (s125 == "Sachin") {
                System.out.println("Sir konsi percent nikalwana chahte h aap ??");
            } else {
                System.out.println("Arre.., " + s11 + "iya ,konsi percent chahiye tujhe ?");
            }
            String s123 = sc.nextLine();
            if (s11 == "Sachin") {
                System.out.printf("Ji Sir abhi bas 0.0000000000001 seconds me aapko percent deta hu Sir aapki percent h %f  %", sum);
            } else {
                System.out.printf(" wah... " + s11 + " wah , tujhe itni aasan si percent bhi nikalni nhi aati, itne se kaam ke liye mujhe jesi  mahaan program ko pareshaan kar rhe h aap!!  Sharm aani chahiye aapko zanaab " +
                        "!!  lekin chhodo . toh mahashay aapki percent h %f  % ", sum);

            }*/


        }


    }}