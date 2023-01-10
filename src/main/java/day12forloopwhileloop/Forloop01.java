package day12forloopwhileloop;

import java.util.Scanner;

public class Forloop01 {
    public static void main(String[] args) {
        //Example  /*
        //      Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
        //            X X X X X
        //            X X X X X
        //            X X X X X
        //*/
        Scanner input = new Scanner(System.in);
        System.out.println("satir(row) sayisini giriniz");
        int row = input.nextInt();

        System.out.println("sutun(column) sayisini giriniz");
        int column = input.nextInt();

        for (int i = 1; i<=row; i++){

            for (int k =1; k<=column; k++);
            System.out.print("X ");

        }//for
        System.out.println(); //alt satira gecmek icin yapilir bu

    }//main
}
