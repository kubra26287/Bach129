package day13whileloopdowhileloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        int a = 12; //bu yapinin icinde sadece bir tane data depolana
        //bilir ama biz code yazarken bir yapinin icinde coklu data depolama ihtiyaci hissederiz
        //bir yapinin icinde coklu data depolayabilme icin Java "Array yapisini olusturmustur.

        // note : bir konuyu anlamak icin ne nasil basit sorular orta derece sorulaar zor sorulari
        // kavramak ve projeyi yapmak gerekir

        //Array nasil olusturulur
        //arry olusturmak icin hangi datayi kullanacaginiza karar vermeniz ve data type ini yazmak gerekir cunku tek data icine coklu data yazicaz

        String stdNames[] = new String[5]; // array e kac eleman '5 koyacagimizi söylemek zorundayiz
        //Array console a nasil yazdirilir
        //toString methodunu kullanmadan sadcece array ismi ile yazdirirsaniz java Array in adresini yazdirir
        System.out.println(Arrays.toString(stdNames));//null null null null null
                                                       //arraylar stringler gibi index i alir her eleman bir index olacak sekilde numaralandirilir
        //Array e eleman ekleme nasil yapilir?
        stdNames[0] = "Cuneyt";
        stdNames[1] = "kemal";
        stdNames[2] = "Ajda";
        stdNames[3] = "ezel";
        stdNames[4] = "Besir";
        System.out.println(Arrays.toString(stdNames)); // cuneyt kemal ajda ezel besir


         // Arrayden specific bir elemani almak
        System.out.println(stdNames[2]); // Kemal yazar

        //Example 1 Array deki her elemani sonuna ! israreti koyarak ekrana yazdiriniz
        for (int i = 0 ; i<stdNames.length;  i++){
            System.out.println(stdNames[i] + "!");
        }





    }
}
