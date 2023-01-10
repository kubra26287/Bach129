package tekrarcalismalarim;

import java.util.Scanner;

public class ManipulationsTekrar {
    public static void main(String[] args) {
          /*
         1) i)bir stringin hic karakter icermedigini (bos string) kontrol eden kodu yaziniz.
           ii) bir stringin space haric hocbir karakter icermedigini kontrol eden kodu yaziniz.
         2) i)Bir stringde  a,e,i karakterlerinin ilk görünümlerinin indexleri toplamini ekrana yazdirin.
            ii)Bir stringde  a,e,i karakterlerinin son görünümlerinin indexleri toplamini ekrana yazdirin.
            String str="Java is easy to learn";
         3)  i)Verilen karakter büyük harf ise ekrana büyük harf yazdiran kodu olusturunuz.
             ii)Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz.
          4) i)Verilen bir sayinin negatif,pozitif ya da notr oldugunu gösteredn kodu yaziniz.
             ii)Kullanici gün numarasini girsin kod gün ismini yazsin.
          5)Kullanicidan gün isimlerini aliniz ve haftaici mi haftasonu mu oldugunu yazdiran kodu olusturunuz.
          6)Kullanicidan yas degeri alin ve yasin hangi evrede oldugunu asagida ki tabloya göre yazdiran kodu olusturun.
            0-4 ==> Bebek
            5-12==>Cocuk
           13-20==>Genc
           21-30==>Yetiskin
           31-... ==> Tanimlanmamis evre
           Hata mesaji: Gecerli bir yas giriniz.
         */
        //1
        String bos = "";
        boolean b = bos.length()==0;
        System.out.println(b);
        boolean c = bos.isEmpty();
        System.out.println(c);
      //
        String space = " ";
       boolean is = space.isBlank();
        System.out.println("Space var mi?" + is);
       //2
        String g = "Java is easy";
        int first = g.indexOf('a');
        int first1 = g.indexOf('e');
        int first2 = g.indexOf('i');
        int toplam = (first+first1+first2);
        System.out.println(toplam);

        int last = g.lastIndexOf('a');
        int last1 = g.lastIndexOf('e');
       int laast2 = g.lastIndexOf('i');
        System.out.println("toplam :" +(last1+last1+laast2));

        //3
      Scanner input = new Scanner(System.in);
         System.out.println("lütfen bir character giriniz");
        char ch = input.next().charAt(0);

        if (ch>='A' && ch<='Z'){
            System.out.println("Buyuk Harf");
        }
        System.out.println("lütfen bir sayi giriniz");
        int a = input.nextInt();
        if (a%2==0){
            System.out.println("cift");
        }else {
            System.out.println("Tek");
        }
        //4
        System.out.println("Lutfen bir sayi giriniz");
       int p = input.nextInt();

       if (p>0){
           System.out.println("Pozitif");
       } else if (p<0) {
           System.out.println("Negatif");

       }else{
           System.out.println("Notr");
       }
        System.out.println("lütfen gun sayisi giriniz");
       int daynummer = input.nextInt();
       if (daynummer==1){
           System.out.println("Sunday");

       } else if (daynummer==2) {
           System.out.println("Monday");

       }else{
           System.out.println("Lütfen gecerli gun sayisi giriniz");
       }

       //5
        System.out.println("Lutfen gun ismini giriniz");
        String r = input.next();
        if (r.equalsIgnoreCase("monday")){
            System.out.println("Hafta ici");
        }else if (r.equalsIgnoreCase("Sunday")){
            System.out.println("Hafta sonu");
        }
        /*0-4 ==> Bebek
        5-12==>Cocuk
        13-20==>Genc
        21-30==>Yetiskin
        31-... ==> Tanimlanmamis evre*/
        System.out.println("lütfen yas giriniz");
        int y = input.nextInt();
        if (y<0) {
            System.out.println("Lutfn gecerli bi yas giriniz");
        }else if ( y<5){
            System.out.println("Bebek");
        } else if ( y<13) {
            System.out.println("Cocuk");

        }else if ( y<21){
            System.out.println("Genc");
        }else if ( y<31 ){
            System.out.println("Yetiskin");

        }else {
            System.out.println("Tanimlanmamis evre");
        }


    }//main
}
