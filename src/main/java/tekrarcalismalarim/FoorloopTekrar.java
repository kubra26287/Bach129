package tekrarcalismalarim;

import java.util.Scanner;

public class FoorloopTekrar {
    public static void main(String[] args) {
        //11 den 44 e kadar tum tam sayilari ekrana yazdiran kod
        for (int i =11; i < 45; i++) {
            System.out.println("Tum tam sayilar: "+i);

        }
        //Example 3 : 40 dan 23 e kadar tum cift tamsayilari ekrana yazdir
        for (int i =40; i>22 ; i--) {
           if (i%2==0){
               System.out.println(i);
           }

        }
        //21 den 180 e kadar hem 4 hem de 6 ile bölünebilen tum tamsayilari ekrana yazdiran kodu yazdiriniz

        for (int i =21; i <181 ; i++) {
            if (i%4==0 && i%6==0){
                System.out.println(i);
            }

        }
         //Example 2 : size verilen kücuk harfle yazilmis String`in
         // indexi cift sayi olan characterlerini büyük harf yapiniz

        String c = "Dairenin";

        for (int i = 0; i < c.length(); i++) {
            String ch = c.substring(i,i+1);
            if (i%2==0){
                System.out.print(ch.toUpperCase()+" ");


            }

        }
        System.out.println();

        //Example size verilen bir stringin "Palindrome" olup olamdigini kontrol eden kodu yazdirin
        // civic nalan kucuk 11211 ==> Palindrome

        String duz = "civic";
        String ters ="";

        for (int i =duz.length()-1; i >=0 ; i--) {
            ters = ters + duz.charAt(i);
        }
        if (duz.equalsIgnoreCase(ters)){
            System.out.println("bu bir Polindrom dur ");
        }else{
            System.out.println("bu polindrom degildir");
        }


/*
Kullanicidan baslangic ve bitis degerlerini alin.
   Baslangic degerinden baslayip bitis degerine kadar aradaki tum cift tamsayilari
   ekrana yazdiriniz  //10  12  14
 */
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bi deger atayiniz");
        int start = input.nextInt();
        System.out.println("lutfen bir sayi daha giriniz");
        int end = input.nextInt();

        if (start>end){
            System.out.println("baslangic degeri bitis degerinden buyuk olamaz");
        }

        for (int i =start; i <=end ; i++) {
            if (i%2==0){
                System.out.print(i +" ");
            }

        }
        System.out.println();
        //hic sayi kullanmadan 1 den 100 e kadar olan sayilari console a yazdiriniz

        for (int i ='d' /'d' ; i <='d' ; i++) {
            System.out.print(i +" ");


        }
        System.out.println();
       //Example 3 verilen bir tamsayinin rakamlari toplamini console'a yazdiran kodu yaziniz

        int tamsayi = -234;
        tamsayi = Math.abs(tamsayi);
       int sum = 0;

        while (tamsayi>0){
           sum = sum + tamsayi%10;

           tamsayi/=10;
        }

        System.out.println(sum);






    }
}
