package day16mutidimensionalarrays;

public class Md06 {
    public static void main(String[] args) {
      //Example bir md Arraydeki en buyuk ve en kucuk sayinin toplamin ekrana yazdiriniz


        int a[][] = {{21, 5}, {3}, {14, 70, 11}};

        int small = a[0][0];
        int big = a[0][0];

        for (int[] w : a) {
            for (int k: w) {
                small = Math.min(small, k);
            }

        }

        System.out.println(small);

        for (int[] w : a) {
            for (int k : w) {
               big =  Math.max(big, k);
            }
        }

        System.out.println("total : "+ (big+small));




    }//main
}
