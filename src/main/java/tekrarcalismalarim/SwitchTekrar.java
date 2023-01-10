package tekrarcalismalarim;

import java.util.Scanner;

public class SwitchTekrar {
    public static void main(String[] args) {
        //gün isimlerini verince kacinci gün oldugunu yazdiran kodu yaziniz
        //sunday==> 1 ...saturday==> 7

       String dayName = "Saturday";
       switch (dayName.toLowerCase()){
           case "Sunday" :
               System.out.println(1);
               break;
           case "Monday" :
               System.out.println(2);
               break;
           case "Tuesday" :
               System.out.println(3);
               break;
           case "Wendnesday" :
               System.out.println(4);
               break;
           case "Thursday" :
               System.out.println(5);
               break;
           case "Friday" :
               System.out.println(6);
               break;
           case "Saturday" :
               System.out.println(7);
               break;
           default :
           System.out.println("tanimli degil Lütfen gecerli bir gun giriniz");

       }

       // Bel!rl! b!r yılın bel!rl! b!r ayındak! gün sayısını görüntülemek !ç!n b!r kod yazınız.
       // Örnek: 2000 yılının Şubat ayında gün sayısı 29.
        int ay = 2;
        int yil = 2000;
        int gunSayisi = 0;
        switch (ay) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                gunSayisi = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                gunSayisi = 30;
                break;
            case 2:
                if (((yil % 4 == 0) && !(yil % 100 == 0)) || (yil % 400 == 0)) {
                    gunSayisi = 29;
                }else {
                    gunSayisi = 28;
                }
                break;
            default:
                System.out.println("Gecersiz Ay");
                break;
        }
        System.out.println("Gun Sayisi = " + gunSayisi );

    }
}
