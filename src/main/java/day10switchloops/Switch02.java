package day10switchloops;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        //Example: kullanicidan iki sayi ve yapilacak islemi alan ve + - * / % islemlerini yapan kodu yaziniz

        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double a = input.nextDouble();
        double b= input.nextDouble();

        System.out.println("Yapilacak islemi giriniz. + - * / %  birini seciniz..." );

        char opr = input.next().charAt(0);

        switch(opr){
            case '+':
                System.out.println(a + "+" + b +"=" +(a+b));
            case '-':
                System.out.println(a + "-" + b +"=" +(a-b));
            case '*':
                System.out.println(a + "*" + b +"=" +(a*b));
            case '/':
                System.out.println(a + "/" + b +"=" +(a/b));
            case '%':
                System.out.println(a + "%" + b +"=" +(a*b/100));
                break;
            default:
                System.out.println("bu islem tanimlanmamistir");
        }



    }//main

}//package
