package day07ifstatement;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {


        //example 1: verilen character büyük harf ise ekrana "buyuk harf" yazdiran kodu olusturunuz
        //kücük harf ise ekrana "kucuk harf" yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir character griniz..!");

        //1. yol:
        char ch = input.next().charAt(0);
        //kullanicidan character girmesini istedigimizde charAt methodunu kullan


        if (ch>='A'&& ch<='Z') {
            System.out.println("Buyuk Harf...!");
        }

        if(ch>='a'&& ch<='z'){
            System.out.println("Kucuk Harf...!");
        }
        //2.yol

        if (ch>='A'&& ch<='Z') {

            System.out.println("Buyuk Harf...!");

        }else{if(ch>='a'&& ch<='z'){

            System.out.println("Kucuk Harf...!");

        }else{ //sonraki ihtimallerin hepsi icin
            System.out.println("Harf degil..");

        }
        }


    }
}
