package day03scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {



    //kullanicidan data alip kodlarimizda kullanicagiz
    //1. adim : scanner classdan obje olustur

    Scanner input = new Scanner(System.in);
    //2.aim:kullaniciya ne istediginize dair mesaji yaziniz
        System.out.println("Lutfen yasinizi giriniz");


        //3.adim:uygun methodu kullanarak kullanicinin verdigi datayi memoriye yerlestirir
        byte age = input.nextByte();
        System.out.println(age);

    }

}
    //objenin ismini "input" yaptim cunku bu obje kullanicidan alinan datayi benim kodlarimin icine koyacak
   //sistemin icine koy demek
