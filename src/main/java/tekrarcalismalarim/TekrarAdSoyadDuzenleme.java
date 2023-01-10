package tekrarcalismalarim;

import java.util.Scanner;

public class TekrarAdSoyadDuzenleme {
    public static void main(String[] args) {
        //Example Kllanicidan tek seferde alacaginiz iki kelimelik ad soyadi iki ayri kelimeye ayiriniz
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen adinizi ve soyadinizi arada bosluk olacak sekilde giriniz ");
        String adSoyad = input.nextLine().replaceAll("[^A-Za-z ]","").replaceAll("\\s+"," ").trim().toLowerCase();
        System.out.println("ad soyad : "+adSoyad);
        String ilkAd = adSoyad.split(" ")[0];
        String soyAd = adSoyad.split(" ")[1];
        String ilkHarf = ilkAd.substring(0,1).toUpperCase();
        String soyAdilkHarf = soyAd.substring(0,1).toUpperCase();
        System.out.println(ilkHarf);

        String adFormat = ilkHarf+ilkAd.substring(1);
        String soyAdFormat = soyAdilkHarf + soyAd.substring(1);
        System.out.println("ad :"+adFormat);
        System.out.println("soyAd : "+soyAdFormat);
















    }
}
