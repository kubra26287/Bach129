package day20passbyvaluemethodoverloading;

public class MethodOverloading01 { //ayni isimde farkli isler yapan methodlar
    /*
    1)method overloading yaparken method ismi degistirilmez
    2)method overloading yaparken parametreler  degistirilir
       i)parametre degistirirken,parametrelerin data type lari da degisebilir
       ii)parametre degistirirken, parametrelerin data Typelari farkli ise yerleri degistirilebilir
       iii)parametre degistirirken,parametrelerin sayisi degistirilebilir
     3)java icin ismi ve parametleri ayni olan iki method tamamiyla aynidir
     bu yuzden ismi ve parametre "method Signature "(method imzasi) olarak adlandirilir
     4) Method ovrloading olustururken return type ve access modifier i degistirmenin hicbir etkisi yoktur
     5)"private" methodlar overloaded edilebilir. Cunku method overloading sadece bir class in icinde olur
     private olmak ise baska classlara gidildinde problem olusturur
     6) Static methodlar overload edilebilirler
     Static olanlar klas a yapistirilir,  staticler herkes tarafindan bilinir
     non static olanlar objeye yapistirilir, non static olanlari herkes bilmeyebilir
     */
    private static void main(String[] args) {
        add(3, 5);

    }


    private static void add(int a, int b) {
        System.out.println(a + b);
    }

    private static void add(double a, double b) {
        System.out.println(a + b);

    }

    private static void add(double a, int b) {
        System.out.println(a + b);

    }

    private static void add(int a, double b) {
        System.out.println(a + b);

    }
    private static void add(int a, int b,int c) {
        System.out.println(a + b);

    }

}