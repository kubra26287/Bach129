package day05typecastingstringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {
        String s = "learn Java earn money ";
        // Example 1 : "s" Stringi nin money ile bitip bitmedigini kontrol ediniz
        boolean isEnd = s.endsWith("money");
        System.out.println(isEnd);

        //Example 2: "s" Stringindeki money kelimesini dolar kelimesine ceviriniz
        //note replace methodunda coklu karakter olunca ("")cift tirnak zorunlu ; tekli karakter ile ('') tek tirnak kullanabilirsiniz
        // ya ikisi de cift tirnak olmali yada ikisi de tek tirnak olmalidir
        String s1 = s.replace("money","dollar");
        System.out.println(s1);

        //Example 3: "s" Stringindeki earn kelimesini win kelimesine ceviriniz
        //earn kelimesi learn ün icin de de oldugu icin onu da win e cevirir lwin olur
        String s2 = s.replace("earn","win");
        System.out.println(s2);

        //Example: "s"Stringindeki a lari * a cevir
        String s3 = s.replace("a","*");
        System.out.println(s3);

        //Example 5 : "s"Stringinde n harflerinin yerine xxx koy
        String s4 = s.replace("n","xxx");
        System.out.println(s4);

        //example 6 "s" Stringindeki e harflerini siliniz
        //note: Hicbirsey char data type inde yoktur bu yuzden cift tirnak kullanmamiz gerekir
        String s5 = s.replace("e","");
        System.out.println(s5);

        //Example 7:
        String t = "Ali 13 yasindadir!...";
        //"t" stringindeki tum rakamlari (0123456789) "*" a ceviriniz
        //replaceAll hepsini degistir demek
        //note : Bir grup datayi degistirmek icin replaceAll kullanilir örn. sesli harfler, buyuk harfler ,kücuk harfler
        //Bir grup data yi ifade etmek icin "Regular Expressions"(regex) kullaniriz
        String t1 = t.replaceAll("[0-9]","*");
        System.out.println(t1);

        //Meshur regex'ler
        //araya "-" eksi koyunca von bis demektir
        //1 tum rakamlar [0-9]
        //2 tum kucuk harfler [a-z]
        //3 tum buyuk harfler [A-Z]
        //4tum kucuk harfler ve buyuk garfler ==> [a-zA-Z]
        //5 tum harfler ve rakamlar==> [a-zA-Z0_9]
        //6 tum noktalama isaretleri  ==> \\p{Punct}
        //7 tum sesli harfler ==> [aeiou]
        //    x,q,w harfleri ==> [x,q,w]

        //8 Kucuk harflerden farkli tum characterler ==>[^a-z]den farkli demektr
        //9 tum harflerden farkli tum characterler ==> [^a-zA-Z]

      /*
            /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
       1) \\d    ==> tum rakamlar digit
          \\D    ==> tum rakam disi character ler
       2) \\w   ==> A->Z    a->z         0->9    _tum buyuk, kucuk harf ve rakamlar
          \\W  ==> A->Z    a->z         0->9    _ disindaki hersey
       3) \\s   ==> space tum bosluklar space
          \\S   ==> space disindaki hersey
      */



        // Example 8 : "t" Stringindeki tum rakamlari ve harfleri "!" e ceviriniz
        String t2 = t.replaceAll("[a-zA-Z0_9]","!");
        System.out.println(t2);

        //tum sesli harfleri "?" ceviriniz
        String t3 = t.replaceAll("[aeouiAEIUO]","?");
        System.out.println(t3);

        //exampel 10 "t"Stringindeki kucuk harfler disinda tum karakterleri <> ceviriniz
        String t4 = t.replaceAll("[^a-z]","<>");
        System.out.println(t4);

        //Example 11 : "t" Stringindeki tum harfler disindaki tum characterleri "+" ceviriniz
        String t5 = t.replaceAll("[^a-zA-Z]","+");
        System.out.println(t5);

        //Example 12:"t" stringindeki spaceler disindaki tum characterleri "$"a ceviriniz
       String t6 = t.replaceAll("[^ ]","TL");
        System.out.println(t6);

        //Example 13 : ""t" Stringindeki sesli harfler disindaki tum characterleri "&" e ceviriniz
        String t7 = t.replaceAll("[^aeiuoAEIUO]","[&]");
        System.out.println(t7);




    }
}
