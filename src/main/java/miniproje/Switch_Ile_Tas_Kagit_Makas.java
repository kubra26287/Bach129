package miniproje;

import java.util.Scanner;

public class Switch_Ile_Tas_Kagit_Makas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int kullanicipuani =0;
        int pcPuani =0;

        while (true){
            System.out.println("     Lütfen seciminizi yapiniz \n Tas icin = 0  kagit icin = 1 makas icin = 2 yi tuslayiniz");
            int kullaniciSecimi = input.nextInt();
            int pcSecimi = (int) (Math.random() * 3);

           if (kullaniciSecimi==5){
               break;

           }else if (kullaniciSecimi!=0 && kullaniciSecimi !=1 && kullaniciSecimi!=2){
               System.out.println("0 1 ve 2 degerlerini atayin");
               break;
           }

            switch (kullaniciSecimi) {
                case 0 -> System.out.println("tas");
                case 1 -> System.out.println("kagit");
                case 2 -> System.out.println("makas");


            }

                        switch (pcSecimi) {
                case 0 -> System.out.println("tas");
                case 1 -> System.out.println("kagit");
                case 2 -> System.out.println("makas");
            }
            if (kullaniciSecimi == 0 && pcSecimi == 2 || kullaniciSecimi == 2 && pcSecimi == 1 || kullaniciSecimi == 1 && pcSecimi == 0) {
                System.out.println("...kazandiniz tebrikler...");


                kullanicipuani++;

            } else if (kullaniciSecimi == pcSecimi) {
                System.out.println("...Berabere...");

            } else {
                System.out.println("   !!!kaybettiniz!!!");

                pcPuani++;
            }
            if (kullanicipuani == 3) {
                System.out.println("...oyunu siz kazandiniz...");
                System.out.println("  oyundan cikmak isterseniz 5'e basiniz \n    devam etmek isterseniz");


            }
            if (pcPuani == 3) {
                System.out.println("...oyunu pc kazandi...");
                System.out.println("oyundan cikmak isterseniz 5'e basiniz \n      devam etmek isterseniz ");


            }


        }


    }
}
