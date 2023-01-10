package day07ifstatement;

import java.util.Scanner;

public class IfStatement05 {
    public static void main(String[] args) {
        //Example 1 : ay isimleri girilince kacinci ay oldugunu yazan kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ay ismi griniz..!");
       String monthName = input.next();

        if(monthName.equalsIgnoreCase("January")){   //equals; String ifadelerde esittir yerine kullanilir.
                                                        //equals sadece degerlerine bakar
            System.out.println(1);                     //equalignoreCase(); kücük büyük ifadeleri görmezden gel demek
        }else if(monthName.equalsIgnoreCase("February")){
            System.out.println(2);
        }else if(monthName.equalsIgnoreCase("March")){
            System.out.println(3);
        }else if(monthName.equalsIgnoreCase("April")){
            System.out.println(4);
        }else if(monthName.equalsIgnoreCase("May")){
            System.out.println(5);
        }else if(monthName.equalsIgnoreCase("June")){
            System.out.println(6);
        }else if(monthName.equalsIgnoreCase("July")){
            System.out.println(7);
        }else if(monthName.equalsIgnoreCase("August")){
            System.out.println(8);
        }else if(monthName.equalsIgnoreCase("September")){

            System.out.println(9);
        }else if(monthName.equalsIgnoreCase("October")){
            System.out.println(10);
        }else if(monthName.equalsIgnoreCase("November")){
            System.out.println(11);
        }else if(monthName.equalsIgnoreCase("December")){
            System.out.println(12);
        }else{
            System.out.println("Invalid month name...");
            //equals; String ifadelerde esittir yerine kullanilir.
            //equals sadece degerlerine bakar
            // equalignoreCase(); kücük büyük ifadeleri görmezden gel demek

            //Note: String'lerin esitliklerini kontrol ederken "==" yerine "equals()" kullaniriz.
            //      Niye ?
            //      Cunku; "==" sembolu iki String'i karsilastirirken hem adres'lerine hem de degerlerine bakar,
            //      ikisi de ayni ise siz String'ler esittir der ama biz code yazarken genellikle String'lerin
            //      adres'leri ile degil degerleri ile ilgileniriz. Bu yuzden String karsilastirmalarinda "==" kullanmayiz.
            //
            //      "equals()" metho'u ise iki String'i karsilastirirken sadece degerlerine bakar, degerler ayni ise
            //      bu iki String esittir der degerler farkli ise bu iki String farklidir der ki bu bizim kod yazarken
            //      ihtiyac duydugumuz seydir.
            String s = "tom";
            String t = "Terry";
            String r = new String("tom");
            String m = "Tom";

            System.out.println(s==t);// false cunku adresler ve degerler farkli
            System.out.println(s.equals(t)); //false cunku degerler farkli
            System.out.println(s==r);//false cunku adresler farkli
            System.out.println(s.equals(r));//true verir; cunku sadece degere bakar ve ayni oldugu icin true der.
            System.out.println(s==m);//



        }

    }
}
