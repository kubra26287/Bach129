package day22staticblacksconstructors;

public class StaticBlacks01 {

    //bir variable olusturdugunuzda deger atamazsaniz o variable i "initialize" (inischelayz) etmediniz demektir
    //Static variable lar static blacklar icinde initialize edilirse
    // o classin icinde herseyden once hazir hale getirilmis olur
    //Bazen main method calistirilmadan once variable larin hazir hale getirilmesi gerekir
    // bu yuzden static block'lar kullanilir

    //Note 1 Static blocklar static variable lari initialize etmek icin kullanilir
    //Note 2 static blocklar clas icinde herseyden once calistirilirlar
           static double pi;
           static String shape;
    static{
        pi = 3.14;
        System.out.println("Static block");
    }
    static{
        shape = "circle;";
        System.out.println("satic block");

    }

    public static void main(String[] args) {
        System.out.println("main method");

    }


    }