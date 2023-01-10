package advencedPractice03;

import java.util.Scanner;

public class ArdisikSayilar {
    public static void main(String[] args) {
        //kullanicidan alinan bir sayidan baslayarak ardisik sayilari
        // 10 un katina gelene kadar yazdiran bir kod yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int number = input.nextInt();

        while (number%10!=0){
            System.out.print(number+ " ");
            number++;

        }










    }//main
}
