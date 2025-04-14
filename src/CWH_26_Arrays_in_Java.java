package com.mycompony.src;

import java.util.Random;
import java.util.Scanner;

public class CWH_26_Arrays_in_Java {

    public static void main(String[] args) {
Random r= new Random();
Scanner sc = new Scanner (System.in);
//Ways to make an array
        //First Array Method


        //Note:: The values which are assigned into the blocks are called elements


        int[] marks = new int[5]; // yha pe 5 btaa rha h ki aap 5 starting se mtlb index number zero '0' se blocks use kar sakte ho aur index number 4 tak ke blocks ko use kar sakte kyuki isme counting index no. zero se start hoti h toh blocks ke index number ki range ko hum yha pe jo number (5) likha h usse (n-1) ke form me hi put karenge ,ha hum aesa zaroor kar sakte h ke blocks ke  index number ke  sequence ko  upar - neeche kar sakte h lekin index number ki range exact hi rahegi uss range ke andar aur uss range tak hi hum blocks ko bnaa sakte h usse upar nhi . ERROR aayega , agr yha pe hum 5 ki jagah 7 karde toh range (n-1) ke according 6 tak jaayegi kyuki 0 se 6 tak counting karne par 7 blocks used ho chuke honge , index number ke 0 se counting hone ke kaaran blocks ke index number bhi range ke index number se 1 index peeche hi rehta h  ,for e.g. here 5 is the range index no. but the blocks index number is used till 4 only
        marks[0] = 23;
        marks[1] = 34;
        marks[2] = 33;
        marks[3] = 45;
        marks[4] = 56;
        System.out.println(marks[0]+marks[1]+marks[3]);
        //Now we can print the value or value's' of any of the block or block's' listed above   also we can perform any operation like airthmetic , logical, comparison e.t.c with all these
        System.out.println("for e.g. -> Suppose we print the value 3rd index which is marks[2] :"+  marks[2] );
        System.out.println("for e.g. -> Airthemetic Operation:  "+ (marks[0] + marks[1] + marks[3]) ); // one more think to be keep in mind is that ,when we will needed to add some statement in the same method in which we are performing some operation with the blocks values then this is compulsory to put the overall operation in one parenthesis  separately for adding or doing any operation on   the values of blocks,, now if the operation is free means if there is no any statement present in the same print method  in which the operation is to be performed then we can perform the operation without putting it into the parenthsis , for this thing we can see the above same operation which is performed without the statement ,there no any parenthesis is needed to be put
// Here without the parenthesis it will print the same values ,as intialized into the blocks ,

        // Second method

        //Note:: The values which are assigned into the blocks are called elements


         int [] MArks ;              //  The way of writing this part
         MArks = new int [5];//Only has been changed... rest is same
        marks[0] = 23;
        marks[1] = 34;
        marks[2] = 33;
        marks[3] = 45;
        marks[4] = 56;

        System.out.println(marks[0]+marks[1]+marks[3]);
        //Now we can print the value or value's' of any of the block or block's' listed above   also we can perform any operation like airthmetic , logical, comparison e.t.c with all these
        System.out.println("for e.g. -> Suppose we print the value 3rd index which is marks[2] :"+  marks[2] );
        System.out.println("for e.g. -> Airthemetic Operation:  "+ (marks[0] + marks[1] + marks[3]) ); // one more think to be keep in mind is that ,when we will needed to add some statement in the same method in which we are performing some operation with the blocks values then this is compulsory to put the overall operation in one parenthesis  separately for adding or doing any operation on   the values of blocks,, now if the operation is free means if there is no any statement present in the same print method  in which the operation is to be performed then we can perform the operation without putting it into the parenthsis , for this thing we can see the above same operation which is performed without the statement ,there no any parenthesis is needed to be put
// Here without the parenthesis it will print the same values ,as intialized into the blocks ,

        // Third method

        //Note:: The values which are assigned into the blocks are called elements

        int [] MArkS = {21, 32 , 33 , 24 ,45}; // Here in this method  no need to write the Range index no. it will automatically detect the range by counting the values which will be put inside the curl-braces
      // here separately declaration of  the blocks and intialization of the values is not needed , these both the things have been happened automatically on putting the values in to the curl- braces above

      // Rest printing part is same for all the three methods
        System.out.println(marks[0]+marks[1]+marks[3]);
        //Now we can print the value or value's' of any of the block or block's' listed above   also we can perform any operation like airthmetic , logical, comparison e.t.c with all these
        System.out.println("for e.g. -> Suppose we print the value 3rd index which is marks[2] :"+  marks[2] );
        System.out.println("for e.g. -> Airthemetic Operation:  "+ (marks[0] + marks[1] + marks[3]) ); // one more think to be keep in mind is that ,when we will needed to add some statement in the same method in which we are performing some operation with the blocks values then this is compulsory to put the overall operation in one parenthesis  separately for adding or doing any operation on   the values of blocks,, now if the operation is free means if there is no any statement present in the same print method  in which the operation is to be performed then we can perform the operation without putting it into the parenthsis , for this thing we can see the above same operation which is performed without the statement ,there no any parenthesis is needed to be put
// Here without the parenthesis it will print the same values ,as intialized into the blocks ,
// Note:: The values which are assigned into the blocks are called elements




      // General experiments and practice on Arrays ;
        for(int i = 0; i<5; i++) {

            int num = r.nextInt(5);
            System.out.println(num);
    int[] marks1 = new int[5];
    marks1[num] = 23;
    marks1[num] = 34;
    marks1[num] = 33;
    marks1[num] = 45;
    marks1[num] = 56;

    System.out.println(marks1[num]);

}
    }
}
