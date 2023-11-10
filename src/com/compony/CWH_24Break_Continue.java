package com.compony;
import java.util.Scanner;


public class CWH_24Break_Continue {
            public static void main(String [] args) {
Scanner sc  = new Scanner (System.in) ;
                int even = sc.nextInt();
                int tt = 0;

                    while (even   <= 25) {
                        System.out.println(even + "its even ,automation is started ");  even++;
                        if (even == 16) {
                            System.out.println("the 16 entered bro ");
                            continue ;

                    }

                }

            }
}