package practice.practiceDTNT;

import java.util.Scanner;

public class C01_ForLoopCdenOncekiA {
    public static void main(String[] args) {
         /*
   Kullanıcıdan aldığınız 'c' ve 'a' iceren bir String değer içerisindeki
'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.

*/
        
       Scanner input = new Scanner(System.in);
        System.out.println("Lütfen a ve c yi iceren bir kelime giriniz");
        String d = input.next().toLowerCase();
        int sayac = 0;
if (d.contains("a") && d.contains("c")) {


    for (int i = 0; i < d.length(); i++) {

        if (d.charAt(i) == 'a') {
            sayac++;
        } else if (d.charAt(i) == 'c') {

        }
    }
    System.out.println("c den önceki a sayisi :" + sayac);
}else {
    System.out.println("Lütfen a ve c harflerini iceren bir kelime giriniz");
}
        
        
        
        
        
        
        
        
        
        
        
    }
}
