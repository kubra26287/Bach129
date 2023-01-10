package day15arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays05 {
    public static void main(String[] args) {
        //Example 1 :String Array elemanlarini uzunluklarina gore kucukten buyuge siralayiniz
        //["Michael", "Ajda" ,"Thomas", "Tom" ]
        String arr[] = {"Michael", "Ajda", "Thomas", "Tom"};

        Arrays.sort(arr, Comparator.comparingInt(String::length)); //String clasindan lenght methodu siralamayi
        // length e gore yapar  yokka normalde sort alfabetik sira yapar stringde
        System.out.println(Arrays.toString(arr));                  //:: bu method adi referance kütüphanenin kapisini aciyor

        System.out.println(arr);

        //Example 2 :String Array elemanlarini character sayisina gore buyukten kucuge siralayiniz
        //["Michael", "Ajda" ,"Thomas", "Tom" ]

        String brr[] = {"Michael", "Ajda", "Thomas", "Tom", "Cuneyt"};

        Arrays.sort(brr, Comparator.comparingInt(String::length).reversed()); //tersten reserved
        System.out.println(Arrays.toString(brr));

        //funtional programing : Hazir methodlari kullanarak olusturulan method zinciri


        
        //Example 3: String Array elemanlarini character sayisina gore buyukten kucuge siralayiniz.
        //           Ayni character sayisinda olanlari da alfabetik siraya koyunuz.
        //          ["Michael", "Ajda", "Reyhane", "Gabriel", "Thomas", "Tom", "Ali", "Cin", "Cuneyt", "Cem"]
        //          [ "Gabriel", "Michael", "Reyhane", "Thomas", "Cuneyt", "Ajda", "Ali", "Cem", "Cin", "Tom"]
        String crr[] = {"Michael", "Ajda", "Reyhane", "Gabriel", "Thomas", "Tom", "Ali", "Cin", "Cuneyt", "Cem"};
        System.out.println(Arrays.toString(crr));

        Arrays.sort(crr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(crr));




        //fonctional Prpgraming==> java'nin olusturdugu methodlari kullanmak, saglam yol.
//fonctional programing==lampda
//reversed==> buyukten kucuge diz
//thencomparing==> iceri gir iceriyi de duzenle
//Comparator.naturelorder==> iceride dogal siralama yap; yani alfebetik siralama yap
// hem buyukler hemde kucukler icin ayri ayri siralama yapti

    }

}
