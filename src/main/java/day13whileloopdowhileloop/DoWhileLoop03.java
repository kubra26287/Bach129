package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {
    public static void main(String[] args) {
        /*
        username= "admin"      password ="pwd123"
        kullanicidan username ve passwordu alin
        username ve password dogru ise console a "hesabiniza hos geldiniz"
        username veya password yanlis ise 3 kere Username ve passyordunuzu giriniz mesaji versin
        username veya password 4. kere yanlis girilirse hesabiniz bloke olmustur mesaji vererek islemi tamamlayiniz
         */

        Scanner input =  new Scanner(System.in);


       int counter = 0; //counter sayac demek


       do {
           if (counter==4){ //3 kereden fazla yanlis girdiyse calisir
               System.out.println("Hesabiniz bloke olmustur!");
               break; //hesabi bloke etmek icin
           }
           System.out.println("Username i giriniz"); //
           String userName = input.next();

           System.out.println("Passwordu giriniz");
           String password = input.next();

           if (userName.equals("admin") && password.equals("pwd123")){  //eger password ve isim dogru ise calisacagi icin if kullandik
               System.out.println("hesabiniza hos geldiniz");
               break; //tekrar tekrar passwordunuzu giriniz dememesi icin
           }
           counter++;

       }while (true);


    }
}
