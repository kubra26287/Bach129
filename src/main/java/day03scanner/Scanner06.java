package day03scanner;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {
    //kullanicidan alacaginiz 5 basamakli
        // bir sayinin ilk iki ve son iki
        // basamagindaki rakamlarin toplamini yazdiran kodu yaziniz
        // bir sayinin son rakamini alabilmek icin o sayiyi 10 a bolun ve kalana bakin
        //bir tam sayiyi bir tam sayiya bölerseniz java sonucu tam sayi yapar.
        //java ondalik kismi iptal eder ama yuvarlama yapmaz ornegin 38761/10=3876.1 burdaki biri almaz

        Scanner input = new Scanner(System.in);
        System.out.println("5 basamakli bir sayi giriniz");


        //son rakami al
        int number = input.nextInt();
        int lastDigit = number%10;
        System.out.println(lastDigit);

        //sondan ikinci rakami al
        int lastSecondDigit = number%10;
        number =number/10;

        //sondan ücüncü rakam
        int lastThirtDigit = number%10;
        //sondan dorduncu
        int lastFourthDigit = number%10;
        number = number/10;
        //sondan besinci rakami
        int lastFifthDigit = number%10;


        System.out.println(lastDigit + lastSecondDigit +  lastFourthDigit + lastFifthDigit );

    }

}
