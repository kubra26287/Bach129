package tekrarcalismalarim;

import java.util.Scanner;

public class Tekrarr {
    public static void main(String[] args) {
        //Example 1: Verilen bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz
//           "I love Java" ==> "I love J"
        String d = "I love Java";
        for (int i = 0; i <d.length() ; i++) {
            char ch = d.charAt(i);
            if (ch=='a'){
                break;
            }
            System.out.print(ch);
        }

        System.out.println();

        //Ex1 size verilen bir Stringi tersten yazdiriniz.
// "Germany" ==>ynamreG
          String str = "Germany";
          String rts = "";
        for (int i = str.length()-1; i >=0  ; i--) {
           rts = rts + str.charAt(i);

        }
        System.out.println(rts);


       // 1: Verilen bir String'de 'a' character'i haric tum character'leri yazdiriniz.
//           "Madagaskar" ==> Mdgskr
      String s = "MAdagAskar";
    //  String s1 = s.toLowerCase().replaceAll("a","");
    //   System.out.println(s1);


        for (int i = 0; i <s.length() ; i++) {
                   char ch = s.toLowerCase().charAt(i);

                   if (ch=='a'){
                       continue;
            }
            System.out.print(ch);
        }


        /* Example 1: Asagidaki ciktiyi verecek kodu yaziniz
        Week: 1
        Day: 1
        Day: 2
        Day: 3
              .....
        Week: 2
        Day: 1
        Day: 2
        Day: 3
              ....
        Week: 3
        Day: 1
        Day: 2
        Day: 3
              ....
*/
        for (int i =1; i <5; i++) {
            System.out.println("week :" + i);

            for (int j =1; j <8 ; j++) {
                System.out.println("Day :" +j);
            }

        }

        //Ex: Verilen bir string'de son 'a'dan sonraki tüm kararkterleri ters sirada yazdirin.
        // Germany==>yn
        String m = "Germany";

        for (int i =m.length()-1; i >= 0; i--) {
            char ch = m.charAt(i);
            if (i=='a'){
                break;
            }
                System.out.print(ch);


        }


        System.out.println();

    /*
      Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
    X X X X X
    X X X X X
    X X X X X
    */
        int row = 3;
        int column = 5;
        for (int i =1; i <=row ; i++) {

            for (int j =1; j <=column ; j++) {

                System.out.print("X ");
            }
            System.out.println();
        }

        //example 1: verilen character büyük harf ise ekrana "buyuk harf" yazdiran kodu olusturunuz
        //kücük harf ise ekrana "kucuk harf" yazdiran kodu yaziniz

      /*  Scanner scan = new Scanner(System.in);
       System.out.println("lutfen bir harf giriniz");
        char ch = scan.next().charAt(0);

      if (ch>='A'&&ch<='Z'){
            System.out.println("buyuk harf");

        }else if (ch>='a'&& ch<='z'){
            System.out.println("kucuk harf");
        }else{
            System.out.println("lutfen bir harf giriniz");
        }
*/
        //example 2: kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz
        int nummer = 2;

        if (nummer%2==0){
            System.out.println("cift sayi");

        } else if (nummer%2==1) {
            System.out.println("tek sayi");

        }
        }
}
