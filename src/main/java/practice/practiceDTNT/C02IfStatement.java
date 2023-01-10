package practice.practiceDTNT;

import java.util.Scanner;

public class C02IfStatement {
    public static void main(String[] args) {
        /*
        kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
        dört islemden biri ile isleme koyup yazdiriniz
         */
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen\n toplama yapmak icin 1\n cikarma yapmak icin 2\n carpma yapmak icin 3\n bölme yapmak icin 4\n  giriniz");
        int islem = input.nextInt();
        System.out.println("lütfen iki tam sayi giriniz");
        double num1 = input.nextDouble(); //1. sayi assign edildi
        double num2 = input.nextDouble(); //2.sayi assign edildi

        if (islem==1){
            System.out.println("Toplama islemini sonucu :"+num1 + "+" +num2+ "="+(num1+num2));

        } else if (islem==2) {
            System.out.println("cikarma islemini sonucu :"+num1 + "-" +num2+ "="+(num1-num2));

        } else if (islem==3) {
            System.out.println("carpma islemini sonucu :"+num1 + "*" +num2+ "="+(num1*num2));

        } else if (islem==4) {
            System.out.println("bölme islemini sonucu :"+num1 + "/" +num2+ "="+(num1/num2));

        }else{
            System.out.println("hatali secim yaptiniz tekrar deneyiniz");
        }
    }
}
