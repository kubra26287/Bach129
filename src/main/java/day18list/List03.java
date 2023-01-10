package day18list;

import java.util.ArrayList;
import java.util.List;

public class List03 {
    public static void main(String[] args) {
        //Example 2 : bir Integer List deki 7 haric tum elemanlarin degerlerini 3 artiriniz
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(13);
        nums.add(7);
        nums.add(12);
        nums.add(11);

        //1.yol

        for (Integer w:nums) {
            if (w==7){
                continue;
            }
            nums.set(nums.indexOf(w),w+3);
        }
        System.out.println(nums);//[15, 16, 7, 14]

        //2.yol

        for (int i = 0; i <nums.size() ; i++) {
            int element = nums.get(i);
            if (element==7){
                continue;
            }

            nums.set(i,element +3);
        }
        System.out.println(nums);
        /*
        Nums.indexOf(w) ilk gorunumun indexini verir . List tekrarli elemana sahip ise nums.indexOf (w) kullanimi risk olusturur
        bu yuzden en guvenli yol for-loop tur.indeksi kendisinde var zaten
         */






    }
}
