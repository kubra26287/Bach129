package advencedpractice.practice02;

import java.util.Arrays;
import java.util.Scanner;

public class SilinecekElemanArray {
    public static void main(String[] args) {

          /*  6) Elementlerini kullanıcıdan alarak bir integer Array oluşturunuz.(Q05_Arrays_ElemanSil)
                    Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz.

           */

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen gireceginiz elemanlarin sayisini belirtiniz");
        int indexSayisi = input.nextInt();


        Integer arr[] = new Integer[indexSayisi];

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Lutfen "+i+". sayiyi giriniz");
            int eleman = input.nextInt();
            arr[i]= eleman;


        }
        System.out.println(Arrays.toString(arr));
        System.out.println("lutfen silmek istediginiz elemanin indeksini giriniz ");
        int silinecekEleman = input.nextInt();
        Integer brr[] = new Integer[arr.length-1];
        int index=0;
        for (int i = 0; i <arr.length ; i++) {
            if (i!=silinecekEleman){
                brr[index]=arr[i];
                index++;
            }

        }
        System.out.println(Arrays.toString(brr));

    }

}
