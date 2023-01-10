package day12forloopwhileloop;

public class WhileLoop01 {
    public static void main(String[] args) {
        //Example 1: 3 den 10 a kadar tam sayilari console a yazdiriniz

        //1.yol= for-loop
        for (int i =3; i<11; i++){
            System.out.println(i + " ");
        }
        System.out.println();
        //2.yol: while-loop
        int i= 3;

        while (i<11){
            System.out.println(i + " ");

            i++;
        }




        //Example 2       23 den 12 ye kadar cift tam sayilari console a yazdiriniz
        int k = 23;

        while (k>11){
            if (k%2==0){
                System.out.print(k + " ");
            }
            k--;
        }

        System.out.println();

        //***onemli soru:

        //Example 3 verilen bir tamsayinin rakamlari toplamini consola yazdiran kodu yaziniz
        //1.yol
        int num = -578;
        num = Math.abs(num);
        int sum = 0 ;//consolda yeni deger  alacagimiz icin yaptik bunu

        while (num>0){

            sum = sum + num%10; //"sayi % 10" her zaman sayinin son rakamini verir


            num/=10;
        }

        System.out.println(sum);

        //2.yol for loop

        int a = 684;
        int toplam = 0;//yeni data icin

        for (int m = a; m>0;m/=10){
            toplam =  toplam+ m%10;

        }
        System.out.println(toplam); //18
























    }
}
