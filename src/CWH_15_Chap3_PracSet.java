package com.mycompony.src;

public class CWH_15_Chap3_PracSet {
    public static void main(String[] args) {
        //Answer no. 1
        System.out.println("answer 1 ");
        System.out.println("Sachin Sharma".toLowerCase());

// Answer no. 2
        System.out.println("answer 2");
        System.out.println("Sachin Sharma".replace(" ", "_"));

        //Answer no. 3
        System.out.println("answer 3 ");
        String s = "Dear <|name|> thanks a lot ";
        String letter = s.replace("<|name|>", "sachin");
        System.out.println(letter);
        //Answer no. 4
        System.out.println("answer 4");
        String S = "  sachin sharma  ";
        int word = S.indexOf("   ",0);
        System.out.println(word);
// In this  answer no. ' 4 ' this ' indexOf ' String method can also be used to detect any string/substring/char in the given String
        //like here we have tried to detect the unexisting value which is "  " i.e. double spaces and "   " i.e three spaces
        // .So in the output it is showing -1 which means that the value doesnot exist in the Source string which is ' S ' named variable String...


        System.out.println("answer no  5");
        String Ram = "Dear Harry , \n\t the JAVA course is nice \t\n  Thanks " ;

        System.out.println(Ram.toUpperCase());



    }
}



