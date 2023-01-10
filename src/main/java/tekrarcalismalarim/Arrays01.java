package tekrarcalismalarim;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {

   // day14arraysforeachloop:
  //  1)String array olusturun, icine 5 tane eleman ekleyin, tum elemanlari icerdigi karakter sayilari toplamini ekrana yazdiriniz.(C02_Arrays02)

    String[] arr = {"ayse", "fatma", "hayriye", "ali","veli"};
    System.out.println(Arrays.toString(arr));
        System.out.println(arr[0].length() + arr[arr.length-1].length());

       int totalChar = 0;
        for (String w : arr) {
            totalChar += arr.length;
        }
        System.out.println((totalChar));


   // 2)Integer array olusturunuz, icine 6 tane eleman yerlestiriniz,bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz.(C03_Arrays03)
        Integer[] brr = {5, 6, 16, 14,12,45};
        Arrays.sort(brr);
       System.out.println(brr[0] + brr[brr.length-1]);


        int max = brr[0];
        int min = brr[0];
        for (int w : brr) {
            max = Math.max(max,w);
            min = Math.min(min,w);

        }
        System.out.println("toplam : "+(max + min) );

   // 3)String bir Array olusturunuz, 6 tane eleman yerlestiriniz, charaacter sayisi 5'den büyük elemanlari siliniz.(C04_Arrays04)

        String[] color = {"Mavi","yesil","kirmizi","Sari","turuncu","Pembe"};

        int counter = 0;

        for (String w: color) {
            if (w.length()<=5){
               counter++;

            }

        }
        System.out.println(counter);

        String[] newColor = new String[counter];
        System.out.println(Arrays.toString(newColor));
        int idx = 0;
        for (String w:color) {
            if(w.length()<=5){
               newColor[idx] =  w;
               idx++;
            }

        }
        System.out.println(Arrays.toString(newColor));


   // 4)String bir array olusturunuz,6 eleman ekleyiniz, Yellow'dan onceki elemanlari yazdiriniz.(C05_Arrays05)
        String[] colori = {"Mavi","yesil","kirmizi","yellow","turuncu","Pembe"};

        for (String w :colori) {
            if (w.equals("yellow")){
                break;

            }
            System.out.print(w+ " ");
        }
        System.out.println();
   // day15arraysmultidimensionalarrays:
    //5)Bir ögretmenin okulunda ki  ögrencilerin isimlerini applicationa yüklemesini saglayan kodu yaziniz.(C01_Arrays)
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen kac ögrenci ismi gireceginizi yaziniz");
        int numOfElements = input.nextInt();

        String[] name = new String[numOfElements];
        System.out.println("lutfen birakmak istediginizde Q harfine basiniz");
        for (int i =1; i <=numOfElements ; i++) {
            System.out.println("lutfen "+i+". ogrencinin adini giriniz ");

            String neuname = input.next();
            if (neuname.equalsIgnoreCase("Q")){
                break;
            }
              name[i-1]= neuname;
        }
        System.out.println(Arrays.toString(name));



   // 6)Bir stringdeki sesli harflerin sayisini bulan kodu yaziniz.(C02_Arrays)
        String str = "Java brings you money ";

        String[] letters = str.split("");

        System.out.println(Arrays.toString(letters));

        int counteri =0;
        for (String w:letters) {

            switch (w.toLowerCase()){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
               counteri++;
            }
        }
        System.out.println(counteri);





    //7)[0, 2, 3 , 0 , 12 , 0] 0. indexi en sona koyunuz.(C03_Arrays)
     //   String[] null ={0, 2, 3 , 0 , 12 , 0;





    //8)Bir arrayin icinde herhangibir elemanin olup olmadigini kontrol eden ve kac kere tekrarlandigini gösteren kodu yaziniz.(C04_Arrays)

    }
}
