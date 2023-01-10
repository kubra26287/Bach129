package day10switchloops;

public class Loops01 {

    /*
    code Standarts
    tekrar (repetition) olmamalidir
    dinamic olmalidir
    tamir(fix) ve update(gelistirme) kolay yapilabilmelidir

     */
    public static void main(String[] args) {
        //Example 1 : ekrana bes kere "Hi" yazdiriniz
        //1.yol : tavsiye edilmez
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //2.yol
        //ayni adimlar yapilmasi gerektigin de biz loop lari kullaniriz.
        //dort tane loop var 1. for_loop 2. while-loop 3.do-while-loop 4.for-each-loop

        //1 : for-loop  //for-loop da genellikle i deger ismi olarak kullanilir
        //   baslangic degeri      loop un calisma sarti              increment/decrement
        for (int i = 1;                    i < 6;                         i++) {
            System.out.println("Hi");

        }
        //11 den 44 e kadar tum tam sayilari ekrana yazdiran kod
        for (int i = 11; i < 45; i++) {
            System.out.println(i);
        }
        //Example 3 : 40 dan 23 e kadar tum cift tamsayilari ekrana yazdir
        // note: yazdir ama cift sayi yazdir buda if gerektirir

        for (int i = 40; i > 22; i--) {
            if (i %2 != 0) { //burada sonuc sifira esit degildir dersek tek sayi verir bize
                System.out.print(i +" ");
            }


        }

    }



}






