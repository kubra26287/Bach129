package day23datetimestringbuilder;

public class StringBuilder01 {
    /*
    Javada String class kullanilarak veya String builder class kullanilarak olusturabilir
    "String Class "kullanilarak urettigimiz stringler "Immutable"(Degistirilemez) dir
    StringBuilder class "kullanilarak urettigimiz stringler "Mutable"(Degistirilebilir) dir
    String Builder bir class oldugu icin onun da kendi method lari vardir
     */
    public static void main(String[] args) {

        //Immutable
        //burada String clas ile girilen her data oldugu gibi durur yeni bir kontynerda eklenir

        //String degistirdikten sonra ayni sitringe assign edersek java yine yeni bir container olusturur
        //degismis degeri bu yeni conteynerin icine koyar e eski containeri gosteren oku yeni container a yonlendirir
        //dolayisiyla eski container adressiz kalir ve "Garbage collector" adressiz olan container i siler
        String s = " java";

        String t = s+"!";

        String w = t + "?";


        //Mutable
        //String builder larda farkli kaplarin icine konmaz ayni kabin icindeki
        // eski deger silinir yerine yenisi yazilir
        //orjinal degeri siler


        //String builder kullanarak String uretmenin 1. yolu:
        StringBuilder sb = new StringBuilder("Python");

        sb.append("!"); //ekle methodu; istedigimiz kadar yan yana koyup method chain olusturabiliriz
        sb.append("!").append("?").append(".");
        System.out.println(sb);


        //String builder kullanarak String uretmenin 1. yolu:
        StringBuilder sb2 = new StringBuilder(); //bos uretip icine sonradan deger ekleyebiliriz
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());
        sb2.append("Java");
        System.out.println(sb2.length());//4
        //String builder kullandiginiz da baslangic kapasitesi 16 dir Kapasite asildiginda var olan kapasitenin
        // iki fazlasi kadar var olan kapasiteye ekleme yapar
        //16==> 16*2+2        34==>34*2+2
        System.out.println(sb2.capacity());//16

        sb2.append("xxxxxxxxxxxxxxx");
        System.out.println(sb2.length());//19
        System.out.println(sb2.capacity());//34  16*2+2

        sb2.append("yyyyyyyyyyyyyyyy");
        System.out.println(sb2.length());//35
        System.out.println(sb2.capacity());//70  34.2+2=70

        ////String builder kullanarak String uretmenin 3. yolu:
        StringBuilder sb3 = new StringBuilder(2);//ihtiyacimiza gore kapasiteyi belirlemek ici icine tamsayi yazarsak
                                                          //bize kutusayisi 16 vermek yerine iki kutu verir boylece memoryde yer kaplamamis olur

        sb3.append("Flo");
        System.out.println(sb3.length());//3
        System.out.println(sb3.capacity());//6

        sb3.insert(2,"XXXXXX");  //offset yerine iki characteri es gec yerine xxx koy dedik
        System.out.println(sb3.length());   //araya sikistir
        System.out.println(sb3);//FlXXXXXXo

        //toString methodu String builder i strihge cevirir
        //String class da var olan ama StringBuilder class da var olmayan split() methodu gibi
        //methodlara ihtiyac duydugumuzda toString methodunu kullanarak String Class a gecer ve o methodu kullanir
        sb3.toString().split("l");

        //Stringi tekrar String builder a cevirbilirsiniz
        StringBuilder sb4 = new StringBuilder(sb3);

        sb3.reverse();
        System.out.println(sb3);// reverse tersine cevirir

        sb3.deleteCharAt(1);  // index 1 deki karakteri sil
        System.out.println(sb3);

        sb3.delete(1,6); // baslangic indeksini ve bitis indexini verince aradaki index i siler
                         //ilk index dahil ikinci index haric
        System.out.println(sb3);

        StringBuilder sb5 = new StringBuilder("java");
        StringBuilder sb6 = new StringBuilder("Java");

        //STringBuilder lari karsilastirmak icin kullanilir. Alfabetik siralamada once ise negatif sonra ise pozitif olur
        System.out.println(sb5.compareTo(sb6)); // buyuk kucuk harf duyarli oldugundan sout da ascii degerlere gore karakter farkini  verir


        //degistir methodu index 2 yi m ye cevirir
        sb6.setCharAt(2,'m');
        System.out.println(sb6);

        sb6.replace(1,3,"xyz");
        System.out.println(sb6);

        //StringBuilder Class da kullanmmamiza izin verilen bazi String class methodlari vardir
        //substring() gibi
        //bu methodlari StringBuilder uzerinde kullaninca orginal deger degismez
        //cunku substring() immutable Classin methodudur
        sb6.substring(1,3);
        System.out.println(sb6);


    }
}
