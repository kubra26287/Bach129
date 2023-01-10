package day16mutidimensionalarrays;

import java.util.Arrays;

public class Md05 {
    public static void main(String[] args) {
        //bir int md Array olusturunuz bu Arraydeki tum
        // elemanlarin carpimini konsola yazdiran kodu yaziniz
    int a[][] = {{1,2},{2,3},{3,4}};
    int multipl = 1;

        for (int[] w : a) {
            for (int k : w) {
                multipl = multipl * k;
            }

        }

        System.out.println(multipl); //144













    }
}
