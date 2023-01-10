package day08nestedifternary;

import java.util.Scanner;

public class NestedIf01 {
    //Java nested If leri calistirirken cok zamana ihtiyac duyar (time Consuming)zaman emici
    //bu yuzden biz mumkun oldugu kadar nested If kulllanmamaya calisiriz.
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

        Scanner input =new Scanner(System.in);
        System.out.println("Ücgenin kenarlari icin uc tane uzunluk giriniz");

        //kullanici yanlislikla negatif sayi girdi ise kod Math.aps ile yazilir.
        double a = Math.abs(input.nextDouble());
        double b = Math.abs(input.nextDouble());
        double c = Math.abs(input.nextDouble());
    boolean ucgenmi = ((a+b>c && c>Math.abs(a-b)) && (a+c>b && b>Math.abs(a-c)) && (b+c>a && a>Math.abs(b-c)));
        //kullanicinin negatif sayi girmesini affetmiyorsaniz
        //en basa bir if koymamiz gerekir yani; if(a<=0 || b<=0 ||c<=0){
                                      // System.out.println("ucgenin kenarlari negatif olamaz");
                                      //ve girdigimiz kodlarda Math.abs yazilmaz

        if (ucgenmi){
            System.out.println("Sen ücgensin"); //parantez icleri mümkün oldugunca kisa yazilmalidir


            if (a==b && b==c && a==c){   //java da "a=b=c" bu sekilde yazilir
                System.out.println("ucgen hemde eskenar ücgen");
            }else {
                System.out.println("ucgen ama eskenar degil");
            }
        }else{
            System.out.println("sen ücgen degilsin");
        }

    }
}
