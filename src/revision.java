package com.mycompony.src;

public class revision {
    public static void main(String[] args) {


        System.out.println( "This also is the Conditional statements");
        int a =  3;
        float b = 1.0f;
        float v = (a<b)? 5 : 8;// y will be 20 because x > 5, inline if-else
        System.out.println(v);

        System.out.println( "This is the format specifier");
        System.out.format("The numbers are %d & %f%n",a,b);
         // Try to use the format specifier %n for getting new line instead of \n
        // .As this is platform independent to use

 int [] number = new int[5];
 number [3]= 2;
 number [2]= 1;
        System.out.println("The length is " + number.length);
        System.out.printf( "The numbers are %d%n & \n %d" ,number[3],number[2]);

        System.out.println("Multi-dimensional Array-Listen the Song 'My heart will go on' ");

       // Declaration and initialization at the same time
        int [][] arr = {
                {2,3},
                {4,2},
                {5,6},
                {10,4}
        };
       // Retrieving the values
        System.out.println(arr[0][1] );
        System.out.println(arr[1][1] );
        System.out.println(arr[1][0] );
        System.out.println(arr[0][0] );
        System.out.println(arr[3][0] );

        // declaration first then initialization

        int [][] arr2 = new int [3][3]; // declared , and here [3][3] means that 3 dabe 2 dimensions me khali chhod diye gaye h
        //isliye isme 0 se start karne par index ko, ye sirf 2 tak hi jayega kyuki , 0 se start karne par 2 tak 3 dabbe bhar jaate h

        arr2 [0][2] = 3;
        arr2 [2][2] = 4;
        arr2 [1][2] = 2;
        arr2 [0][2] = 34;
        arr2 [2][1] = 9;  //initialised

        System.out.println(arr2 [0][2]);
        System.out.println(arr2 [2][2]);
        System.out.println(arr2 [1][2]);
        System.out.println(arr2 [0][2]);
        System.out.println(arr2 [2][1]);

        char [][] charac = {
                {'a','b'},
                {'c','d'},
                {'e','f'}
        };

        System.out.println("Printing 2D arrays: ");
        for(int i = 0; i<charac.length; i++){
            for (int j = 0; j< charac[i].length; j++){
                System.out.print(charac[i][j]);
            }
            System.out.println();
        }

       // designed jagged arrays to print values in Triangular shape.
        charac[0] = new char[1];// Jagged array
        charac[1] = new char[2];// Jagged array
        charac[2] = new char[3];// Jagged array

        charac[0][0] = 'a';
        charac[1][0] = 'b';
        charac[1][1] = 'c';
        charac[2][0] = 'd';
        charac[2][1] = 'e';
        charac[2][2] = 'f';

        System.out.println("Printing jagged arrays: ");
        for(int i = 0; i<charac.length; i++){
            for (int j = 0; j< charac[i].length; j++){
                System.out.print(charac[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The length of 2d array in row wise , (The no. of rows in the array is) : " +charac.length);
        System.out.println("The length of 2d array in column wise or the no. of columns at each row is, (Like on the particular subarray or row,  how many columns are there) : " +charac[2].length); // this means that, on row index 2, how many columns are there or how many elements are there... or what is the length of the row whose index no. is 2

    }
}
