package day07ifstatement;

import java.util.Scanner;

public class IfStatement04 {
    public static void main(String[] args) {
        //Example 1: gun sayisini verdiginizde gun ismini yazan kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kacinci gun oldugunu griniz..!");
        byte num = input.nextByte();

        if(num==1){
            System.out.println("Sunday");
        }else if (num==2){
            System.out.println("Monday");
        }else if (num==3){
            System.out.println("Tuesday");
        }else if (num==4){
            System.out.println("Wednesday");
        }else if (num==5){
            System.out.println("Thursday");
        }else if (num==6){
            System.out.println("Friday");
        }else if (num==7){
            System.out.println("Saturday");
        }else {
            System.out.println("hatali giris yaptiniz. Lütfen 1 ile 7 arasinda bir sayi giriniz");
        }
        //Boundry Value Analysis -2 1 2 3 4 5 6 7 11 (BVA testi denir) bu degerlerle test edilir kodlar

    }
}
