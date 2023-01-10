package tekrarcalismalarim;

import java.util.Scanner;

public class TekrarNestedPassword {
    public static void main(String[] args) {
        //Example !: /* Example 1: Kullanicidan 3 tane sayi aliniz
        //          Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
        //          Eger ucgen ise "eskenar"
        //          Ucgen olma durumunu
        //          kontrol ediniz.
        //          INFO :
        //          Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenardan buyuk olmali
        //                           herhangi iki kenar farki ucuncu kenardan kucuk olmali
        //           a+b>c>a-b
        //           a+c>b>a-c
        //           b+c>a>b-c
        //          a=b=c ise eskenar ucgen

        Scanner input = new Scanner(System.in);
      /*  System.out.println("Lütfen 3 kenar uzunlugu giriniz");
        int a = Math.abs(input.nextInt());
        int b = Math.abs(input.nextInt());
        int c = Math.abs(input.nextInt());

        boolean ucgenmi = ((a+b>c && c>Math.abs(a-b)) && (b<a+c && b>Math.abs(a-c)) && (a<b+c && a>Math.abs(b-c)) );

        if (ucgenmi){
            System.out.println("Sen ucgensin");
        } else if (a==b && b==c && c==a) {
            System.out.println("Es kenar ucgen");

        }else {
            System.out.println("Sen ücgen degilsin");
        }

            Password'un ilk harfi buyuk harf ise
            'A' olursa gecerli password yazdirin degilse gecersiz password yazdirin
            Alemci ==> gecerli


            Passwordun ilk harfi kucuk harf ise
            'z' olursa gecerli passworde yazdirin degilse gecersiz password yazdirin
           zehirli==> gecerli

        System.out.println("Lütfen passwordunuzu giriniz");
        String pwd = input.nextLine();
        char first = pwd.charAt(0);

        if ((first>='A') && first<='Z' ) {

            if (first == 'A') {
                System.out.println("gecerli Password");

            } else {
                System.out.println("Gecersiz Password A degil");

            }
        }else if (first>='a' && first<= 'z'){
            if (first=='z'){
                System.out.println("Gecerli Password");
            }else {
                System.out.println("gecersiz password  z degil");
            }
        }else {
            System.out.println("ilk character harf olmali");
        }
        */

  /*Example 2 :        //Kullanicidan bir ucgenin kenar uzunlugunu aliniz
              // Uc kenari birbirine esit ise "Eskenar Ucgen " yazdiriniz
               //Sadece iki kenar uzunlugu biribirine esit ise "Ikizkenar ucgen"
                //Tum kenarlari birbirinden farkli ise "Cesitkenar Ucgen" yazdiriniz

        System.out.println("lütfen 3 tane kenar uzunlugu giriniz");
        double a = Math.abs(input.nextDouble());
        double b = Math.abs(input.nextDouble());
        double c = Math.abs(input.nextDouble());
        boolean ucgenmi = ((a + b > c && c > Math.abs(a - b)) && (a + c > b && b > Math.abs(a - c)) && (b + c > a && a > Math.abs(b - c)));
        if (a >= 0 && b >= 0 & c >= 0) {
            System.out.println("gecerli kenar uzunlugu giriniz");
            if (ucgenmi) {

            } else if (a == b & b == c && c == a) {
                System.out.println("Eskenar ucgen");
            } else if (a == b || b == c || c == a) {
                System.out.println("ikizkenar ucgen");

            } else {
                System.out.println("cesit kenar ucgen");
            }
        }else{
            System.out.println("Ucgen degil");
        }

   */
            /*
   Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
   Eger calisan kadinsa;
    60 yasindan buyukse “Emekli Olabilir “yazdirin
   Eger calisan erkek ise;
    65 yasindan buyukse “Emekli Olabilir” yazdiran kodu olusturunuz
    */
/*        System.out.println("Lütfen cinsiyetinizi giriniz");
        String gender = input.next();

        System.out.println("Lütfen yasinizi giriniz");
        double yas = input.nextDouble();

       if (yas<0 && yas>120 ){
           System.out.println("lütfen 0 dan büyük 120 den kücük bir sayi giriniz");
       }  if (gender.equalsIgnoreCase("Kadin")) {

            if (yas>60){
                System.out.println("Emekli olabilir");
            }else {
                System.out.println("emekli olamaz");
            }

        } else if (gender.equalsIgnoreCase("erkek")) {
           if (yas>65){
               System.out.println("emekli olabilir");
           }else {
               System.out.println("emekli degil");
           }

        }else {
            System.out.println("Tanimli degil");
        }
*/


        for(int i=1; i<10; i=i+1) {
            if(i%3==0) {
                System.out.print(i + " ");
            }
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Başlangıç değerini giriniz");
        int bas = scan.nextInt();
        System.out.println("Bitis değerini giriniz");
        int bit = scan.nextInt();
        int carpim = 1;
        int toplam = 0;
        if(bas<=bit) {
            for(int i=bas; i<=bit; i++) {
                toplam = toplam + i;
            }
        } else {
            for(int i=bas; i>=bit; i--) {
                carpim = carpim * i;
            }
        }
        System.out.print(carpim);
        System.out.println(toplam);
        scan.close();

    }//main
}
