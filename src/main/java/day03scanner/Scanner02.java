package day03scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
     //kullanicidan ilk ismini ve soyismini girmesini isteyiniz

     Scanner input = new Scanner(System.in);
        System.out.println("ilk isminizi giriniz");
     //next() method kullanicidan tek kelimeli String almak icin kullanilir.
        String firstName =input.next();
        System.out.println("soy isminizi giriniz");
        String lastName = input.next();
      //bosluk olusturmak icin cift tirnak icinde bir bosluk olacak sekilde yazilir
        System.out.println(firstName +" " + lastName);


    }
}
