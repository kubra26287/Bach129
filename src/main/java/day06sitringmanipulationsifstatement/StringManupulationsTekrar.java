package day06sitringmanipulationsifstatement;

import java.util.Locale;

public class StringManupulationsTekrar {
    public static void main(String[] args) {
        String s = "   Ali Can   ";
        System.out.println(s);

        String sTrimmed = s.trim();
        System.out.println(sTrimmed);

        String tv = "$456.99";
        String laptop = "$875.99";
        String tv1 = tv.replace("$","");
        System.out.println(tv1);

        String laptop2 = laptop.replace("$","");
        System.out.println(laptop2);
        double totalPrice = Double.valueOf(tv1) + Double.valueOf(laptop2);
        System.out.println(totalPrice);

        String name = "   ali cAN   ";
        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);
        char second = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println("" + first + second);

        String teve = "$456.99";
        String lapTop = "$875.99";

        String teve1 = teve.replace("$","");
        String lapTop1 = lapTop.replace("$","");

       double toplamÜcret = Double.valueOf(teve1) + Double.valueOf(lapTop1);
        System.out.println(toplamÜcret);

        String namee = "   ali CAN   ";
        char firstt = namee.trim().toUpperCase().charAt(0);
        System.out.print(firstt);
        char secondd = namee.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(secondd);

        String str = "";
        boolean str1 = str.length()==0;
        System.out.println("String bos mu : " + str1);

       boolean str2 = str.isEmpty();
        System.out.println("string bos mu ? : "+str2);

        int numberr = 30;

        if(numberr>-1 & numberr<10){
            System.out.println("Rakam");



            int m = -100;

            m = Math.abs(m);
            if(m>99 && m<1000) {
                System.out.println("Wooow!");
            }

        }













    }



}
