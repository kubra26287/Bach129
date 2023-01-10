package tekrarcalismalarim;

import java.util.Scanner;

public class TekrarIfStatement01 {
    public static void main(String[] args) {
        //example 1: verilen character büyük harf ise ekrana "buyuk harf" yazdiran kodu olusturunuz
        //kücük harf ise ekrana "kucuk harf" yazdiran kodu yaziniz
        Scanner input = new Scanner(System.in);


       /* System.out.println("lütfen bir character giriniz");
        char ch = input.next().charAt(0);

        if(ch>='A' && ch<='Z'){
            System.out.println("Buyuk harf");


        }else if (ch >='a' && ch<='z'){
            System.out.println("kücük harf");
        }else {
            System.out.println("Harf degil");
        }
        //example 2: kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz
        System.out.println("LUTFEN bir sayi giriniz ");
        int s = input.nextInt();

        if (s%2==0){
            System.out.println("cift");
        }else if (s%2!=0){
            System.out.println("tek");
        }else{
            System.out.println("rakam degil");
        }



        //Example3 : verilen bir sayinin pizitif veya negatig veya notr oldugunu kontrol eden kodu yaziniz
        System.out.println("Lütfen bir sayi giriniz");
       int m = input.nextInt();
       if (m<0){
           System.out.println("negatif");
       } else if (m>0) {
           System.out.println("pozitif");


       }else{
           System.out.println("nötr");
       }

        //Example 1: gun sayisini verdiginizde gun ismini yazan kodu yaziniz
        System.out.println("lütfen gün sayisini giriniz");
        int n = input.nextInt();

        if (n==1){
            System.out.println("sunday");
        } else if (n==2) {
            System.out.println("Monday");

        } else if (n==3) {
            System.out.println("Tuesday");

        } else if (n==4) {
            System.out.println("Wednessday");

        } else if (n==5) {
            System.out.println("Thursday");

        } else if (n==6) {
            System.out.println("Friday");

        } else if (n==7) {
            System.out.println("Saturday");

        }else{
            System.out.println("Tanimli degil");
        }

        System.out.println("lütfen ay ismi giriniz");
        String ay = input.nextLine();

        if (ay.equalsIgnoreCase("Januar")){
            System.out.println("1");
        }else if (ay.equalsIgnoreCase("Februar")){
            System.out.println("2");
        }  else if (ay.equalsIgnoreCase("Marz")){
            System.out.println("3");
        }  else if (ay.equalsIgnoreCase("April")) {
            System.out.println("4");
        }  else if (ay.equalsIgnoreCase("Mai")){
        System.out.println("5");
        }  else if (ay.equalsIgnoreCase("Juni")){
            System.out.println("6");
        }  else if (ay.equalsIgnoreCase("Juli")){
            System.out.println("7");
        }  else if (ay.equalsIgnoreCase("Agust")){
            System.out.println("8");
        }  else if (ay.equalsIgnoreCase("September")){
            System.out.println("9");
        }  else if (ay.equalsIgnoreCase("Oktober")){
            System.out.println("10");
        }  else if (ay.equalsIgnoreCase("Nowember")){
            System.out.println("11");
        }  else if (ay.equalsIgnoreCase("Dezember")) {
            System.out.println("12");
        }else{
            System.out.println("Lütfen 1 den 12 ye kadar bir sayi giriniz");
        }
        */
         //  Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
       // asagidaki tabloya gore yazdiran kodu olusturunuz



        System.out.println("lütfen yasinizi giriniz");
        int d = input.nextInt();
        if (d<0){
            System.out.println("Lütfen sifirdan buyuk bir sayi grinz");
        }else if (d<5 ){
            System.out.println("Bebek");
        } else if (d<10  ) {
            System.out.println("Cocuk");

        } else if (d<16 ) {
            System.out.println("Ergen");

        } else if (d<35) {
            System.out.println("Genc");


        }else if (d<64 ){
            System.out.println("orta yasli");
        } else if (d<120) {
            System.out.println("Yasli");

        }else{
            System.out.println("tanimli degil");
        }


    }//main
}
