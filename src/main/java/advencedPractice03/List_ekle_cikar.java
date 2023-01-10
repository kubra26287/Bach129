package advencedPractice03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_ekle_cikar {
    public static void main(String[] args) {
        //kullanicidan aldiginiz bir sayiyi bir liste ekleyen ,
        // List ten cikaran yada mevcut bir elementi o sayi ile guncelleyen bir
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while (true) { //bu while break olmadigi surece calisir
            System.out.println("Ekleme yapmak icin : add \n"
                    + "Element gucellemek icin : set\n"
                    + "Element silmek icin : remove \n" +
                    "Cikmak icin : break komutunu giriniz");

            String komut = input.next();
            if (komut.equalsIgnoreCase("add")) {
                System.out.println("eklemek istediginiz tamsayiyi giriniz");
                int tamsayi = input.nextInt();
                list.add(tamsayi);
            } else if (komut.equalsIgnoreCase("set")) {
                System.out.println(" guncellemek istediginiz index i giriniz ");
                int index = input.nextInt();

                System.out.println("yerine eklemek istediginiz sayiyi giriniz");
                int yeniSayi = input.nextInt();
                list.set(index,yeniSayi);
            } else if (komut.equalsIgnoreCase("remove")) {
                System.out.println("silmek istediginiz sayiyi giriniz ");
                Integer silinecekSyai = input.nextInt();
                list.remove(silinecekSyai);

            }else if (komut.equalsIgnoreCase("break")){

                break;
            }else {
                System.out.println("gecerli bir komut giriniz");
            }
            System.out.println(list);
        }




    }
}
