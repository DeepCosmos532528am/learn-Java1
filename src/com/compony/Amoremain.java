import java.util.Scanner;


public class Amoremain {
    static void galaxy(int x){
         int i =x;

        if ( i<5){
            System.out.println("The number is less then 5");
        }else if(i>5){
            System.out.println("The number is more then 5");
        }else{
            System.out.println("The number is equal to 5");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("THe 1st number");
        int x = sc.nextInt();
        galaxy(x);
System.out.println("THe 2nd number");
        int y = sc.nextInt();
        galaxy(y);
System.out.println("THe 3rd number");
        int z = sc.nextInt();
        galaxy(z);
System.out.println("THe 4th number");
        int w = sc.nextInt();
        galaxy(w);

    }
}
