package practice.practiceDTNT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayList02 {
    public static void main(String[] args) {
        //Example musterinizin istedigi urunun stoklariniz da olup olmadigini gösteren kodu yaziniz
        //Stokta varsa o urunu "Ayrildiya " ceviriniz yoksa o urunu Liste ekleyiniz
        //[A,K,R,S] ==> R ==>[A.K.Arildi S]
        //[A,K,R,S] ==> X ==> [A,K,R,S,X]

        Scanner input = new Scanner(System.in);
        List<String> c = new ArrayList<>();
        c.add("A");
        c.add("K");
        c.add("R");
        c.add("S");

        String urun = "";

        do {
            System.out.println("Lutfen istediginiz urunun harfini giriniz");
            urun=input.next().substring(0,1);
            if (c.contains(urun)){
                c.set(c.indexOf(urun),"ayrildi");
            } else if (!urun.equals("Q")) {
                c.add(urun);

            }
            System.out.println(c);
        }while (!urun.equals("Q"));
        System.out.println();
        //EXAMPLE BIR LISTTEKI ELEMANLARDAN BIRBIRINE EN YAKIN OLAN IKISINI BULUNUZ
        //[12,19,15,30,21] ==> 19 VE 21

        List<String> a = new ArrayList<>();
        a.add("12");
        a.add("19");
        a.add("15");
        a.add("30");
        a.add("21");

        System.out.println(a);
        Collections.sort(a);
        System.out.println("a "+a);




    }
}
