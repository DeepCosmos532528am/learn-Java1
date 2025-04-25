package com.compony;
public class CWH_34_Recursion {
    static int factorial(int s ) {

        System.out.println(s);
    if(s==1){
        return s+1;
    }else{
        return factorial(s-1);
    }


    }

    public static void main(String[] args) {



int a = factorial(5);
        System.out.println(a);
    }
}

