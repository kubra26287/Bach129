package day04asciwrapperclassoperatorsmemoryusage;

public class WrapperClass {
    public static void main(String[] args) {
        //Primitive:       char      boolean  byte     short int long float double
        //Wrapper Class: Character - Boolean- Byte - Short _Integer _long -Float _ Double
        //Wrapper Classlar non-primitivedir o yuzden memoryde cok yer kaplarlar o yuzden sart degilse kullanmayi tercih etmeyiz
        // primitive data typelari wrapper a donusturmeye autoboxing denir
        // Wrapper' i primitive data type' a cevirmeye "unboxing" denir (kutu disina cikarma)
        int n = 12;// "n" yazip. koyarsaniz hic method goremezsiniz cunku primitivler method icermez.
        Integer m = 12;// "m" yazip. koyarsaniz bircok method gorursubnuz cunku wrapper classlar method icerir.

        //example 1: short data type'inin minimum  ve maximum degerlerinid kod yazarak bulun
        short maxShort = Short.MAX_VALUE;
        short minShort = Short.MIN_VALUE;
        System.out.println(maxShort);
        System.out.println(minShort);

        //Example 2 : int data typenin minimum degeri ile byte data type nin maximum degerinin toplamini bulunuz
        int intMin = Integer.MAX_VALUE;
        System.out.println(intMin);

        byte byteMax = Byte.MAX_VALUE;
        System.out.println(byteMax);
        System.out.println(intMin + byteMax);

        //Example 3: primitive int'i wrapper Integer a ceviriniz
        int num = 22;

        Integer wrapperNum = num;

        System.out.println(wrapperNum); // 22
        //   ii) Wrapper Byte i primitive byte a cevirelim
        Byte k = 43;
        byte primitiveK = k;


        // Example 4 :primitive char i Wrapper character e ceviriniz (autoboxing)
        char initial = 'A';
         Character  initialfWrapper = initial;

        //    Wrapper Booleani primitive boolean a ceviriniz unboxing
         Boolean isOld = true;
         boolean isOldWrapper = isOld;

         //Example 5 : size String olarak verilen iki fiyatin toplamini ekrana yazdiriniz

        String shirt = "2300";
        String shoes = "5200";//23005200
        //java da "+" sembolu iki sayi arasinda kullanirsa toplama islemi yapar
        //java da "+" sembolu iki String arasinda veya vir String ve bir sayi arasinda kullanilirsa birlestirme yapar
        // buna da "cancatenation" denir
        //java concatenation islemlerinde matematikdeki islem onceligini bilir ve kullanir orn; carpma bölme gibi

        //1. yol
        System.out.println(shirt + shoes);


        //2. yol

        int toplamFiyat = Integer.valueOf(shirt) + Integer.valueOf(shoes);

        System.out.println(toplamFiyat);// 7500

        //example6: size String olarak verilen iki fiyatin toplamini ekrana yazdiriniz
        String tv = "$11000";
        String radio = "$3000";

        System.out.println(tv + radio ); // $11000$3000

        int totalPrice = Integer.valueOf(tv) + Integer.valueOf(radio);

        //ValeoOf methodu  sadece rakam olan Stringlerde kullanilir, digerlerinde orn; $ isareti gibi karakterlerde  hata verir.






    }
}
