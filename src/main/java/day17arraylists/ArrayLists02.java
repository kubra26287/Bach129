package day17arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLists02 {
    public static void main(String[] args) {

        //Array List olustururken sag taraf constructer a ArrayList yazmak zorundayiz
        // ama sol tarafa ister "ArrayList" de ister "List" de  iki turlu calisabilir
        ArrayList<Character>initials = new ArrayList<>() ;                //initials bas harfler demek

        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('B');

        //bir Listte kac eleman oldugunu nasil anlariz?
        int numOfElements = initials.size();   //arraylerde "length" listlerde "size" kullaniriz
        System.out.println(numOfElements);


        //bir Listten istenen bir eleman nasil alinir ?
        //buradaki char i java Autobuxing yapti
        char u = initials.get(2);
        System.out.println(u);

        //Example 1 : verilen bir string listteki tum elemanlarin toplam character sayisini bulam kodu yaziniz

        List<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");

        int sum = 0;
        for (String w: cities) {
            sum = sum + w.length();

        }
        System.out.println(sum);



        //2.yol

        int toplam = 0;
        for (int i = 0; i <cities.size() ; i++) {
            toplam = toplam + cities.get(i).length();
            System.out.println();
        }
        System.out.println(toplam);


        //Bir listteki istenen bir elemani nasil degistirebiliriz ?
        //indexe gidip degistirir
        cities.set(0,"New York");

        //maas List i olusturunuz ve maaslara %20 zam yapiniz
        List<Double> salary = new ArrayList<>();
        salary.add(19500.25);
        salary.add(8500.75);
        salary.add(32500.50);

        int idx = 0;
        for (Double w : salary) {
           salary.set(idx,w*1.20);
           idx++;
        }
        System.out.println(salary);

        //2. yol
        for (int i = 0; i <salary.size() ; i++) {
           salary.set(i, salary.get(i)*1.20);

        }
        System.out.println(salary);













    }
}
