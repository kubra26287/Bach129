package day11forloop;

public class ForLoop01 {
    public static void main(String[] args) {
        //example 1:  Verilen bir string de ilk 'a' harfinden önceki tüm character'leri console'a yazdiriniz
        // "I love Java" ==> "I love J"
        //en son characterin index i length ()-1 dir
         String s = "I love Java";
        //            i<7
        for(int i=0; i<s.length() ; i++  ) {

            char ch =s.charAt(i);
            if (ch == 'a') { //eger character a ise loop u kir
                break;
            }
            System.out.println(s.charAt(i));
        }
            System.out.println(); // araya bos saot koyunca tekrar harfleri kullanabiliriz

            //example 2:
            //verilen bir stringde son a dan sonraki tüm characlari ters sirada yn olarak yazdiriniz
            // "Germany " ==>yn

            String t = "Germany";

            //         i=6
            for (int i = t.length() - 1; i >= 0; i--) {  // son character lenght-1 dir

                char ch = t.charAt(i); //tek seferde yazmak icin char konteynerinda charat (i) kullaniriz tekrara gerek kalmaz
                  if (ch =='a') {
                      break;

                  }

                      System.out.print(ch);
            }




    }//main

}
