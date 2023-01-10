package day14arrysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        // Example String bir array olusturunuz 6 tane eleman yerlestiriniz
        //karakter sayisi 5 den cok olan elemanlari siliniz
        String colors[] = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        System.out.println(Arrays.toString(colors));

        //Logic yeni bir Array olusturup character sayisi 5 ve 5ten kucuk olan elemanlari yeni array e transfer edecegiz
        //böylelikle yeni arrayde character sayisi 5 ten buyuk olmayacak

        //Array  olusturuken iki sey belirlenmelidir
        // elemanlarin data type i
        //yeni array de kac tane eleman olacak
        int counter =0;

        for (String w : colors){

            if (w.length()<=5) {
                counter++;
            }
        }
            System.out.println(counter);
     //yeni Array olustur
            String newColors[] = new String[counter];
     //Character sayisi 5 ve 5 ten kucuk olanlari yeni Array e transfer et
            int idx = 0;

            for (String w : colors){   //otomatik Array olusturuyoruz
                if (w.length()<=5){
                    newColors[idx] = w;
                    idx++;
                }
            }
            System.out.println(Arrays.toString(newColors));
    }
}
