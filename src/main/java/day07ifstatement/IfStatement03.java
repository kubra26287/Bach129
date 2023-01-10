package day07ifstatement;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {
        //Example3 : verilen bir sayinin pizitif veya negatig veya notr oldugunu kontrol eden kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz..!");
        int num = input.nextInt();
        if(num>0){
            System.out.println("pozif..");
        }else if (num<0){
            System.out.println("Negatif");
        }else{
            System.out.println("Notr");
        }

    }
}
