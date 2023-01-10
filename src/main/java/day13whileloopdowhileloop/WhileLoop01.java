package day13whileloopdowhileloop;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {
        /*
        CARPIM TABLOSU YAZDIRMA KODU
        Example kullanicinin verdigi sayi icin carpim taplosunu olusturup console a yazdirin kodu yazdiriniz
        3==> 3x1=3 3x2=6 3x3=9...... yukaridan asagiya
         3 KULLANICIDAN GELEN
         "X" VE "=" SABIT
         1 2 3 ARTARAK DEGISEN
         SONUC 3X2 (kullanicidan gelen num*i ) NIN SONUCU OLARAK YAZDIRICAK
         */
        Scanner input =  new Scanner(System.in);
        System.out.println("lutfen carpim tablosunu görmek icin bir sayi giriniz");
        double num = input.nextDouble();

        int i = 1;

        while (i<11){
            System.out.println(num + "*" + i + "=" + (num*i) );

            i++;
        }

        //Example 2 :verilen bir string de her harfin sonrasina * sembolunu ekleyiniz
        // java ==> J*A*V*A*

        System.out.println("bir kelime giriniz");
       String word = input.next();
       String newWord = "";//ortaya cikan yeni degeri bu Stringin icine koymamiz gerekir
                            //bu yuzden bos bir String olustururuz
                            //yazdirirken bu variable in ismini kullaniriz

       int k = 0;

       while (k<word.length()) {

           newWord = newWord + word.charAt(k) + "*";

           k++;
       }
        System.out.println(newWord);





















    }
}
