package com.mycompony.src;
import java.util.Scanner;
public class CWH_12_Ch2PRACTICE_SET_QUESTIONS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /////////////////////////////////Question Answers Starting/////////////////////////////////////////////////////////////////////////////////
        System.out.println("Que no. 1 ");
        //so the question is to calculate float A =  7/4*9/2
        float A = 7f / 4 * 9 / 2;
        System.out.println(A);
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Que no.2 ");
        //So here the question is to check whether the enterd number from
        //the user is greater than the given number or not
        double c = 3.02;
        System.out.println("please enter any number and the program " +
                "will check whether the entered number by you is " +
                "greater or less than " + c);
        System.out.println("enter below here");
        double f = sc.nextDouble();
        boolean b = c > f;

        System.out.println("the expression " + c + " > " + f + " is  " + b);
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println(" Que no. 3");
        //in this question we have to calculate the value of  x which is
        //equal to 7*49/7 + 35/7
        System.out.println("so the value of x is ");
        System.out.println(7 * 49 / 7 + 35 / 7);
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Que no. 4");
        double v = 1;
        double u = 3;
        double a = 4;
        double s = 5;
        double O = (v * v - u * u) / (2 * a * s);
        System.out.println(O);

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Que no. 3 ");
        //in this queston we have to Write a JAVA Program to encrypt a grade by adding 8 to it .
        // And  Decrypt it show the Correct grade...
        //So,
        char grade = 'B';
        grade += 8;     // instead of this step we can use type casting method here '''see below'''!!!
        System.out.println(grade);
        grade -= 8;  //<--- this step is added to push back the character to
        // original one which is ('B')  which was pushed 8 letters forward to 'J
        // because of the previous above line operation that is 'grade += 8'
        grade = (char) (grade + 8); // <--- this  method is "Type Casting Method"
        //As we have already done , if we simply write (grade + 8 )
        //then it will show some integer type wierd answer ,,because we know that in the  grade variable the value is 'char' type
        // and if we do any operation between "character" and "Integer" then the
        // the resultant answer would always be integer type  that's why
//        we have first told java that I don't want answer in integer type
//    instead of any integer i want answer in char type only
//    so for telling it this thing, we have written (char) first then
//                (grade + 8 ) . This char is written their to tell java that i want
//                 answer in character type only  instead of any  integer type

        System.out.println(grade);
        System.out.println("Questions Answers  Finished ");
//     ________________________________________________________________________________________________________________________________________________________________________________________
        // iss part me rough work kiya gya h lekin ye rough work bade hi kaam ka h kaafi kucch seekhne ko milega yhaa se
        //isliye please visit zaroor kar bhai...
//       int   k = 2;
//        System.out.println(k);
//          int p = k++;
//        p += 54;
//
//int o = 0 ;
//        System.out.println(o  += k);
//        System.out.println(k);
//        System.out.println(p);
//        String j = "Hello World" ; // yhaa se samajh aaya ki jab hume kisi literal ki value ko print karna ho na toh hum
////       hamesha uss variable ka name println me parenthesis me likhte h,, isliye iss println wale function ko uss variable ke declare hone
////                ke baad hi likhna chahiye.  Respective of hum jis bhi  variable ki value ko print karne wale h
////                agr aesa nhi kiya aur println wale function ko uss particular variable ke pehle likh diya ussi particular variable ki value ko
////                print karne ke liye toh bhaisaab ERROR aawega
//        System.out.println(j);
//        System.out.println(k);
//        System.out.println(p);
//        // just to clear the doubts we will solve some problems related to integers  and their ranges
////        all we will try in this part so are you ready guys we will now rock...
//        long  i = 221294884757542323L;
//        float  c = 100.0f;
//        //isme dekho abhi computer ko ptaa h ki c ki value 100.of  h
//        char  d = 'e';
//        float  f = 29.0f;
//        double D = 0.44589999999999999999999989;
//        boolean b = true ;
//        float F = 2.0f;
//        float sum = f+F ;
////d  = 5;
//        System.out.println("le");
//d = 5 ; c/= d;  System.out.println(c);//lekin ab computer ko ptaa h ki c ki value 20.0 h kyuki yhaa pe humne ek operation kiya c ki value
////        100 ko d ki value 5 se divide diya ,,toh ab computer ko ptaa h ki c ki value 20.0 h ,aur ab iss dvide wale  operation ke kaaran computer ye cheez bhool chuka h ki c ki value kabhi
////                100.of bhi thi ,ab computer hamesha c ki value 20.0 hi print karega ,wo jab- jab bhi print karega tab-tab hi  operation me values ko daal kar
////                calculate karke hi btayega ki c ki value ye h ,computer ye bhool chuka h ki c ki value mujhe 100 bhi dikhani h .wo itn janta h ki jab bhi dikhan h
////                operation lagake hi dikhana h kyuki humne usse aesa bta rakha h ,isliye computer tab tak ye value dikhayega jab tak ki koi change usse karne
////                ke liye na kaha jaaye mtlb koi operation na lagaya jaaye ...
////        Aur ha agr hume computer se c ki puraani wali value ( 100 )agr print karana ho toh hume println wale function  ko kisi dusre operation ke start hone se
////                ke start hone se pehle lagana hoga taaki computer ye na samjh le ki value ko operation ke baad lagane ke baad batana h
//        d = 4; c/= d;
//        System.out.println(c);
////     wese hi firr jab hum kisi dusre operation ko laga denge firr computer  hume uss variable ki value ussi operation me  calculate karke hi dikhayega
////                ussi hisaab se dega aur firr again wo c ki value ussi operation ke anusaar maan leta h aur jab usse uss particular variable ki value
////ke saath koi dusra operation karna hoga tab wo uss variable ki value starting wali mtlb original value ke saath nhi karege agr uss operation se
////ke baad  koi dusra operation kiya gya ho toh kyuki jesa ki hum jante h ki computer varibale ki value operation ke saath change kar leta h agr operation lag jaaye
////toh wo ussi anusaar batayega
//d = 10 ; c/= d;
//        System.out.println(c);
//        System.out.println(d);
//        int S = 3 ;
//      float SS= 2;
//      float SSS =  S+SS;
//        System.out.println(SSS);
//        System.out.println(S);
//     S += 2;
//     SSS += 2;                                               /*ye inme ham various operations ko laga rhe h ,,isme dekho SSS ek variable h lekin ye variable
//        pehle hi declare ho gya ,,isme hame ye samjh aata h ki agr hume iss tarike se kisi variable me operations lagana ho toh hum
//        uss variable ko pehle declare karenge, uske baad usme jitne chahe utne operations laga sakte h*/
//        System.out.println(SSS);
//        System.out.println(S);
//        boolean B = ++SS*2 == ++S;
//        System.out.println(B);
//ab m fully satisfied hu result se aur filhaal koi doubt nhi h




    }

}