package com.compony;
public class CWH_33_Varargs {
    public static int firstMethod( int a, int b ){
        int total;
         total =  a + b;

        return total ;

    }

    //This type of method becomes available as array so to take multiple values named as arr int [] arr
    public static int multipleadd(int x,int ...arr){//here if we put int x in the first  then also it will be mandatory to assign a value here in it , if not done this then the ERROR will come
      // The int x will be used based upon the need , Basically we will have to mandatorly assign atleast one value here in this case. if not needed then we will only put (int ... arr) and take Multiple values to do any needed operation with the help of only one method ,
      //
        int sum=x;

        for( int a: arr){
        sum += a;
    }
        System.out.println("let us see here " +
                "");

        return sum;


    }

    public static String array(String x, String b   ){
        String name;
                name = "sachin" + x + b;

     return name;
    }

/* public static String array(String ...arr){


     }

     return name;
 }*/
  public static void main(String [] args){
        System.out.println(" Here this is the normal method of any Method:");
        // We will make the object of the class when the method we make are not declared static , otherwise we can directly call the method without creating the object of the class

        int sum = 1;
                sum += firstMethod(3,2);
        System.out.println(sum);



        // Now let's see  what is Varargs! We use Varargs , where we want to add the values multiple times, but we want to define the method only for once.
        // Means when I don't write the multiple methods for each operation , Let's see it


        System.out.println(" here we are adding the numbers 2 or  more than 2");
        System.out.println("The sum of the numbers is : " + multipleadd(8));
        System.out.println(" again doing the same stuff "+ multipleadd(3,1,1,12,2,4,3,2));
//String fullname = "sharma jai";

        System.out.println(" The String value is as follows:  "  +  array("arre yaar","aese") );
        System.out.println( array("sachin ji "," java" ));



    }
}
