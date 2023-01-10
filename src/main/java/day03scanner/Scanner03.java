package day03scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
     //kullanicidan adresini aliniz ve ekrana yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen adresinizi giriniz" );

        //nexline() methodu kullanicidan cok kelimeli String almak icin kullanilir.

        String address = input.nextLine();

        System.out.println(address);
    }
}
