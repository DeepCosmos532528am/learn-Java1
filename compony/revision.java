public class revision {
    public static void main(String[] args) {


        System.out.println( "This also is the Conditional statements");
        int a =  3;
        float b = 1.0f;
        float v = (a<b)? 5 : 8;// y will be 20 because x > 5
        System.out.println(v);

        System.out.println( "This is the format specifier");
        System.out.format("The numbers are %d & %f%n",a,b);
         // Try to use the format specifier %n for getting new line instead of /n
        // .As this is platform independent to use

 int [] number = new int[5];
 number [3]= 2;
 number [2]= 1;
        System.out.println("The length is " + number.length);
        System.out.printf( "The numbers are %d%n & \n %d" ,number[3],number[2]);

        System.out.println("Multi-dimensional Array-Listen the Song 'My heart will go on' ");

       // Declaration and initializationa at the same time
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
    }
}
