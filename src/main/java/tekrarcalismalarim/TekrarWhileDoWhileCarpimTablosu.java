package tekrarcalismalarim;

import java.util.Scanner;

public class TekrarWhileDoWhileCarpimTablosu {
    public static void main(String[] args) {
      /*  CARPIM TABLOSU YAZDIRMA KODU
        Example kullanicinin verdigi sayi icin carpim taplosunu olusturup console a yazdirin kodu yazdiriniz
        3==> 3x1=3 3x2=6 3x3=9...... yukaridan asagiya
        3 KULLANICIDAN GELEN
        "X" VE "=" SABIT
        1 2 3 ARTARAK DEGISEN
        SONUC 3X2 (kullanicidan gelen num*i ) NIN SONUCU OLARAK YAZDIRICAK
         */
        Scanner input =new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        int num = input.nextInt();

        int sayi =1 ;


        while (sayi<11){
            System.out.println(num +"*"+ sayi +"= "+(num*sayi));

            sayi++;
        }






    }//main

}

