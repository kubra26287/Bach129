package day23datetimestringbuilder;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {
        //Example 1: Time i formatlayiniz

        LocalTime myTime = LocalTime.now();   //icinde bulundugumuz bolgedeki anlik zaman
        System.out.println(myTime);
       //hh==> 12 saat sistemini kullanir   HH==> 24 luk saat sistemi
       // hh kullandiginizda am pm dememiz gerekir bunun icinde a dememiz yeterli  yani "hh:mm: a"
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss a"); //burada ki 'a' "am pm" vermesi icin
        System.out.println(dtf.format(myTime));    //java dtf ile format methoduna ulas ve benim formatimi uygula




    }
}
