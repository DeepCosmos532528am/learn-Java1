       package com.mycompony.src;

      import java.util.Scanner;
       public class  Challenged_problem{
         public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      System.out.println(" Counting the No. of Occurence time of the numeric or integer type values in the ARRAY ");

      int numb1 = sc.nextInt();
      int[] numb2 = {1, 2, 4, 3, 4, 2, 5, 8, 7, 5, 3, 2, 4, 6, 4, 1, 1, 5, 4, 7};
      int i = 0;
      for (int nnumb2 : numb2) {


          //for ( numb1 == nnumb2) {
          if (numb1 == nnumb2)
              i++;


      }
      System.out.println(i);


      System.out.println(" Counting the No. of Occurence time of the Char or String type values in the ARRAY ");

      //Logics starts From here
             for  (int re = 0 ; re <= 7 ; re++) {

                 String char1 = sc.next();

                 char[] char2 = {'a', 'b', 'd', 'f', 'b', 'd', 'g', 'h', 'a', 'g', 'j', 'h', 'a', 'b', 'f', 'j', 'x', 'z', 'z', 'x'};
                 int i2 = 0;
                 for (char cchar2 : char2)


                     if (char1.equals(cchar2))
                         i2++;



                 System.out.println(i2);

             }

    }
}