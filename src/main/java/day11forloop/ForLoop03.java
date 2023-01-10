package day11forloop;

public class ForLoop03 {
    public static void main(String[] args) {
        //Example size verilen bir stringi tersten yazdirin  //interwiew sorusu
        // "Germany" ==> ynamreG
        String s = "Germany";
        String t  = ""; //t ters


        for (int i = s.length()-1;    i>=0;   i--){
           t = t + s.charAt(i);

        }
        System.out.println(t); //yazdirma islemini looptan sonra yapariz
                               // eger loopun icine koyarsak degisimleri asama asama yazdirir



        //Example size verilen bir stringin "Palindrome" olup olamdigini kontrol eden kodu yazdirin
        // civic nalan kucuk 11211 ==> Palindrome
         // logic :Stringi ters ceviricez once
        //sonra düz haliyle ters halini karsilastir, ayni ise "Palindrome" de
        String duz = "civic";  //eger büyük kücük harf olursa palindrom degildir der
                                //bu yuzden equals ignorcase kullanabiliriz

        String ters = ""; //bir stringi ters cevirince yeni bir data girilir

        for (int i =duz.length()-1; i>=0; i--){
            ters = ters + duz.charAt(i);
        }
        if (duz.equalsIgnoreCase(ters)){
            System.out.println(duz + " : Palindrome dur");
        }else{
            System.out.println(duz + " : Palindrome degildir");
        }






    }




}
