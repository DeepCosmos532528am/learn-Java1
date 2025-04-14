package com.mycompony.src;

import java.util.Scanner;
public class CWH_23_For_Loops {
    public static void main(String[] args) {
        //
        Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
//int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print("\uD83E\uDD13*");
             //  System.out.println("    ");
//                System.out.print("");444
            }
            System.out.println("check");
        /*   do{
               System.out.print("check");
               k++;
           }while(k<n);*/
            // abh ihaa pe dekho dost
            //confusion hogya tha ki iss wale book marked part ko run karne par
            // pehle chaar ke baad aur fir teen ke baad character 1 tabspace se aage kyu jaa rhe the!!
            // isliye humne kya kiya h abhi samjhne ke liye  Outer loop me '\t' ki jagah check dala h aesa isliye kiya kyuki
            // tabspace milta h tab hame samjh nhi aata ki yhaa pe bhi kucch h isliye humne '\t' ki jagah "check" dala h taaki clear ho sake confusion.
            // Toh yaar jo mene starting me btaya isme wahi problem aa rhi thi aur hum confusion se ghir gye fir thoda chat gpt ki sahayata se
            // aur kucch apne dimaage se ye saara funda samjh gya m . Toh bhai isme 'println' & sirf 'print' ka bhi kaafi yogdaan hota
            // .Toh dekho bhai jab outer loop me dala hua "check" ko cantrol jab execute kar leta h mtlb wo samjh gya ki ab usse "check" print karna h . Itna toh
            // clear h . Ab bhai agr iss me sirf  'print' hi likha ho without 'ln' then this mean ki aage ab jo bhi cheez print hogi usko hume dusri line se nhi balki ussi line se hi print karna h
            // jo bhi likha h uske aage se , in this case "check" is here ab jo bhi print hoga wo check ke aage se hi print hoga
            // firr chahe wo agli likhi hui cheez ek baar loop ke end ho jaane ke baad firr se loop ko repeat karte waqt  hi kyu na aa rhi ho, arre bhai itna toh chhodo wo cheez bhale hi loop repeating ke time pe
            // Outer hi nhi, bhale hi  firr se Inner loop me hi kyu na ho ,,. outer loop ho ya inner loop  No Matter !! Usko bas wahi se "check" waali jagah ke aage se hi print karna mangta h uss aage wali likhi hui cheez ko, aur wo karega bhi wahi se print
            // par ha dhyan rakhna ki cantrol  jo bhi agli likhi hui cheeez dekhega wo agli sabse pehli agli cheez hi hogi ,kyuki cantrol sabse pehle milne wali agli cheez ko hi dekhega aur print karega ,mtlb jese ki yha pe "check" h ab check ke bilkul baad jo bhi kucch aa rha , bhale hi kahi se bhi aa rha ho chalega lekin baat itni si
            // h ki wo sirf bilkul agle waale ko dekhega aur firr uss agle waale ke agle se mtlb 2nd waale agle se wo firr se new line ko le lega aur firr jo bhi 2nd number wali agli cheez ko print karna hoga wo new se hi print hoga starting se , I Hope You Got It!!
            // lekin agr "println" lag gya toh firr kucch bhi kahi se bhi print karna ho wo new line se hi start karega ,chahe wo pehli agli cheez ho ya dusri agli cheez ,koi matlb nhi ,wo new line hi uthayega
      // ha at last ab agr aapko iss problem ke darshan karne ho toh aapko kucch steps lene honge wo h ki aapko sabse pehle "check" me println me se ln ko hata  dena h aur inner loop me ln laga dena h bas

        }

        for (int I = 0 ; I < 5 ; I++){
            System.out.print(I);

        }
        System.out.print("\n\t");

          for (int I = 0 ; I < 5 ; I++){
            System.out.print(I);

        }
        System.out.print("\n\t\t");

          for (int I = 0 ; I < 5 ; I++){
            System.out.print(I);

        }
        System.out.print("\n\t\t\t");

          for (int I = 0 ; I < 5 ; I++){
            System.out.print(I);

        }
        System.out.print("\n\t\t\t\t");

          for (int I = 0 ; I < 5 ; I++){
            System.out.print(I);

        }
        System.out.println("\n\t\t\t\t\t");


        for (int i = 0 ; i<=4; i++){
            for (int j = 0; j <= i  ;j  ++ ){
                System.out.print("* ");
                //   System.out.print(i);
            }
            System.out.println();

        }
        for (int i = 4; i >=0; i--)
        {
            for (int j = 0; j<=i ; j++)
            {
                System.out.print("* " );
            }
            System.out.println();
        }


    }

    }
    





































