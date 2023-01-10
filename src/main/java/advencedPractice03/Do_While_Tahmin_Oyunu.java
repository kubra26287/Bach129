package advencedPractice03;

import java.util.Scanner;

public class Do_While_Tahmin_Oyunu {
    public static void main(String[] args) {
        /*
        0 ile 100 arasinda rastgele numara tahmini yapan bir kod yaziniz
        ipucu: Girdiginiz numara rastgele Numaradan kucukse ==> daha buyuk bir numara giriniz
        Girdiginiz numara rastgele Numaradan buyukse ==> daha kucuk bir numara giriniz
        Girdiginiz numara rastgele Numaradan esitse ==> tebrikler!! ? tahminde sayiyi buldunuz. Puaniniz: ?
         */
        Scanner input = new Scanner(System.in);
        int rastgeleSayi = (int)(Math.random()*101);
        System.out.println("0 ile 1000 arasi bir tamsayi giriniz ");//Rastgele numara icin
        int sayi;
        do {
        sayi = input.nextInt();
        }while (sayi!=rastgeleSayi);
    }
}
