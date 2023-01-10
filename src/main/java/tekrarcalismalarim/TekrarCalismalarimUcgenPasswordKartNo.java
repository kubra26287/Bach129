package tekrarcalismalarim;

import java.util.Scanner;

public class TekrarCalismalarimUcgenPasswordKartNo {
    public static void main(String[] args) {
        /*
        1)Kullanicidan 3 tane pozitif bir tam sayi aliniz.
        bu üc sayinin ücgen olusturma durumunu kontrol ediniz.
        Eger ücgen olabiliyorsa eskenar ücgen olma durumunu kontrol ediniz.
        INFO: ücgen olma sarti nedir?
        Herhangi iki kenar toplami ücüncü kenardan büyük olmali,
        herhangi iki kenar farki diger kenardan kücük olmali.
        a+b>c>a-b
        a+c>b>a-c
        b+c>a>b-c
        a=b=c ==> eskenar ücgen

      */
        Scanner input = new Scanner(System.in);
       /* System.out.println("Lutfen 3 tane tamsayi giriniz");
        int a= input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a+b>c && a-b<c && b+c>a && b-c<a){
            System.out.println("sen ucgensin");
        } else if (a==b || b==c || c==a) {
            System.out.println("eskenar ucgen");

        }else {
            System.out.println("sen ucgen degilsin");

        }
        */
        /*2)Password'un ilk harfi buyuk harf ise

        'A' olursa gecerli password yazdirin degilse gecersiz password yazdirin
        Passwordun ilk harfi kucuk harf ise
        'z' olursa gecerli passworde yazdirin degilse gecersiz password yazdirin
        System.out.println("Lutfen passwordunuzu giriniz");*/
      /*  String pwd = input.nextLine();
        char firstChar = pwd.charAt(0);

        if (firstChar>='A'&& firstChar<='Z'){
                   if (firstChar=='A'){
                       System.out.println("Gecerli Password");
                   }else{
                       System.out.println("gecersiz password");
                   }

        } else if (firstChar<='z' && firstChar>='a') {
             if (firstChar=='z'){
                 System.out.println("Gecerli password ");
             }else{
                 System.out.println("Gecersiz password");
             }

        }else{
            System.out.println("ilk character harf olmali");
        }
        */
        /*3) Kullanicidan 0 dan kücük 120 den büyük deger giremeyecek sekilde datalari altiktan sonra
        eger calisan kadinsa 60 yasindan büyükse emekli olabilir yazdirin.
                eger calisan erkekse 65 yasindan büyükse emekli olabilir yazdirin
                */


       /* System.out.println("Lütfen cinsiyetinizi giriniz");
        String cins = input.next();
        System.out.println("Lütfen yasinizi giriniz");
        int age = input.nextInt();
        if (age<0 || age>120) {
            System.out.println("lütfen 0 ile 120 arasinda bir yas giriniz ");
        } else if (cins.equalsIgnoreCase("erkek")) {
            if (age > 65) {
                System.out.println("emekli olabilir");
            } else {
                System.out.println("emekli olamaz");
            }
        } else if (cins.equalsIgnoreCase("Kadin")) {
            if (age > 60) {
                System.out.println("Emekli olabilir");
            } else {
                System.out.println("Emekli olamaz");
            }
        }else{
            System.out.println("Tanimli degil");
        }

      4) Verilen yilin artik yil olup olmadigini kontrol eden kodu yaziniz.
            1) Yil 100'e bölünüyorsa 400'e bölünmelidir.
            2) Yil 100'e bölünmüyorsa 4'e bölünmelidir.*/

        int jear = 1606;

      String result =  jear%100==0 ? (jear%400==0 ? "leap ": "Not leap"): jear%4==0 ? "leap": "Not leap" ;


       /* 5) Kullanicidan ismini soy ismini ve kredi karti bilgilerini isteyin ve asagida ki gibi yazdirin
            Isim-Soyisim: A**** G****
            Kart-No: **** **** **** 1907*/
        System.out.println("lutfen adinizi  giriniz");
        String name = input.nextLine();
        System.out.println("Lutfen soyadinizi giriniz");
        String lastname = input.nextLine();
        System.out.println("Lütfen 16 haneli kart numaranizi giriniz");
        String kartNo = input.next();


        String name1 = name.substring(0,1).toUpperCase()+name.substring(1).replaceAll("[^A-Z]","*");
        String lastName2 = lastname.substring(0,1).toUpperCase()+lastname.substring(1).replaceAll("[a-z]","*");
        System.out.println("Isim-Soyisim: "+name1 + " " +lastName2 );

        String kartNummer = kartNo.substring(0);
        String ilkDorthane = kartNummer.substring(0,4).replaceAll("[0-9]","*");
        String ikinciDorthane =kartNummer.substring(4,8).replaceAll("[0-9]","*");
        String ucuncuhane = kartNummer.substring(8,12).replaceAll("[0-9]","*");
        String sonDortHane = kartNummer.substring(12);
        System.out.println("Kart-No: "+ilkDorthane + " " + ikinciDorthane + " " +ucuncuhane+ " " +sonDortHane);













    }//main
}
