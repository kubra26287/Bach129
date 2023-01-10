package day15arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {
        //onemli soru
        //kullanici ile beraber bir array olusturunuz
        Scanner input = new Scanner(System.in);
        System.out.println("Kac ogrenci ismi gireceksiniz");//sayi ile
        int numOfElements = input.nextInt();

       System.out.println("Lutfen girisi sonlandirmak icin Q tusuna basiniz");

        String stdNames[] =new String[numOfElements];
        for (int i = 1; i<=numOfElements ; i++) {
            System.out.println("Lütfen "+ i +". ogrencinin adini giriniz");


            String stdName = input.next();
            if (stdName.equalsIgnoreCase("Q")){
                break;
            }

            stdNames[i-1] = stdName;// stdNames[i-1] bu index e git arraysi 0 olana ilk ismi ver demek

        }
        System.out.println(Arrays.toString(stdNames));




















    }//Main
}
