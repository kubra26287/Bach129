package day16mutidimensionalarrays;


import java.util.Arrays;

public class Md04 {
    public static void main(String[] args) {


        //Md Array olusturunuz ve bir dimensional i Array e donusturunuz
        //[[2,5][3][4,7,11]] ==>  [2,5,3,4,7,11]
        int a[][] = {{2, 5}, {3}, {4, 7, 11}};

        // "a" array'indeki toplam eleman sayisini bulunuz
        int totalElement = 0;

        for (int[] w : a){
            totalElement= totalElement + w.length;
        }
        System.out.println(Arrays.deepToString(a));

        // "b" isimli tek dimensional'li bir array olusturunuz

        int b[] = new int[totalElement] ;
        System.out.println(Arrays.toString(b));//[0, 0, 0, 0, 0, 0]

// "a" array'indeki elemanlari "b" array'ine transfer ediniz

        int idx = 0;

        for (int[] w : a ) {
            for (int k : w) {
                b[idx] = k;
                idx++;
            }

        }

        //iki boyutlu Arrayden bir boyutlu Array e dondurduk
        System.out.println(Arrays.toString(b));






    }


}
