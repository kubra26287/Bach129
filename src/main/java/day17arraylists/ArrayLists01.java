package day17arraylists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayLists01 {
    public static void main(String[] args) {


    /*
       1)ArrayLists ler coklu data depolamak icin kullanilir
       2)Arraylistler non primitive data type in deki
       coklu datalari depolamak icin kullanilir
       Listler non-primitive data kabul ederler arrayler ise primitive data veya reference kabul ederler
       3)Arraylistleri olustururken icine koyacaginiz
       eleman sayisini basta söylemeye gerek yoktur
       Listlereleman sayisinda "flexibel" dirlar ama Arrayler "flexibel" degildir eleman sayisi ister
       4) Madem arrayler eleman sayisinda flexibel degil nicin java arraylari iptal etmedi ?
        i)eleman sayi belli olan data lari depolamak icin arrayler tercih edilir
        ii)Arrayler cok hizli calisir
        iii)Arrayler memoryde cok az yer kaplar
        */

        //List nasil olusturulur ?

        ArrayList<Integer> ages = new ArrayList<>(); //new sifirdan olustur ArrayList<>() constructer ==> verdigimiz bilgileri biraraya getirecek

        System.out.println(ages); // [] bunu yazdirdigimizda bos list olusturur eleman atamadan
                                  // ve sout a arrays.tostring yazmaya gerek yok


        //Listlere eleman nasil eklenir?
           //add ekle demek
           //add methodu verilen elemanlari sizin verdiginiz siraya gore sonrasina ekler (Insertion Order)

        ages.add(12);
        ages.add(9);
        ages.add(10);
        ages.add(888);

        ages.add(1,656);   //bu method listin arasina eleman eklemek istedigimiz zaman calisir index i vermemiz yeterli
        ages.add(3,777);

        System.out.println(ages);//[12, 656, 9, 777, 10, 888]

        //Liste coklu eleman nasil eklnir? veye Liste baska bir list nasil eklenir?
        //bir list´e coklu eleman eklemek icin o elemanlari once bir Listin icine koymalisiniz
        ArrayList<Integer> newages = new ArrayList<>();
        newages.add(8);
        newages.add(9);
        newages.add(10);

        ages.addAll(newages);  //bu method yeni verileri eksi List´in icine ama sona ekler
        ages.addAll(2,newages); //verilen elemanlari istedigimiz yere koymak icin
        System.out.println(ages);

        ages.toArray();    //listi array e dönusturur eger, eleman sayisinin degismeyeceginden eminsek

        //bir listteki tum elemanlari nasil silebilirim?
        ages.clear();
        System.out.println(ages);


        //bir elemanin list te var olup olmadigi nasil?
        boolean r = ages.contains(656);   //list in icindeki elemanin var olup olmadigini gösterir Boolean dondurur
        System.out.println(r);


        //bir listin baska bir list ile ayni olup olmadigini nasil kontrol ederiz
        //Iki listin esit olmasi icin ayni index te ayni eleman olmali
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("jim");

         boolean s = names1.equals(names2);
        System.out.println(s); //false


        // Example 1) Verilen 2 İnteger List'te tamamiyla ayni elemanlari olup olmadigini kontrol eden kodu yaziniz
           // burada esitlige degil ayni olup olmadigina bakicaz
        ArrayList<String> num1 = new ArrayList<>();
        num1.add("8");
        num1.add("10");
        num1.add("9");

        ArrayList<String> num2 = new ArrayList<>();
        num2.add("8");
        num2.add("9");
        num2.add("10");

        Collections.sort(num1);  //colllections coklu datanin bir araya konulmasi demek
        Collections.sort(num2);

        boolean t = num1.equals(num2);
        System.out.println(t);


















    }//main
}
