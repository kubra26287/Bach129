package tekrarcalismalarim;

import java.util.Scanner;

public class TekrarCalismalar02 {
    public static void main(String[] args) {



           //Scanner
       //Ex1:kullaniciya ad,memleket,yas,boy, yasadigi yeri sevip sevmedigini soran bir kod yaziniz.
        Scanner input = new Scanner(System.in);
       /* System.out.println("lütfen tam adinizi giriniz");
        String name =input.nextLine();
        System.out.println(name);

        System.out.println("lütfen yasinizi giriniz");
        int age = input.nextInt();
        System.out.println(age);

        System.out.println("lütfen boyunuzu giriniz");
        double boy = input.nextDouble();
        System.out.println(boy);

        System.out.println("lütfen memleketinizi giriniz");
        String mem = input.next();
        System.out.println(mem);

        System.out.println("yasadiginiz yeri seviyor musunuz?");
        String yer = input.nextLine();
        System.out.println(yer);

        //Ex2: Kullanicidan sayilari alarak toplama islemi yaptiran kodu yaziniz.
        System.out.println("lutfen iki tam sayi giriniz");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("toplama = " + (a+b)); //parantez icine almazsan yanyana yaziyor

        //Ex3 : Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindak
        // rakamlari toplamini yazdiran kodu yaziniz

        System.out.println("Lütfen bes basamakli bir sayi giriniz ");
        int number = input.nextInt();
        int lastdigit = number%10;
        System.out.println(lastdigit);
        int lastDigit1 =number%10;
        number = number/10;
        System.out.println(lastDigit1);
        int lastDigit2 = number%10;
        number = number/10;
        System.out.println(lastDigit2);
        number = number/10;
        int lastDigit3 = number%10;
        number = number/10;
        System.out.println(lastDigit3);
        int lastDigit4 = number%10;
        number = number/10;
        System.out.println(lastDigit4);
        System.out.println("toplama = " +(lastdigit + lastDigit1 + lastDigit3 + lastDigit4));*/

        //Ex4:Kullanicidan bir dirkdörtgenin en ve boyunu alan ve hesaplayan kodu yaziniz.
        // Dirtdörtgenin alani= en*boy Dirtdörtgenin cevresi 2*(en+boy)
        System.out.println("lütfen iki tane uzunluk giriniz");
        double sideLenght = input.nextDouble();
        double sideLenght1 = input.nextDouble();
        System.out.println("Dikdortgenin alani = " +(sideLenght1*sideLenght));
        System.out.println("dikdörtgenin cevresi = " +(2*(sideLenght1 + sideLenght)));

    /*Ex5:Kullanicidan aldiginiz sekil ile asagidaki gibi bir gorsel olusturunuz

          A
         A A
        A A A  */
        System.out.println("lütfen 3 satirlik pramitten bir sekil olusturunuz");
        String sekil = input.nextLine();
        System.out.println();







    }//main
}//package
