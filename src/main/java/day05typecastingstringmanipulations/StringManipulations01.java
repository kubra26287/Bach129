package day05typecastingstringmanipulations;

public class StringManipulations01 {

    // String bir non primitive data type idir ve ayni zamanda bir class dir
    public static void main(String[] args) {
        String s = "java is easy";

        // Example 1: S Stringindeki tum characterleri buyuk harf yapiniz.
       String sUpper = s.toUpperCase();
        System.out.println(sUpper);

        //Example 2: "s" Stringindeki tum character leri kücük yazdir
        String sLower = s.toLowerCase();
        System.out.println(sLower);

     //Example 3: s.charAt indekse git sifirdaki ilk karakteri al demek
        char firstChar = s.charAt(0);
        System.out.println(firstChar);


        // Example 4: s Stringindeki ikinci ve sondan ikinci characteri aliniz ve ekrana yanyana yazdiriniz

        //1.yol:ayni satira yazdirmak icin
        char secondChar = s.charAt(1);
        char secondlastChar = s.charAt(10);
        System.out.print(secondChar );
        System.out.println(secondlastChar);

        //2.Yol : ayni satirda yazdirmak icin
        System.out.println("" + secondChar + secondlastChar); //concatenation

        //example 5: "s" Stringindeki character sayisini bulunuz //lenght uzunluk
        int sLenght = s.length();
        System.out.println(sLenght); //12

        //example 6: "s" Stringindeki ilk dort characteri aliniz  "Java is easy "
        //ilk indeks (0) dahil, ikinci index son indeks haric tir
        String sub1 = s.substring(0,4);
        System.out.println(sub1);

        //Example: "s" Stringindeki is kelimesini aliniz
        String sub2 = s.substring(5,7);
        System.out.println(sub2);

        //Example 8: "s" Stringindeki easy i aliniz Bir sitringin belli bir parcasini alamaya substring denir
       String sub3 = s.substring(8,12);
        System.out.println(sub3);

        //bir characterden baslayip sonuna kadar almak isterseniz ikinci index i yazmayiniz
        String sub4 = s.substring(8);
        System.out.println(sub4);

        //Example 9: "s" Stringinde money kelimesinin var olup olmadigini kontrol ediniz
        //contains icermek demek
        boolean isExist = s.contains("money");
        System.out.println(isExist);

        // note :
        // bir methodu ogrenirken 3 sey mutlaka ogrenin
        //1 bu method ne is yapar
        //bu methodun farkli kullanimlari nasildir
        //bu method size ne return eder

        //Example 10 : "s" String inin belli bir harfle baslayip baslamadigini kontrol ediniz
        //startWith ile baslar demek

        boolean isStart = s.startsWith("java");
        System.out.println(isStart);

        //Example11: "s" Stringinin 6. charachterden itibaren belli bir harfle baslayip baslamadigini kontrol ediniz
        // "offset 5"  "i" den öncekini atiniz almayiniz demek.

        boolean isBegin = s.startsWith("i",5);
        System.out.println(isBegin);









    }
}
