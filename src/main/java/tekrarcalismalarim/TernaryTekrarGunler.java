package tekrarcalismalarim;

import java.util.Scanner;

public class TernaryTekrarGunler {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Haftanin p ile baslayan gunlerini yaziniz");
        String days = input.nextLine().toUpperCase();

        String pIle = days.startsWith("P") ? ("day: " +days) : "Lutfen P ile baslayan bir gun giriniz ";
        System.out.println(pIle);



    }
}
