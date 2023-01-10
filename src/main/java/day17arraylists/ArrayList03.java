package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        cities.add("Kayseri");
        System.out.println(cities);


        //remowe methodu index ile kullanilirsa index tekini siler
        String n = cities.remove(1);
        System.out.println(n); // String bir konteyner a koydugumuzda Istanbul  yazar burda hangisini sildigini gösterir
        System.out.println(cities);


        //remowe methodu eleman ile kullanilirsa  ilk gorunumu siler
        boolean p = cities.remove("Kayseri");
        System.out.println(p); //boolean bir konteyner a koyarsak bize true yada false verir
        System.out.println(cities);









    }
}
