package com.compony;

public class TypeCasting {
    public static void main(String [] args ){
        char c = 'a';
        System.out.println(c);
        char character0 = 2353;
        System.out.println(character0);
        char character1 = 65535;
        System.out.println("The character at last value of teh character range is : " + character1);
        int charvalue = character1;  // (Implicit Casting)
        System.out.println("The value of last character of char range is : " + charvalue);

        // There is mainly two types of casting in java:
        // First is implicit casting - when smaller data type is assigned into bigger data type
        //Implicit (Automatically done by java) , (no need to be done manually ,by programmer)

        int i = Integer.MAX_VALUE;
        float f = i; // automatically allowed... (Implicit ) (widening)
        long l =  i; // automatically done by java (Implicit)
        System.out.printf("First one is implicit casting : %f and %d\n",f , l );


        // Second is explicit casting - when larger data type is assigned into smaller data type
        //explicit , (needed to be done manually ,by programmer when needed)

       // int i1 = f; // Not allowed , will throw compile time error
        int i1 = (int) f ; // Manually done by me (Programmer)
       int i2 = (int) l; // Similarly it will also work fine now (explicit casting ) narrowing
        System.out.printf("Second is explicit casting : %d and %d\n",i1 , i2 );

       // One more example
       float f1 = 2.3f;
        int i3 = (int) f1; //(explicit)
        System.out.printf("Third is explicit casting : %d", i3 );

    }
}
