package tekrarcalismalarim;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Advenced {
    public static void main(String[] args) {
      //  1)Kullanicidan alinan bir sayinin ilk ve son rakamlari toplamini toplayan kodu yaziniz.(Q06_WhileLoop_IlkVeSonRakam)



        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int sayi = input.nextInt();

        //sayi =Math.abs(sayi);
       int sonrakam = sayi%10;
        System.out.println(sonrakam);

       int ilkRakam = sayi;

        while(ilkRakam>9){
            ilkRakam/=10;

        }
        System.out.println(ilkRakam);
        System.out.println(sonrakam + ilkRakam);

        //2.yol
        String sayiString = String.valueOf(sayi);
       int  ilkrakam = Integer.parseInt(sayiString.substring(0,1));
       int sonRakam = Integer.parseInt(sayiString.substring(sayiString.length()-1));


      //  2)Adınızın içerdiği harfleri ve ascii table kullanmadan, adınızı yazdıran bir kod yazınız.(Q01_Ascii_AdiniYaz)
        char ch1 = 'B'-1;
        char ch2 = 'M'-1;
        char ch3 = 'J'-1;
        System.out.println(""+ch1+ch2+ch3);

        /*   3)
        katsayıları verilen 1 bilinmeyenli denklemin kökleriniz bulunuz.
        ax² + bx + c;
        Çözüm adımları
        kullanıcıdan a,b,c yi alın.
        Diskriminant formülü: (-b +/- karekök(delta)) / (2a)
        Delta = bb - 4ac
        Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
        Delta = 0 => 1 tane kök vardır x = -b/2a
        Delta < 0 ise kök yoktur.(Q02_If_Diskriminant)
       */
        System.out.println("lütfen 3 tane sayi giriniz");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double delta = b*b - 4*a*c;
        System.out.println(b+"*"+b+" - "+(4*a*c));

        if (delta>0){
          double x1= (-b + Math.sqrt(delta)) / (2*a);
            System.out.println(x1+" = iki tane kök vardir");
          double x2= (-b - Math.sqrt(delta)) / (2*a);
            System.out.println(x2+" = iki tane kök vardir");

        } else if (delta==0) {
          double  x = -b/2*a;
            System.out.println(x+" = 1 tane kök vardir");

        }else {
            System.out.println("denklemin kökü yoktur");
        }

      /*  4)Bir Array içerisindeki 'minimum', 'maksimum'  ve 'ikinci maksimum' değerleri bulan bir kod yazınız.(Q03_Arrays_IkinciMaksimimum)
                input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
        output: min:-90, max:10001, secMax: 8787
     */
        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

          int min = arr[0];
          int max = arr[arr.length-1];
          int secmax = arr[arr.length-2];
        System.out.println("min = "+min);
        System.out.println("max = "+max);
        System.out.println("secmax = "+secmax);


     /*   5)Rastgele bir harf veren bir method oluşturun ve ardından methodu kullanarak aşağıdakileri yazdırınız.(Q04_RandomMethod_RastgeleHarf)
        ‘A’ ve ‘a’ için “İlk Karakter” yazdırınız.
        ‘B’ ve ‘b’ için “İkinci Karakter” yazdırınız.
        ‘C’ ve ‘c’ için “Üçüncü Karakter” yazdırınız.
        ‘D’ ve ‘d’ için “Dördüncü Karakter” yazdırınız.
                Diğerleri için “Diğer Karakterleri” yazdırınız.
  */










    }
}
