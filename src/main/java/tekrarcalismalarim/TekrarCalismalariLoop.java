package tekrarcalismalarim;

import java.util.Scanner;

public class TekrarCalismalariLoop {
    public static void main(String[] args) {
        /*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String satz = input.nextLine();

        System.out.println("Lütfen bir harf giriniz");
        char ch = input.next().charAt(0);
        int tane = 0;
       for (int i = 0; i<satz.length();i++){
           if (ch==satz.charAt(i)){
               tane++;
           }


        }
        System.out.println("Girdiginiz cumlede " + ch + " harfi " + tane + " kere kullanilmis." );




    }
}
