package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop02 {
    public static void main(String[] args) {
        /*
        kullanicidan bir tamsayi aliniz
        tamsayi 100 den kucuk ise kullaniciya kaybettiniz mesaji vererek oyunu sonlandiriniz
        tam sayi 100 ve 100den buyuk ise kazandiniz mesaji vererek oyuna devam ettiriniz
         */
        Scanner input = new Scanner(System.in);

        int num =0;
        do{
            System.out.println("bir sayi giriniz");//loopun icinde cunku tekrarli calismasi gerekir
             num = input.nextInt();

            if(num>=100){

                System.out.println("Kazandiniz");
            }

        }while (num>=100);


        System.out.println("kaybettiniz");//loop kirilirsa loopun disinda yazdirir
    }
}
