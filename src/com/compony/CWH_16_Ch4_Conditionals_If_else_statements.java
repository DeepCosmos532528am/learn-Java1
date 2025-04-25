



package com.compony;
import java.util.Scanner;
public class CWH_16_Ch4_Conditionals_If_else_statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // The If - else conditionals
        int i = sc.nextInt();
        int g = sc.nextInt();
        if (i + g == 23 && i == 20) { // yha pe agr  if ke baad jo ( ) me likha uss operation ka output agr true nikal rha ho tab if wale print stream ka statement print hoga aur agr
            // iss operation ka output false hoga tab else ke andar ki print stream ka output print hoga ,aur esaa iss wale me hi nhi hoga
            // esaa hamesha aur har baar hoga jab bhi hum else- if conditionals ka use karenge ,, if - else  conditionals hamesha true /false ke basis pe kaam karte h
            // matlab if ke baad jo parenthesis h usme hume koi esaa hi operation dalna hoga jiska output print hone par true ya false me hi  de
            // agr esaa nhi kiya , aur koi esaa operation daal diya jiska output int, char ya String value h toh if - else conditionals kaam nhi karega aur error dega
            //isliye dhyaan rakhna chahiye ki hume if ( ) ke andar koi esaa operation dalna h jiska output true/false ho...
            System.out.println("this statement is True");
        } else {
            System.out.println("this statement is False");
        }
    }
}