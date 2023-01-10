package advencedpractice.practice02;

import java.util.Arrays;

public class ArraysIkinciMax {
    public static void main(String[] args) {
         /*  4)Bir Array içerisindeki 'minimum', 'maksimum'  ve 'ikinci maksimum' değerleri bulan bir kod yazınız.(Q03_Arrays_IkinciMaksimimum)
                input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
        output: min:-90, max:10001, secMax: 8787
     */
        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int min = arr[0];
        int max = arr[arr.length-1];
        int secmax = arr[arr.length-2];
        System.out.println("min = "+min);
        System.out.println("max = "+max);
        System.out.println("secmax = "+secmax);
    }
}
