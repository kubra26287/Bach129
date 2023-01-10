package day14arrysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //EXample 2: integer Array olusturunuz
        //icine 6 tane eleman yerlestiriniz
        //bu elemanlarin en kücügü ile en buyugunun toplamini ekrana yazdiriniz

        //ages[ages.length-1] arrayin son elemanini verir
        //ages.length-1 methodu arrayin length'ini verir
         //length-1 son elemanin indexini verir


       int ages[]  = new int[6];
        ages[0]=20;
        ages[1]=23;
        ages[2]=19;
        ages[3]=44;
        ages[4]=15;
        ages[5]=32;
        //sort() methodu arraydeki elemanlari kucukten buyuge dizer
     //    Arrays.sort(ages);
      //  System.out.println(Arrays.toString(ages));
      //  System.out.println(ages[0] + ages[ages.length-1]);

        //2.yol :

        //Bir min kutusu olustur icine ilk sayiyi min kabul et koy
        //Kutuda ki sayiyi 2. ile karsilastir kücügünü bul kutuya koy
        //Kutuda ki sayiyi 3.sayi ile karsilastir min' i bul kutuya koy
        //Kutuda ki ile 4.sayiyi karsilastir min' i bul kutuya koy
        //Kutuda ki sayi ile 5.sayi yi karsilastir min' i bul kutuya koy
        //Kutuda ki sayi ile 6.sayi yi karsilastir min' i bul kutuya koy
        int minimum = ages[0];
        int maximum = ages[0];
        for (int w : ages){

           minimum = Math.min(minimum, w);
           maximum = Math.max(maximum, w);
 
        }
        System.out.println(minimum);
        System.out.println(maximum);








    }
}
