package day16mutidimensionalarrays;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {
        // array in elemanlarini da array yapmaya multidimensionalarray denir
        //      [  [5,12], [81,45], [123,0]  ] array icinde array buradaki iki boyutlu
        //      index 0       1        2       [5,12] [81,45] bunlarda  kendi iclerinde 0 1 2 diye index sayisi alir
        //       a[0][1]   a[1][0]  a[2][1]
        //distaki Array e Outer array denir
        //ictekine inner  Array denir


        //multiDimensional Array nasil olusturukur

        //[  [5,12], [81,45], [123,0]  ]
        int a[][] = new int[3][2];  //ilk arrayde arrray sayisi ikinci de o arrayin icindeki eleman sayisi

        //multiDimensional Array nasil yazdirilir
        System.out.println(Arrays.deepToString(a));  // Array icindeki arrayi yazdirmak icin bu kullanilir dibine kadar yazdir

        // //multiDimensional Arraylere eleman nasil eklenir
        a[0][0]= 5;//ilk 0 distaki Array sonraki icteki Array
        a[1][1]= 45;
        a[2][0]= 123;
        a[0][1]= 12;
        a[1][0]= 81;
        a[2][1]= 0;
        System.out.println(Arrays.deepToString(a));

        //note: Arraylere non-primitive data konulamaz
        //Arraylere primitive veya reference konulur
        String b [] = {"tom","Hanks","tom Hanks"};  //arrayin icinde adresleri vardir
        //ama siz bir Array yazdirmak istediginizde Java adresler yardimi ile non-primitive dataya ulasir
        // ve o non-primitive datayi sanki arrayin icindeymis gibi gosterir

        //Multidimesional arraylerdeki belli elemanlara nasil ulasilir
        //[  [5,12], [81,45], [123,0]  ]
        System.out.println(Arrays.toString(a[2]));//[123,0] bu Arraydeki ikinci arayin icini yazdirir
        System.out.println(a[1][0]); // 81   bu da 1 arrayinin icindeki 0indexindeki elemani verir
        System.out.println(Arrays.toString(a[0])); //[5 ,12]








    }//main
}
