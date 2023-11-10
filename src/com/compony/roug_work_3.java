package com.compony;

import java.util.Scanner;

public class roug_work_3 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner (System.in);


        int  ssum = sc.nextInt() ;
        System.out.print(" + ");
        int ssum1 = sc.nextInt() ;
        System.out.print(" - ");
        int ssum2 = sc.nextInt();
        System.out.print(" = ");
        System.out.println(ssum + " + " + ssum1 + " - " + ssum2 );
        int ssum3 = ssum + ssum1 - ssum2;
        System.out.println(ssum3);

        System.out.println("Ist rectangular Pattern ");
        for(int i = 1 ; i <= 5; ++i)
        {
            for(int j = 1 ; j <= 5; j++)
            {
                System.out.print("* ");

            }
            System.out.println("");

        }


        System.out.println("IInd rectangular Pattern");

        for(int i = 0 ; i < 5; ++i)
        {
            for(int j = 0 ; j < 5 ; j++)
            {


                System.out.print(i + 1 + "      "); // we have printed the i with addition to one here because in the loop we have intialized the integer as o 'zero' but we want the output in non-zero form which means the rectangular pattern should  start from the number 1 ,So we have put '+1 ' in addition to ' i ' we can also make the changes in loop , like we can put 1 instead of zero and in condition section we will put there  ' <= ' instead of only '< '  .As we can see in the output, there no any zero we can see , remember it is not compulsory to print only one in the pattern . we have done this thing just to match the pattern only, if you want then can use any number that you want to print

            }
            System.out.println("");

        }
        System.out.println("IIIrd rectangular Pattern");
        for (int  i = 1 ; i <= 5 ; i++)
        {
          for (int j = 1 ; j <=  5; j++)
          {

              System.out.print(j + " ");
          }
            System.out.println();
        }

        System.out.println(" My method no. 1 of IVth rectangular Pattern");
        for (int  i = 1 ; i <= 1 ; i++)


        {   for (int  j = 1 ; i <= 5 ; i++)
        {
            System.out.print("*    ");
        }


            System.out.print("\n");
            for (int j = 2; j < 5 ; j++ )
            {
                System.out.print("*                     *");

                System.out.println();
            }



            for (int  j = 1 ; j <= 5 ; j++)
                System.out.print("*    ");

        }
        System.out.println();
        System.out.println(" MY Method no. 2 of IVth one");

        for (int i = 1 ; i <= 5; i++){
            if (i == 1 || i == 5){
                for (int jj = 1 ; jj <= 5; jj++){
                System.out.print("*    ");
            }}else  if (i == 2){
                System.out.print("*                     *");
            } else if (i == 3 ) {
                System.out.print("*                     *");
            }else if (i == 4 ) {
                System.out.print("*                     *");
            }
            System.out.println();
        }




/*  Isse m baad me dekhunga , thoda samjhne me galti ho rhi h, iske output se meri understanding thodi taal mel nhi khaa rhi . Baaki koi na simple h aa jaayega samjh me . Baaki m aaj ( 15/9/2023 ) 2 : 06 AM boht khush hu ki mene pattern number IVth ko 2 tareeko se solve kar ke dikhaya bina kisi ki help liye siwaye mere dimaag aur guru, mata- pita aur ishwar ki kripa se unhi ke aashirvaad ka ye kamaal h Thank you Krishna ji .JAI SHRI RAM
/* aur ek prblm iske neeche bhi h usko bhi dekhna h mujhe , mene hi khud usko complicated sa kar liya h loop me if- else fir uss me bhi loop khachar - pachar sa kar liya h , chalo baad me dekhta hu
        */System.out.println(" youtube");
        for (int i = 0 ;i < 5; i++)
        {
            for (int j = 0; j < 5 ; j++)
            {
                if (i == 0 || i == 4|| j == 0 || j == 4  )
                {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }

        // yha pe dekho bhai confusion ho sakta h ki star 5 kese print ho rhe h ek saath
                    //toh wo aese ho rhe h ki inner loop ke andar if-else conditionals dala hua h aur uski apni 4 conditions bhi dali hui h
                    // .Jab control outer loop se i ki value true karke inner loop me enter karga tab wo inner loop ko bhi true karke entry lega
                   /* kyuki jese i ki value outer loop me condition (i<5) ko satisfy kar hi thi wese hi inner loop me bhi j ki (j<5) ko satisfy kar rhi h
                        ab itna karke cantrol entry marega if-else ke andar if-else me toh hum dekh hi skate h ki 4 condition h .aur agr cantrol
                        inn 4 conditions me se kisi ek ko bhi satisfy kar rha hoga toh *(asterisk) print hoga nhi toh else Print hoga
                        ab dhyan se dekho yha pe jab inner loop me j ki value 0 (zero) h .Aur jab  cantrol ne j ki value 5 se kam hone ke kaaran condition ko pass kiya
                    if - else pe baari aayi aur jab yha pe bhi condition satisfy ho gayi toh humara *(asterisk) print ho gya
                ab hum itna toh jaante hi h ki cantrol ek baar inner loop me enter hogya toh wo inner loop ko pura nipta ke mtlb poori tarah se condition ko satisfy karke mtlb  increment decrement karke
                        tab firr se outer loop ke paas loutega aur uske baad agin wo  inner loop k pass loutega aur fir if-else .Yhi process repeat hoti rahegi jab tk ki condition false nhi ho jaati
                // ab yaar prashn ye h ki if else inner loop me h aur inner loop me j ki value sirf 2 baar hi aesi banti jab wo if else me if ko mtlb * ko print karegi firr bhi wo 5 * kese print kar de rhi h !!
                    toh iska answer simple h ,aesa isliye ho rha h kyuki if else me jo conditions h un chaaro conditions ke beech me || laga hua h aur unn if else ki  conditions me ek condition i ki value bhi present h
,,. Ab bhale hi jab cantrol inner loop me ghumta h tab bhale hi j ki value 1, 2, 3 ho jaa rhi ho , jo ki else ko print karne ki values h according to those 4 conditions that we have provided in if else to decided whether to print if or to print else lekin firr bhi yha pe 1,2,3 conditions ho jaane par j ki if part hi print ho rha h jabki honi chahiye else kyuki ye conditions if ko satisfy nhi karti
                        Ab aesa i ki value ke kaaran ho rha h jo ki outer loop me intialize hui h . bro jo humara control chal rha h wo jese hi inner loop me intery karge toh wo i ki value ke saath entry karega , aur dhayn dijiye inner loop me j ki 0 to 5  tak value change bhale ho rhi h parantu sahab i ki value toh unn sabhi pancho hi j ki values ke cases me same hi rahegi  aur wo h i == 0 , aur yha pe hame ptaa h ki inner loop ki chaaro conditions me ek condition i ki bhi h
                        bas isiliye ye 5 baar * (asterisk ) ko print kar rha h */

for (int i = 0 ; i<5; i++){
    for (int j = 0 ; j<=i; j++){
        System.out.print("*");
    }
    System.out.println();
}
for (int i = 0 ; i<5; i++){
    if (i==0){
        System.out.print("         "); //humne ye wala equal angle triangle banane ke liye paancho rows me har ek row me stars ke starting hone se pehle odd numbers digit ke anusaar space chhodi h aur wo bhi decending order me . jese ki pehle row me 9 fir doosre me 7 fir teesre me 5 fir 3 fir aur last me 1
    }else if (i==1){
        System.out.print("       ");
    }else if (i == 2){
        System.out.print("     ");
    }else if(i==3){
        System.out.print("   ");
    }else {
        System.out.print(" ");
    }
    for (int j = 0 ; j<=i; j++){
        System.out.print("*   ");
    }
    System.out.println();
}






/*
        for (int i = 1 ; i <=5 ; i++ )
        {
            if (i == 1 || i==5)
            { for (int j = 1 ; i <= 5 ; i ++)
            {
                System.out.print("*    ");
            }
            }else
            {
                System.out.print("*                   *");
            }
            System.out.println();

        }
*/

    }
}
