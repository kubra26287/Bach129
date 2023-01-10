package day19listsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists01 {
    public static void main(String[] args) { //Intewiew sorusu
        //Example: verilen bir listteki elemanlari tekrarsiz olarak yazdiriniz
        //[2,3,2,2,3,5] ==> 2,3,5
        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(3);
        myList.add(2);
        myList.add(2);
        myList.add(3);
        myList.add(5);
        List<Integer> newList = new ArrayList<>();
        for (Integer w:myList) {
            if (!newList.contains(w)){
                newList.add(w);
            }

        }
        System.out.println(newList);

    //Example 2 : Musteriden urun ismini aliniz
        // sonra Musterinin ismini verdigi urun listede varsa urunun ismini yazdiriniz
        //musterinin ismni verdigi urun listede yoksa "out of stock " yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("urun arama sistemimize hos geldiniz");
        System.out.println("Urun aramayi durdurmak icin Q ya basiniz");
        List<String> products = new ArrayList<>();

        products.add("Tv");
        products.add("Radio");
        products.add("Ipad");
        products.add("Pc");
        products.add("Notebook");
        products.add("Headphone");
        products.add("Mobile Phone");
        /*
        for loop kurunuz product listindeki her bir elemanin tum karakterlerini "set method" kullanarak kucuk harfe ceviriniz
        kullanicidan gelen urun ismini de kucuk harfe cevirin
         */
        do {System.out.println("Aradiginiz urunun ismini giriniz");//tekrar tekrar bunu görmek istersek do nun icine yazarizSystem.out.println("Urun aramayi durdurmak icin Q ya basiniz");
            String product = input.nextLine();

            if (product.equalsIgnoreCase("Q")){
                break;
            }else if (products.contains(product)){
                System.out.println(product+ " is in stock");
            } else if (!products.contains(product)) {
                System.out.println(product + " out of stock ");

            }
        }while (true);
        System.out.println("Sitemizi kullandiginiz icin tesekkur eder tekrar bekleriz");















    }
}
