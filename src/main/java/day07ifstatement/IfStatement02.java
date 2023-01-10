package day07ifstatement;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        //example 2: kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz..!");
        int num = input.nextInt();

        //1.yol:
        if (num%2==0) {
            System.out.println("Cift Sayi ..");

        }

        if(num%2!=0){
            System.out.println("tek Sayi ..");

        }

        //2.yol:
        if (num%2==0) {
            System.out.println("Cift Sayi ..");

        }else{
            System.out.println("Tek sayi...");
        }



    }


}
