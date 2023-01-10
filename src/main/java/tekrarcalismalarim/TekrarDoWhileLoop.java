package tekrarcalismalarim;

import java.util.Scanner;

public class TekrarDoWhileLoop {
    public static void main(String[] args) {
       /* kullanicidan bir tamsayi aliniz
        tamsayi 100 den kucuk ise kullaniciya kaybettiniz mesaji vererek oyunu sonlandiriniz
        tam sayi 100 ve 100den buyuk ise kazandiniz mesaji vererek oyuna devam ettiriniz
                */

        Scanner input =new Scanner(System.in);


        int num = 0;
        do {
            System.out.println("lütfen bir tamsayi giriniz");
             num = input.nextInt();
            if (num>=100){
                System.out.println("kazandiniz");
            }


        }while(num>=100);
            System.out.println("kaybettiniz");

    }
}
