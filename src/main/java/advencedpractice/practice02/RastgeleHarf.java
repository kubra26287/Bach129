package advencedpractice.practice02;


import java.util.Locale;

public class RastgeleHarf {
    public static void main(String[] args) {
        System.out.println(rastgeleHarf());


       // String x;
      //  do {
      //      x = rastgeleHarf();
      //      System.out.println(x);
      // }while (!x.equals("z"));   burasi z var mi diye test etmek icin
         String rastgeleHarf = rastgeleHarf();
        switch (rastgeleHarf){
            case "A":
                System.out.println("ilk karakter");
                break;
            case "B":
                System.out.println("ikinci karakter");
                break;
            case "C":
                System.out.println("ucuncu karakter");
                break;
            case "D":
                System.out.println("dorduncu karakter");
                break;
            default:
                System.out.println("diger karakter");
        }
    }
    public static String rastgeleHarf() {
        String alfabe = "ABCDEFGHIJKLMNOÖPRSTUÜVYZXWQ";
        int maxIndex = alfabe.length();
        int rastgeleSayi = (int) (Math.random() *maxIndex);
        return alfabe.substring(rastgeleSayi,rastgeleSayi+1);


    }

}
