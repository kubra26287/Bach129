package tekrarcalismalarim;

import day04asciwrapperclassoperatorsmemoryusage.WrapperClass;

import java.util.Scanner;

public class TekrarCalismalar03 {
    public static void main(String[] args) {
        // 1)  Object olusturma
        // 2) byte, short, int, long data typlerinin max ve min degerlerini hesaplatan kodu yaziniz.
//  3)AutoWidening ve Explicit Norrowing
// 4) Mantik Operatörleri
        //example 1: short data type'inin minimum  ve maximum degerlerinid kod yazarak bulun
      /*  short maxDeger = Short.MAX_VALUE;
        System.out.println(maxDeger);
        short minDeger = Short.MIN_VALUE;
        System.out.println(minDeger);
        long maxDeger1 = Long.MAX_VALUE;
        System.out.println(maxDeger1);
        long minDeger1 = Long.MIN_VALUE;
        System.out.println(minDeger1);*/

        //Example 2 : int data typenin minimum degeri ile byte data type nin maximum degerinin toplamini bulunuz
       /* int minValue = Integer.MIN_VALUE;
        byte maxValue = Byte.MAX_VALUE;
        System.out.println("toplam = " +(minValue + maxValue));

        //Example 3: primitive int'i wrapper Integer a ceviriniz
        int i = 45;
        Integer wrapperInt = i;
        System.out.println(wrapperInt);

        char harf = 'b';
        Character wrapperChar = harf;
        System.out.println(wrapperChar);

        short nüfus = 3557;
        Short wrapperShort = nüfus;
        System.out.println(wrapperShort);


        double duble = 2.45;
        Double wrapperDuble = duble;
        System.out.println(wrapperDuble);*/
        // Example 1: S Stringindeki tum characterleri buyuk harf yapiniz.
        String s = "Java gercekten güzelmis";
       String büyükHarf = s.toUpperCase();
        System.out.println(büyükHarf);

        //Example 2: "s" Stringindeki tum character leri kücük yazdir
        String kücükHarf = s.toLowerCase();
        System.out.println(kücükHarf);

        //Example 3: s.charAt indekse git sifirdaki ilk karakteri al demek
        char ilkChar = s.charAt(0);
        System.out.println(ilkChar);

        // Example 4: s Stringindeki ikinci ve sondan ikinci characteri aliniz ve ekrana yanyana yazdiriniz
        char firstchar = s.charAt(1);
        System.out.print(firstchar);
        char lastSecond = s.charAt(21);
        System.out.println(lastSecond);
        System.out.println("" +firstchar + lastSecond );

        //example 5: "s" Stringindeki character sayisini bulunuz //lenght uzunluk
        int charNumber = s.length();
        System.out.println(charNumber);

        //example 6: "s" Stringindeki ilk dort characteri aliniz  "Java is easy "
        //ilk indeks (0) dahil, ikinci index son indeks haric tir
        String ch = s.substring(0,5);
        System.out.println(ch);

        //Example: "s" Stringindeki gercekten kelimesini aliniz
        String wort = s.substring(5,14);
        System.out.println(wort);

        //Example 9: "s" Stringinde güzelmis kelimesinin var olup olmadigini kontrol ediniz
        boolean isExist = s.contains("güzelmis");
        System.out.println(isExist);

        //Example 10 : "s" String inin belli bir harfle baslayip baslamadigini kontrol ediniz
       boolean isStart = s.startsWith("Java");
        System.out.println(isStart);
        //Example11: "s" Stringinin 6. charachterden itibaren belli bir harfle baslayip baslamadigini kontrol ediniz
        // "offset 5"  "i" den öncekini atiniz almayiniz demek.
        boolean isstart = s.startsWith("g",5);
        System.out.println(isstart);

        // Example 1 : "s" Stringi nin guzelmis ile bitip bitmedigini kontrol ediniz
        boolean isEnd = s.endsWith("güzelmis");
        System.out.println(isEnd);

        //Example 2: "s" Stringindeki money kelimesini dolar kelimesine ceviriniz
        String cevir = s.replace("gercekten","hakketen");
        System.out.println(cevir);

        //Example 5 : "s"Stringinde n harflerinin yerine xxx koy
        String koy = s.replace("gercekten","***");
        System.out.println(koy);
        //example 6 "s" Stringindeki e harflerini siliniz
        String sil = s.replace("e","");
        System.out.println(sil);

        String k = "Kübra 35 yasindadir";
        //"k" stringindeki tum rakamlari (0123456789) "*" a ceviriniz
        String at = k.replaceAll("[0-9]","*");
        System.out.println(at);
        // Example 8 : "t" Stringindeki tum rakamlari ve harfleri "!" e ceviriniz
        String ceviir = k.replaceAll("[a-zA-Z0-9]","!");
        System.out.println(ceviir);
        //exampel 10 "k"Stringindeki kucuk harfler disinda tum karakterleri <> ceviriniz
        String evir = k.replaceAll("[^a-z]","<>");
        System.out.println(evir);
          /* Example 1 : asagidaki kurallara gore kullanicinin girdigi passwordu kontrol ediniz
        1 en az sekiz character olsun
        2 space characteri passwordde olmasin
        3 3en az bir tane buyuk harf olsun
        4 en az bir tane kucuk harf olsun
        5 en az bir tane sembol olsun
        6 en az bir tane rakam olsn

           */
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen passwordunuzu giriniz");
       String pwd =  input.nextLine();

       boolean first = pwd.length()>7;
     System.out.println(first);

     boolean second = !pwd.contains(" ");
     System.out.println(second);

    boolean third = pwd.replaceAll("[^A-Z]","").length()>0;
     System.out.println(third);

     boolean forth = pwd.replaceAll("[^a-z]","").length()>0;
     System.out.println(forth);

     boolean fifth = pwd.replaceAll("[A-Za-z0-9]","").length()>0;
     System.out.println(fifth);

     boolean sixth = pwd.replaceAll("[^0-9]","").length()>0;
     System.out.println(sixth);
     System.out.println("Password gecerli mi ?" + (first && second && third && forth && fifth && sixth));

























    }




}
