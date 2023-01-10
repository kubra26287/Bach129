package tekrarcalismalarim;

import java.util.Scanner;

public class Tekrarr1 {
    public static void main(String[] args) {
        //kullanicidan alinan sayilarin ilk ve son rakamlarini toplayan kodu yaziniz //456

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
        int tamsayi = input.nextInt();
   //1.yol
       int sonRakam =tamsayi%10;
        System.out.println("sonRakam :"+sonRakam);
       int ilkRakam = tamsayi;

       while(ilkRakam>9){ //bu ilk rakami bulma nethodu
           ilkRakam/=10;

       }
        System.out.println("ilkRakam : "+ilkRakam);
        System.out.println("toplam : "+(sonRakam+ilkRakam));

        //2.yol
        String sayiString = String.valueOf(tamsayi);
       int ilkSayi = Integer.valueOf(sayiString.substring(0,1));
       int sonSayi = Integer.valueOf(sayiString.substring(sayiString.length()-1));
        System.out.println("toplam : "+(ilkSayi+sonSayi));

    }
}
