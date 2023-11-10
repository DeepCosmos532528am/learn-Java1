

package com.compony;

import java.util.Scanner;

    public class Try{
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println(" Counting the No. of Occurence time of the Char or String type values in the ARRAY ");
            int repeat = 0;
            //Logics starts From here
while (repeat < 7){
            char char1 = sc.next().charAt(0);

            char[] char2 = {'a', 'b', 'd', 'f', 'b', 'd', 'g', 'h', 'a', 'g', 'j', 'h', 'a', 'b', 'f', 'j', 'x', 'z', 'z', 'x'};
            int i2 = 0;
            for (char tchar2 : char2) {


                if (tchar2 == char1) {


                    i2++;
                }
            }
            System.out.println(i2);

repeat++;
        }



        }
    }

