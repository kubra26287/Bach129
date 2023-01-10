package practice.practiceDTNT;

import java.util.Arrays;
import java.util.Scanner;

public class C06_ArraysKarakterleriSaydir {
    public static void main(String[] args) {
        //Arrays characterleri saydir
        /*
INTERWIEW QUESTIONS
 Kullanicidan bir String aliniz.
 String'de var olan her character'in sayisini ekrana yazdiriniz.
 Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
        abaa   ==> a=3  b=1
*/
        Scanner input =new Scanner(System.in);
        System.out.println("Bir kelime giriniz :");
        String str = input.nextLine();

        String arr[]=str.split("");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int counter = 0;

        for (int i =1; i <arr.length ; i++) {
            if (arr[i-1].equalsIgnoreCase(arr[i])){
                counter++; //ayni olanlar icin bir artirir
            }else{
                System.out.println(arr[i-1]+" karakterinin sayisi "+(counter+1)+"kez tekrarlanmistir");
                counter = 0; //baska harfe gectigi icin sifirliyoruz cunku üstüne eklerse diger harfleri de iki kez yazdirir
            }
            if (i==arr.length-1) { //defalarca kodu yazdirmamasi icin sona gelindiginde yazdirmasi icin if kullandik
                System.out.println(arr[i] + " karakterinin sayisi " + (counter + 1) + " kez tekrarlanmistir");
            }
        }

















    }//main
}
