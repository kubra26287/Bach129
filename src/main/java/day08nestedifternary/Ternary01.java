package day08nestedifternary;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        //kullanicidan iki sayi aliniz "buyuk olmayan"(kucuk veya esit olan ) sayiyi yazdiriniz
        Scanner input =new Scanner(System.in);
        System.out.println("iki sayi giriniz");
        double a = input.nextDouble();
        double b = input.nextDouble();
        //1.yol:if -else

        if (a<b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
        //2.yol: Ternary condition true ise soru isaretinin hemen arkasini alir degilse sonrakini alir
        //   yani       condition  ?  condition 1  :    condition 2 false ise calisir
        double result = a<b        ?   a         :               b;
        System.out.println(result);
    }

}
