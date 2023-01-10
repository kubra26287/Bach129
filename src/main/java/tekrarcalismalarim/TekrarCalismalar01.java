package tekrarcalismalarim;

public class TekrarCalismalar01 {
    public static void main(String[] args) {
        // ORNEK 1 : Ogrenci ismi variable olusturup deger olarak Ali Can atayiniz.
        String name = "Ali Can ";
        System.out.println(name);

        //ORENEK 2: chr data type'inda ilk ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz
        String Name = "Ali Can";
        char firstName = name.charAt(0);
        System.out.println(firstName);

        //ORNEK 3: boolean data type'inde emeklimisin bir variable oluturun ve false degeri atayin.
       boolean emekliMisin = false;
        System.out.println(emekliMisin);


        // ORNEK 4: byte data type'inda ogrenci yasi icin bir variable olusturunuz ve deger atayiniz
        byte age = 23;
        System.out.println(age);

        //ORNEK 5: short data type'inda site nufusu icin bir variable olusturun ve deger atayiniz
        short siteNüfusu = 567;
        System.out.println(siteNüfusu);

        // ORNEK 6: Ulke nufusu icin variable olusturun ve deger atayiniz

        int ulkeNufusu = 1345678567;
        System.out.println(ulkeNufusu);

        // ORNEK 7: long data type'inda insan vucundaki hucre sayisi icin variable olusturup deger atamasi yapin

        long hucreSayisi = 1456345234;
        System.out.println(hucreSayisi);

        // 1)Dikdirtgenin alanini hesaplayan methodu olusturunuz ve kullaniniz
         int sonuc = dikdortgeninAlani(3,5);
        System.out.println(sonuc);

        // 2)Dikdirtgenin cevresini hesaplayan methodu olusturunuz ve kullaniniz
        int sonuc1 = dikdortgeninCevresi(4,5);
        System.out.println(sonuc1);

        // 3)Dairenin cevresini hesaplayan methodu olusturunuz ve kullaniniz
        double sonuc2 = daireninAlani(3,6);
        System.out.println(sonuc2);

        // 4)Dairenin alanini hesaplayan methodu olusturunuz ve kullaniniz
        long sonuc5 = daireninAlani(3,7);
        System.out.println(sonuc5);

        // ORNEK 2: Hucre agirligi ve Amip'in agirligi icin iki tane variable olusturun ve agirliklari farkini ekrana yazdirin
         double hucreAgirligi = 3.456787;
         double amipAgirligi = 1.456785;
        System.out.println(3.456787-1.456785);

        // ORNEK 1: Sehir ismi icin bir variable olusturun ve bir deger atayip onu ekrana yazdirin.
        String sehirIsmi = "istanbul";
        System.out.println(sehirIsmi);









    }//main
                   public static int dikdortgeninAlani(int a , int d ){
                       return a*d;
                   }

                   public static int dikdortgeninCevresi(int e, int f){
                       return 2*e + 2*f;

                   }
                   public static double daireninAlani(double g , double h){
                         return 2*g*h;
                   }
                   public static long daireninAlani(long v ,long m){
                        return v*m*m;
                   }

}//package
