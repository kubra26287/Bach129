package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class Lists04 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ajda");
        names.add("Cuneyt");
        names.add("Mahsun");
        names.add("Muslum");
        names.add("Orhan");

        List<String> females = new ArrayList<>(); //females :kadin
        females.add("Ajda");
        females.add("Emel");
       boolean r =  names.containsAll(females);//names in icinde Ajda ve emel  var mi?
                                               //bu false return eder Cunku ajda var ama  emel listin icinde yok
                                               //contains methodu tum elemanlarin var olup olmadigini kontrol eder

        System.out.println(r);

        //names.subList (1,3) "names" Listindeki index'i  1,2 olan elemanlari bir Listin icinde verir
        //ikinci index dahil degil
        List<String> sublist = names.subList(1,3);
        System.out.println(sublist);

        names.retainAll(females); //ilk list olan names den siler ve ortaklari verir ikinci olan listte "females e dokunmaz
        System.out.println(names);
        System.out.println(females);
        //Example elektronik aletler ve ev aletleri listleriniz var
        //elektrronik ev aletlerini listeleyiniz

        List<String> electronics =new ArrayList<>();

        names.add("TV");
        names.add("Radio");
        names.add("Refrigerator");
        names.add("Mobile Phone");
        names.add("Notebook");

        List<String> homeGoods = new ArrayList<>();
        homeGoods.add("Carpet");
        homeGoods.add("fork");
        homeGoods.add("Radio");
        homeGoods.add("Chair");
        homeGoods.add("Tv");

        homeGoods.retainAll(electronics);

        System.out.println(homeGoods);


        //Listte hic eleman yoksa size true verir  1 veya daha fazla eleman varsa size false verir
        names.isEmpty();

        System.out.println(names.hashCode()); // Javanin urettigi adresi verir. bir teknik uygular ve bunu numaralandirir
        //uretilen datayi unic yapmaya hashing technique denir



    }

}
