package day15arrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //Example 1 : [o,2,3,0,12,0] sifirlari en sona koyunuz       [2,3,12,0,0,0]

        //yeni bir Array olustururuz  ayni sayida veri olur icinde (a.length

        int a[] = {0,2,3,0,12,0};

        int idx = 0;

        int b[] = new int[a.length]; // [0, 0, 0, 0, 0, 0]  buradaki null larin icine ilk indexten itibaren sayilari yerlestirecek sifirlar da sonda kalmis olacak

        for (int w : a) {
            if (w!=0){     //burada basta sifirlari istemedigimiz icin sifira esit degilse al diyoruz
                b[idx] = w;  //burada sifirin haricindeki sayiyi w nin icine koyup b[idx] in icine atiyoruz
                idx++;       //w nin icine bir sayi ataninca idx artar


            }

        }

        System.out.println(Arrays.toString(b));






    }
}
