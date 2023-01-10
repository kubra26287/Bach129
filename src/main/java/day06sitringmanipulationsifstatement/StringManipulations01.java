package day06sitringmanipulationsifstatement;

public class StringManipulations01 {
    public static void main(String[] args) {
      // example 1 : bir stringin bas ve sonunda space caharacteri varsa siliniz
        String s = "   Ali Can  ";
        System.out.println(s);

        //trimm() methodu bir stringin bas ve sonundaki space characterlerini siler aradaki space lere dokunmaz

        String sTrimmed = s.trim();
        System.out.println(sTrimmed);



        //Example 2: asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz
        //   String tv = "$456.99";   String laptop = "$875.99";  ==> 456.99 + 875.99= 1332.98
        String tv1 = "$456.99";
        String laptop1 = "$875.99";

        String tv2 = tv1.replace("$","");
        System.out.println(tv2);

        String laptop2 = laptop1.replace("$","");
        System.out.println(laptop2);

       Double totalprice =  Double.valueOf(tv2) + Double.valueOf(laptop2);
        System.out.println(totalprice); //1332.98 java da ondalikli sayilar otomatik olarak double kabul edilir.

        //Example 3: verilen ismin ilk isminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.
        //     "Ali Can"  ==> AC

        String name = "ali cAN";

        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);
                                               //parcala bosluktan demek split
        char second = name.trim().toUpperCase().split(" ")[1].charAt(0);
                                                                 // buradaki bir Ali Can isminin Ali indeksi sifir [0]
                                                                 // Can kismindaki indeks sayisi [1]
        System.out.println(second);
        System.out.println("" + first + second);

        //Example 4 bir Stringin hic karakter icermedigini (bos string ) kontrol eden kodu yaziniz

        String str = "";

        //1. yol : length() kullan
        boolean result1 = str.length()==0;  //result sonuc demek
        System.out.println("String bos mu ?" + result1);

        boolean result2 = str.isEmpty();  // java bir k0nuda metod uretmisse o methodu kullanmak en iyisidir
        System.out.println("String bos mu ?" + result2);

        //Example 5: bir Stringin space haric hic bir character icermedigini kontrol eden kodu yaziniz
        String t = "      ";

        //!.yol
        boolean result3 = t.replace(" ","").length()==0;
        System.out.println("Sadece space mi var ?" + result3);

        //2.yol
        boolean result4 = t.replace(" ","").isEmpty();
        System.out.println("Sadece space mi var ?" +result4);

        //3. yol :
        //isBlank() methodu sadece space iceren Stringler icin true verir, space disinda bir character icerirse false verir
        //isBlank() methodu bos stringler icin de true verir
        //isBlank() ==> space + hicbirsey icin true isEmpty ==> hicbirsey icin true verir
        boolean result5 = t.isBlank();
        System.out.println("Sadece space mi var ?" +result5);


        //Example 6 : bir String de index i a,i,e olan characterlerinin ilk gorunumlerinin indexleri toplaminji ekrana yazdiriniz
        //               "Java is easy to learn" ==> 1 + 5 + 8 = 14

        String r = "java is easy to learn ";
        int idxA = r.indexOf('a');
        System.out.println(idxA);

        int idxI = r.indexOf('i');
        System.out.println(idxI);

        int idxE = r.indexOf('e');
        System.out.println(idxE);
        System.out.println("indexler toplami :" + (idxA + idxE + idxI));

        //Example 7 : bir stringde "java kelimesinin ilk olarak kacinci index'de kullanildigini gosteren kodu yaziniz
         //                "Ah Java vah Java sensiz olmuyor Java. " ==> 3
        //indexOf "Java" kullaniminda siz java kelimesinin ilk görunumundeki ilk harfin (yani j nin ) indexini almis olursunuz

        String u ="Ah Java vah Java sensiz olmuyor Java. ";
        int idxJava = u.indexOf("Java");
        System.out.println(idxJava); //3

        //indexOf()  methodu olmayan characterler icin her zaman -1 verir
        int idxOfXyz = u.indexOf("xyz");
        System.out.println(idxOfXyz);

        //Example 8 : bir String de a,e,i, characterlerinin son görünumlerinin indexleri toplamini ekrana yaziniz
        //                "Java is easy to learn "  ==> 5 + 17 +18 = 40


        String v = "java is easy to learn ";
        int idxOfA = v.lastIndexOf('a'); // 18
        System.out.println(idxOfA);


       int idxOfE = v.lastIndexOf('e');
        System.out.println(idxOfE);

        int idxOfI = v.lastIndexOf('i');
        System.out.println(idxOfI);

        System.out.println(idxOfA + idxOfE + idxOfI);
        // lastIndexOf Stringde olmayan bir karakter icin kullanilirsa her karakter icin "-1" verir.

        //Example 9 : bir Stringdeki tekrarsiz karakterleri ekrana yazdiriniz
        //             abbccdc ==> ad
        String y =  "abbccdc";
        char ch1 = y.charAt(0);

        if(y.indexOf(ch1)==y.lastIndexOf(ch1)) {
            System.out.println(ch1);
        }

            char ch2 = y.charAt(1);
            if(y.indexOf(ch2)==y.lastIndexOf(ch2)){
                System.out.println(ch2);

            }

            char ch3 = y.charAt(2);
            if(y.indexOf(ch3)==y.lastIndexOf(ch3)){
            System.out.println(ch3);
        }






        // note: bazi kodlarin bazi sartlara bagli olarak calismasi gerekir .
        //Bazi kodlari bazi sartara göre aktive etmek icin "if statement " kullanilir.
        //    if you study hard , you will learn Java.

        //Example 10 : Sayi pozitif ise ekrana cift yazdirin
        int num = 12;
        if (num>0){
            System.out.println("Pozitif");

            //Example 11 : sayi -1 ile 10 arasinda ise ekrana "Rakam" yazdiirin
           int number = 3;

            if(number>-1 && number<10){
                System.out.println("Rakam"); // eger kod dogru ise calisir dogru degil ise calismaz

            }



        }
        //Example 12: sayi 3 basamakli ise "wooow" yazdirin.

        int n = -123;

       n= Math.abs(n);    //bu method negatif 123 ü pozitif 123 e cevirdi

        if(n>99 && n<1000){
            System.out.println("Wooow");




        }





















    }
}
