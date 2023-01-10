package day05typecastingstringmanipulations;

public class TypeCasting01 {

        //Numeric primitive data typelarinin birbirine donusturlmesine "Type Casting " denir.
        //Numeric(sayisal) data type lar; byte, short, long, float, double


        //note1: Kucuk data typelerini buyuk data type lerine cevirmeyi java otomatik olarak yapabilir
        //Bu isleme "autowidening"(otovaydening) (otomotik Genisletme) denir.
        //Note 2: Buyuk data type lerini kucuk data tiplerine cevirmek riskli bir istir. java bu riskli isi otomatik olarak yapmaz
        //bu islemi kod yazanlar yapar.Bu isleme "explicitNarrowing" denir Buna da aciktan daraltma denir


    public static void main(String[] args) {
        //byte data typeni int data type na ceviriniz
         byte age = 13;

         int ageInt = age;  // AutoWidening

        //long data type ini short data type ine cevirelim
        long weight = 234;
       short weightShort =(short)weight; //explicit narrowing


        // int data type ini floata ceviriniz
        int population= 700000;
        System.out.println(population);

        float populationFloat = population;
        System.out.println(populationFloat);


        // double data type ini short data type ina cevir

        double number = 12.234;
        System.out.println(number);

        short numberShort = (short)number;
        System.out.println(numberShort); //12

        //dikkat!
        //Example 1 :
        // dönüsüm yaptiginiz sayi (260) ; dönuseceginiz data Type inin sinirlari disinda ise Java kullandiginiz sayiyi
        //kullandiginiz sayi ile mod islemi yapar mod isleminin sonucu sizin yeni degeriniz olur.
        short num = 260;
        System.out.println(num);

        byte numByte = (byte)num;
        System.out.println(numByte);//4


        //Example 2 :
        short n = 1023;
        System.out.println(n);

        byte nShort = (byte)n;
        System.out.println(nShort); // -1 yazar sebebi 1023/256 = 4 kalan -1 dir Java bolumu cok yakin olani 3 degilde 4 yazar
        //kagitta islem yap anlarsin :)








    }
}
