package com.mycompony.src;


public class CWH_14_StringMethods {
    public static void main(String[] args) {
        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=
        //ALL THE METHODS LISTED BELOW ARE ONLY and ONLY FOR STRINGS and not for INT, FLOAT,  SHORT or anymore other types of data types
        // first method is [ name.length() ]  this method is used to measure the length of the string
        System.out.println("no. 1 ");

        String s = "sachin sharma";

        int i = "sachin sharma".length();   //method 1
        //System.out.println(i);
        // OR
        int i2 = s.length();
        System.out.println(i2);   //method 2
        //OR
        System.out.println("sachin sharma".length());  //method 3
        //OR
        System.out.println(s.length());  // method 4
        //{{ NOTE : the four diffrent-diffrent types of methods that we have used above and divided them in four diffrent types will be applicable in all the following
        //types of String Methods ,,Actually these all four types of  methods gives us the same output , they are toh just diffrent- diffrent ways to take output
        // we can use any one of them of our choice...


        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        System.out.println("no. 2");
        //Second method is  [ name.trim() ] this method is used to remove unwanted white space from the String
        String s2 = "        sachin sharma      ";
        System.out.println(s2);
        //here we are printing normally  without the trim method ,,so the output will include the white space too


        String S = s2.trim();  // this  will remove the white space from the beginning and from the ending of the string
        System.out.println(S);

        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        System.out.println("no. 3 ");
        //Third method is  [ name.toLowerCase() ] this method is used to convert the string from Upper Case to Lower Case
        String s3 = "SACHIN SHARMA";
        String SS = s3.toLowerCase();
        System.out.println(SS);


        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        System.out.println("no. 4 ");
        // Fourth Method is [ name.toUpperCase() ] this method is used to convert the string from Lower Case to Upper Case
        String s4 = "sachin sharma";
        String SSS = s4.toUpperCase();

        System.out.println(SSS);
        System.out.println(s4.toUpperCase());


        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        System.out.println("no. 5");
        // Fifth Method is [ name.substring( int start ) ] this method is used to determine the String's  starting  point to print the words
        String s5 = "Sachin Sharma ";
        String SSSS = s5.substring(3);
        System.out.println(SSSS);


        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        System.out.println("no. 6 ");
        // Sixth Method is [ name.substring( int start, int ending) ] this method is used to determine the String's starting and ending point to print the words

        String s6 = "sachin sharma jai shree ram ";
        String SSSSS = s6.substring(14, 28);
        // In Strings the first letter will always be considered at the number 0  and second one would always be at 1 .Similarly all the following letters including space like third ,fourth, fifth
        //    will be at 2, 3 and 4 respectively ,,and this sequence will be followed as long as the String Goes...
        System.out.println(SSSSS);

        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        System.out.println("no. 7");
        // Seventh method is [name.replace(target , replacement) ]this method is used to replace a particular word with N-other word
        String s7 = "sachin sharma ";
        String SSSSSS = "Sachin sharma".replace("sharma", "musician");
        System.out.println(SSSSSS);

        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        System.out.println("no. 8 ");
        //Eighth Method is [ name.startsWith() ] it is used to ensure whether the given String is starting with that particular String (word) or not. It can also be checked with a letter instead of any word. But the condition is that we have to put double inverted comma ("  ") for String/word as well as for char/letter
        String s8 = "Sachin";
        Boolean SSSSSSS = s8.startsWith("Sachin");
        System.out.println(SSSSSSS);


        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        System.out.println("no. 9");
        //Ninth Method is [ name.endsWith() ] It is used to ensure whether the given String is ending  with that particular String (word) or not. It can also be checked with a letter instead of any word. But the condition is that we have to put double inverted comma ("  ") for String/word as well as for char/letter

        String s9 = "Sachin ";
        boolean SSSSSSSS = s9.endsWith("n");
        System.out.println(SSSSSSSS);
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        System.out.println("no. 10");
        // Tenth Method is [ name.charAt(int)]  this is used to return any Character and a particular index position
        String s10 = "sachin sharma ";
        char SSSSSSSSS = s9.charAt(1);
        System.out.println(SSSSSSSSS);

        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        System.out.println("no. 11");
        // Eleventh Method is [ name.indexOf ()] this method is used to find the index number of a given string or character (only double inverted comma needed {" "}, single inverted is not compulsorily needed . We can put char as well as any String value in it

        String s11 = "sachin sharma ";
        int ii = s11.lastIndexOf("s");
        System.out.println(ii);


        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        System.out.println("no. 12");
        //  Twelth Method  is  [ name.indexOf() method ko dusre tareeke se upypog karne ka tareeka ] this method starts finding the index of the entered number from the beginning of the String and this method  is used to find the index of  a particular Character
//        Actually,, if there is more than one Character of same type than the java would get confuse and it will always  show the index number of the character that it will find matching with your
//        entered  I think You are Confused!! Wait and see the example below and compare with the above one...  You will Find Your Doubt has been Solved
        String s12 = "sachin sharma";
        int iii = s12.indexOf("s", 3);// here by giving  "FromIndex " we have to told java that "you have to show the index of s but  from index no. 5  . That's why it is showimg us the index no. 7 on running the program.
        System.out.println(iii);

//NOTE// = the java will show the output -1 if the entered substring doesnot exist anywhere in the enterd . It Starts Searching from the beginning of the String
        // or by considering the entered index as the starting point and shows the index of the very first String/character that it finds matching with your entered String or Char value ,


        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        System.out.println("no. 13");
        //Thirteenth method is [name.lastIndexOf() ] this method is used to find the index from last , it starts counting from
        //last


        String s13 = "sachin sharma";
        int iv = s13.lastIndexOf("a");
        System.out.println(iv);


        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        System.out.println("no. 14");
        //Fourteenth Method is [ name.lastIndexOf(" ")  method ko dusre tareeke se upypog karne ka tareeka  ] this method starts
        //searching the entered value from the last of the String and  is used to find the index of a  particular Character from the back side in the case of more than one character of entered type
        // Actually,, if there is more than one Character of same type than the java would get confuse and it will always  show the index number  of the character  that it will find matching with your
//        entered from the back/last  side  I think You are Confused!! Wait and see the example below and compare with the above one...  You will Find Your Doubt has been Solved

        String s14 = "sashin shasma";
        int v = s14.indexOf("s", 3);
        System.out.println(v);

        //  the java will show the output -1 if the entered substring doesnot exist anywhere in the enterd variable . It Starts Searching from the ending of the String or by considering the entered index number
        //   as the very last character/String and shows the index of the string or char that it finds matching with your entered String or Char value ,
        // SOME MORE TO EXPLORE HERE

        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        System.out.println("no. 15");//Fifteenth Method is [ name.equals(" ") ] this method is used to check whether the entered string value is present in the variable or not
        String s15 = "sachin sharma";
        boolean SSSSSSSSSS = s15.equals("sachin sharma");
        System.out.println(SSSSSSSSSS);

        // this method is Case Sensitive method


        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        System.out.println("no. 16");// Sixteenth and the last method is [ name.equalsIgnoreCase( )] this method is used to check whether the entered string value is present in the variable or not .It is same as the above method but the thing that is special in it is nothing but the Non-Sensitivity Of Case
        String s16 = "sachin sharma";
        boolean SSSSSSSSSSS = s16.equalsIgnoreCase("SaChIn ShArma");
        System.out.println(SSSSSSSSSSS);
        // this method is not Case Sensitive method ,,it only focuses on the alphabets instead of also focusing on Cases



        //                 </ Here Our all 16 methods of Strings has now been Finished />



     //   The escape sequence characters

        System.out.println("sachin sharma \nis a good boy ");



    }}

// ROUGH WORK 2 CLASS ME EK ERROR AA RHA H JISME DOUBT AA RHA H  USS DOUBT K0 CLEAR KARNA H STRING VALUE KO PRINT KARNE ME . USSE ZRAA CLEAR KAR LO ZALDI SE