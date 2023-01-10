package practice.practiceDTNT;

public class Varargs02 {
    public static void main(String[] args) {
        //verilen sayilardan ilki haric tum sayilari toplayip
        // ilk sayi ile carpan bir method olusturunuz


        int sayi1 = 5;
        int sayi2 = 7;
        int sayi3 = 2;
        int sayi4 = 4;
        int sayi5 = 9;

        sonuc(sayi1,sayi2,sayi3,sayi4,sayi5);
    }

    private static void sonuc(int carpilacak ,int ...toplanacaksayi) {
        int toplam = 0;
        for (int w:toplanacaksayi) {
            toplam+= w;

        }
        System.out.println(toplam);

        int sonuc= carpilacak*toplam;

        System.out.println(sonuc);
    }
}
