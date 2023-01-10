package tekrarcalismalarim;

import java.util.Scanner;

public class TernaryTekrar {
    public static void main(String[] args) {

        //Example 2 : Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
        //               -4 ==> -1 * -4     4 ==> 4     0 ==> 0
        // sayi sifirdan kucukse -1 ile carp degilse dokunma


        int sayi = -1;
        int result = sayi<0 ? sayi*-1 : sayi;
        System.out.println(result);

        int num = 2;
        int result1 = num<0 ? num*-1 : num;
        System.out.println(result1);

        //Example 3: iki sayinin isareti ayni ise bu sayilari carpan
        //isaretleri farkli ise "farkli isaretli sayilari carpmiyorum" mesaji veren kodu yaziniz
         int num1 = 2;
         int num2 = 3;
        Object result2 = num1>0 && num2>0 ? num1*num2 : "farkli Isaretli sayilari carpamiyorum";
        System.out.println(result2);

        //Example 4 : size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz
        int p = -345;
        int r = Math.abs(p);
        String say =r>99 && r<1000 ? p + "uc basamakli" : p + "uc basamakli degil";
        System.out.println(say);


        //Example 1:
        //verilen yilin artik yil(Leap year) olup olmadigini kontrol eden kod
        // 1 yil 100 e bölünürse 400 e de bölünmelidir  1600 ==> Leap  1800 Leap degil
        //yil 100 e bolunmuyorsa 4 e bölünmelidir 2004 ==> Leap 2005==> Leap degil

        int y = 1900;
       String result3 = y%100==0 ? (y%400==0 ? "Leap": "Leap degil") : (y%4==0 ? "Leap" : "Leap degil");













    }//main

}
