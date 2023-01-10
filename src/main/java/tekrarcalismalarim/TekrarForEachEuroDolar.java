package tekrarcalismalarim;

import java.util.Arrays;

public class TekrarForEachEuroDolar {
    public static void main(String[] args) {
        //tek bir String icerisinde verilen euro ve dolarlarin ayri ayri toplamlarini bulan bir kod yaziniz
        //dolar toplami :58
        //euro toplami: 168

        String str = "$1 $12 €34 €56 $45 €78";//bunlari ayri ayri alabilmek icin split ile bosluklardan ayiricaz

       int dolarToplam = 0;
       int euroToplam = 0;
        String[] arr = str.split(" ");//burda neden Array yaptik cunku split bize String[] döndurur
        System.out.println(Arrays.toString(arr));
        for (String w : arr) {
            if (w.contains("$")){
               dolarToplam +=Integer.valueOf(w.replaceAll("\\D",""));
            }else {
                euroToplam += Integer.valueOf(w.replaceAll("\\D",""));
            }

        }
        System.out.println("dolartoplam ="+dolarToplam);
        System.out.println("eurotoplam ="+euroToplam);

    }//main
}
