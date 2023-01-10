package day14arrysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //Example 1 : string array olusturun icine 5 tane eleman ekleyin
        //ilk eleman ile son elemanin icerdigi character sayilari toplamini ekrana yazdirin

        String arr[] =new String[5];

        arr[0] = "Math";
        arr[1] = "Science";
        arr[2] = "Music";
        arr[3] = "Englisch";
        arr[4] = "Art";

        System.out.println(Arrays.toString(arr));

        System.out.println(arr[0].length() + arr[arr.length-1].length());

        //Example 2:string array olusturun icine 5 tane eleman ekleyin
        //        //tum elemanlarin icerdigi character sayilari toplamini ekrana yazdirin

        String brr[] =new String[5];

        brr[0] = "Miami";
        brr[1] = "Istanbul";
        brr[2] = "Frankfurt";
        brr[3] = "Dhaka";
        brr[4] = "Athena";

        //1.yol
        int totalChar = 0;

        for (int i=0; i<brr.length; i++){

           totalChar = totalChar + brr[i].length();

        }
        System.out.println(totalChar);

        //2.yol :
        // for-each-loop(enhanced-loop) ==> baslangic degeri, loop un calisma sartini, increment decrement kismini kendisi yapar
        //for-each-loop "Array lerde ve "collection larda kullanilir
        //index kullanmaniz gerektiginde bazen for-each-loop yetersiz kalir
        int sum = 0;
        for (String w : brr){

            sum= sum + w.length();

        }
        System.out.println(sum);


























    }
}
