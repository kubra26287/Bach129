package day03scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
        //alanini hesaplayiniz
        //cevresini hesaplayiniz

        Scanner input = new Scanner(System.in);
        System.out.println("dikdortgenin kisa kenar uzunlugunu giriniz");
        double shortSide = input.nextDouble();
        System.out.println("dikdortgenin uzun kenar uzunlugunu giriniz");
        double longSide = input.nextDouble();

        System.out.println("Alan =" +(shortSide * longSide));
        System.out.println("Cevre =" +(2*shortSide + 2*longSide));
    }
}
