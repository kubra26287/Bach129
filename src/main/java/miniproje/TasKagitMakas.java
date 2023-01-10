package miniproje;

import java.util.Scanner;

public class TasKagitMakas {
    public static void main(String[] args) {
         /* TASK:
     tas >makas
     makas >kagit
     kagit >tas
Oncelikle kullanicidan secim alabilmek icin Scanner yapiyoruz.
Ardindan main fonksiyonumuzda kullanicinin ve bilgisayarin puanlarini tanimliyoruz.
While dongumuzun icerisinde kullanicidan aldigimiz secimi "secim" isimli degiskene atiyoruz.
Bilgisayarin secimini ise Math.random methodunu kullanarak aliyoruz.
Math.random()*3 diyerek bilgisayara 0 ile 3 arasinda bir rastgele sayi urettiriyoruz.
Ve secimimiz ile bilgisayarin secimini karsilastirip sonuclarini yaziyoruz.
En sonda da kullaniciya oyuna devam etmek isteyip istemedigini soruyoruz, eger istiyorsa
dongumuz en bastan calisiyor, istemiyorsa da cikis yapiyor.
 */
        Scanner input = new Scanner(System.in);

        int kullanicipuani =0;
        int pcPuani =0;
        String kullanici ="";

       while ((true) ) {
           System.out.println("Lütfen seciminizi yaziniz Tas mi? kagit mi? makas mi?");
               kullanici = input.nextLine().toLowerCase().trim();
               int pcSecimi = (int) (Math.random() * 3);
           if (kullanici.equalsIgnoreCase("Q")) {
               break;

           }else if (pcSecimi == 0) {
               System.out.println("tas");
           } else if (pcSecimi == 1) {
               System.out.println("kagit");

           } else if (pcSecimi == 2) {
               System.out.println("makas");
           }

           if (kullanici.equals("tas") && pcSecimi == 2 || kullanici.equals("makas") && pcSecimi == 1 || kullanici.equals("kagit") && pcSecimi == 0) {
               System.out.println("Tebrikler!!! ...Kazandiniz....");
               kullanicipuani++;

           } else if ( kullanici.equals("tas") && pcSecimi == 0 || kullanici.equals("makas") && pcSecimi == 2 || kullanici.equals("kagit") && pcSecimi == 1) {
               System.out.println("berabere");
           } else {
               System.out.println("kaybettiniz");
               pcPuani++;
           }
           if (kullanicipuani == 3) {
               System.out.println("oyunu basariyla bitirdiniz tebrikler");
               System.out.println("Oyuna devam etmek istemiyorsaniz Q ya basiniz");
           } else if (pcPuani == 3) {
               System.out.println("oyunu Pc kazandi!!!");
               System.out.println("Oyuna devam etmek istemiyorsaniz Q ya basiniz.");
           }



       }
    }
}
