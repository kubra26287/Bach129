package variablesnighttime02;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
      //TecproEd spor salonu icin kullanicidan  isim soyisim yas; kilo; boy; salona devam edecegi ay süresi bilgilerini alip
        // aylik 20$ olarak toplam ucreti yazdiriniz.

        Scanner input = new Scanner(System.in);
        System.out.println("TecProEd spor salonuna hos gediniz");

        System.out.println("Lütfen tam isminizi giriniz");
        String Name = input.nextLine();

        System.out.println("Lütfen yasinizi giriniz");
        byte age = input.nextByte();

        System.out.println("Lütfen kilonuzu giriniz");
        double weight = input.nextDouble();

        System.out.println("Lutfen boyunuzu giriniz");
        double boy = input.nextDouble();

        int aylik_Ucret = 20;
        System.out.println("aylik_ücret =" + aylik_Ucret + "$");

        System.out.println("Lutfen uyelik suresini giriniz");
        int aylik1 = input.nextInt();

        int toplam_tutar =aylik_Ucret*aylik1;
        System.out.println("toplam_tutar =" + toplam_tutar +"$");
        System.out.println("TamIsim = " +Name +"\nyasiniz =" + age +"\nkilonuz = " +weight +"\nboyunuz =" +boy +"\nodemeniz gereken toplam tutar="+ toplam_tutar +"$");








    }
}
