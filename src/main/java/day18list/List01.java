package day18list;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class List01 {
    public static void main(String[] args) {
        //Integer bir list olusturunuz
        // list e bes tane eleman ekleyiniz
        //bu elemanlardan 12 yi siliniz

        List<Integer>ages = new ArrayList<>();
        ages.add(10);
        ages.add(25);
        ages.add(12);
        ages.add(8);
        ages.add(40);

        //siz Javada tam sayi yazdiginizda Java o tamsayinin data typ ini otomatik olarak primitive int kabul eder
        //remove methodunu n icine yazdiginiz tamsayi eleman olarak degil index olarak kabul edilir
        //tam sayiyi eleman olarak gostermenin birkac yolu vardir

        Integer nonPrimtive = 12;
       // ages.remove(nonPrimtive);


        //2.yol Recomended tavsiye edilen cunku tek bir method icinde yazilir
        ages.remove((Integer)12); //remove silmek gerek

        //3.yol
       // ages.remove(Integer.valueOf(12));//iki method kullanoldi

        //4.yol
        // ages.remove(ages.indexOf(12));//iki method kullanildi
        System.out.println(ages);


        //Integer bir list olusturunuz
        // list e bes tane eleman ekleyiniz
        //bu elemanlardan tum  12 leri siliniz

        List<Integer>nums = new ArrayList<>();
        nums.add(10);
        nums.add(25);
        nums.add(12);
        nums.add(8);
        nums.add(12);

        List<Integer>silinecekler = new ArrayList<>();
        silinecekler.add(12);
        silinecekler.add(25);
       //removeall methodu list ile calsir
        //bir veya birden fazla olan ayni elemanin tüm görünumlerini silmek icin kullanilir.aksi takdirde Java silmek istenildiginde ilk görünümü siler
        nums.removeAll(silinecekler); //butun istenilen elemanlari silmek icin removeAll gerekir ama;
                                       // bunun icin de yeni List olusturmamiz gerekir
        System.out.println(nums);



        //bu listte add methodu gibi eleman eklemek icin kisa yol 
        List<String> names = List.of("ali", "veli ", "kirk dokuz","elli");
        System.out.println(names);



    }
}
