package day16mutidimensionalarrays;

import java.util.Arrays;

public class Md02 {
    public static void main(String[] args) {
        //Example 1 : bir int  Md array olurturunuz  toplam Eleman sayisini  console a yazdiriniz
        int a[][] = {{13,213,4}, {12,87}, {4,7,1,9}, {99}};  //icerdekilerin data type i Arraydir ama int arraydir
        System.out.println(Arrays.deepToString(a));

        int sum = 0;
        for (int[] w : a) {                  //for each'ler  en distaki array icin kurulur
            sum = sum +w.length;             // int[]'a  distaki Arraydeki elemanlarin data type i konulur
                                             // w'nun icine Arrayler gelir
        }
        System.out.println(sum);











    }//main
}
