package tekrarcalismalarim;

import java.util.Scanner;

 public class TekrarForLoopWhileLoop {


    public static void main(String[] args) {
        // 1)i)3den 10a kadar tam sayilari konsola yazdirin.(C06_WhileLoop01)
        // ii)23'den 12'yw kadar tam sayilari console' a yazdiriniz(C07_WhileLoop02)


        int sayi =3;

        while (sayi<11){
            System.out.print(+sayi+" " );

            sayi++;
        }

        System.out.println();
 /*        2)         *
                     * *
                    *   *
                   *     *
                  * * * * *
        Satir sayisini kullanicidan alarak yukaridaki sekli yazdiriniz (C08_NestedLoop


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen satir sayisini giriniz");
        int row = input.nextInt();
        System.out.println("Lütfen sutun sayisini giriniz");
        int column = input.nextInt();
 */

 /*  3)  Verilen bir tamsayinin rakamlari toplamini console'a yazdiran kodu yaziniz.(C08_WhileLoop03)

        int tamsayi= -456;
        tamsayi= Math.abs(tamsayi);
        int sum = 0;

        while (tamsayi>0){
            sum+= tamsayi%10;

            tamsayi/=10;

        }
         System.out.println(sum);
 */
 //       4)Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz.(C01_WhileLoop)

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen carpim tablosu icin bir sayi giriniz");
        int num = input.nextInt();

        int result = 1;

        for (int i =1; i < 11; i++) {
            result = num*i;
            System.out.println(num+ "*" +i+ "=" +result);
            }



 //       5)Verilen bir string de her harfin sonrasina "*" sembolu ekleyiniz.(C02_WhileLoop
 //           Java==> J*a*v*a
  //      Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String word = input.nextLine();
        String newword = "";

        for (int i =0; i <word.length()-1 ; i++) {
            newword += word.charAt(i) + "*";
        }
            for (int j =word.length()-1; j <word.length() ; j++) {
                newword += word.charAt(j);

            }


        System.out.print(newword);
        System.out.println();

    /*    6) Kullanicidan bir tamsayi aliniz.
        Tam sayi 100'den kücük ise kullaniciya kaybettiniz mesaji vererek oyunu sonlandiriniz.
        Tam sayi 100 ve 100'den büyük ise "Kazandiniz" mesaji vererek oyuna devam ettiriniz.  (C04_DoWhileLoop01)
    */
        int say= 0;

       do {
           System.out.println("lütfen bir sayi giriniz");
           say = input.nextInt();

               if (say>=100) {
                   System.out.println("kazandiniz");
               }


       }while (say>=100);
            System.out.println("kaybettiniz");


    }//main
}