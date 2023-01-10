package practice.practiceDTNT;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {
        /*
        kullanicidan gün alin
        eger gun cuma ise "müslumanlar icin Mübarek Gün"
        eger gün cumartesi ise "Yahudiler icin Kutsal Gün"
        eger gün pazar ise "hristiyanlar  icin Kutsal Gün"
        yazdiran kodu olusturunuz
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen gün ismi giriniz");
       String gün = input.next().toLowerCase();

       if (gün.equals("cuma")){
           System.out.println("müslumanlar icin Mübarek Gün");

       } else if (gün.equals("cumartesi")) {
           System.out.println("Yahudiler icin Kutsal Gün");

       } else if (gün.equals("pazar")) {
           System.out.println("Hristiyanlar icin kutsal gün");

       }else{
           System.out.println("Kutsal gün degil");
       }

    }

}
