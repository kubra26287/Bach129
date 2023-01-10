package day05typecastingstringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {
        /* Example 1 : asagidaki kurallara gore kullanicinin girdigi passwordu kontrol ediniz
        1 en az sekiz character olsun
        2 space characteri passwordde olmasin
        3 3en az bir tane buyuk harf olsun
        4 en az bir tane kucuk harf olsun
        5 en az bir tane sembol olsun
        6 en az bir tane rakam olsn

      */

        Scanner input = new Scanner (System.in);
        System.out.println("lutfen passwordunuzu giriniz");
        String pwd = input.nextLine();

        //en az 8 character olsun
        boolean first = pwd.length()>7;
        System.out.println(first);

        // 2 space characteri passwordde olmasin
       boolean second = !pwd.contains(" "); // "!" isareti olumsuz anlamda kullanilir.
        System.out.println(second);

        //en az bir tane buyuk harf olsun
        // note : Buyuk harf olmayanlari sil
        // kalan character sayisina bak
        //character sayisi 0 ise buyuk harf yok demektir
        //sifirdan buyuk ise buyuk harf var demektir.
       boolean third =  pwd.replaceAll("[^A-Z]","").length()>0; // parantez ici buyuk harf olmayanlari sil demek
        //method lari ayni satirda yan yana kullanmaya method chain denir
        System.out.println(third);

        //4 en az bir tane kucuk harf olsun
        boolean fourth = pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println(fourth);

        //5 en az bir tane sembol(harf ve rakam harici hersey) olsun
        boolean fifth = pwd.replaceAll("[a-zA-Z0-9]","").length()>0;
        System.out.println(fifth);

        //6 en az bir tane rakam olsn
        boolean sixth = pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println(sixth);

        System.out.println("password gecerli mi? " +(first && second && third && fourth && fifth && sixth));



    }
}
