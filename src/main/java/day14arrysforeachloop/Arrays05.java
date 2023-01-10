package day14arrysforeachloop;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {
     //Note : sort() methodu sayisial data type lerini kucukten buyuge siralar (ascending order )
        //Note 2 : sort() methodu String data type lerini alfabetik olarak siralar (alphabetical order )
        //note 3; ascending order + alphabetical order ==> Natural order
        //note 4

        //Note 5: binarySearch() methodu bir elemanin bir arrayde olup olmadigini kontrol eder
        //binarySearch methodunu kullanmadan önce sort() kullanmak zorundayiz
        //sort() methodunu kullanmazsaniz buldugunuz sonuc guveniör olmaz.

        String colors[] = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));

        int num = Arrays.binarySearch(colors,"Blue");

        System.out.println(num);


        int num1 = Arrays.binarySearch(colors,"Orange");

        System.out.println(num1); // index i 3 demek


        int num2 = Arrays.binarySearch(colors,"Tarik");

        System.out.println(num2); // -6  - olursa bu eleman yok. eger olsaydi 6. karakter olurdu










    }
}
