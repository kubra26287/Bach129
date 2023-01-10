package day04asciwrapperclassoperatorsmemoryusage;

public class AsciiValues {
    public static void main(String[] args) {
        // java da her karakterin bir sayisal degeri vardir
        // bu degerler ascii degerler olarak adlarindirilir
        // Bu degerlerin tamaminin bulundugu tabloya ASCII Table denir

        int ch = 'A'; //her hangi bir karakterin ascii degerini bulmak icin o karakteri int data type ina koymamiz gerekir.
        System.out.println(ch);

        int unlem = '!';
        System.out.println(unlem);

        char c1 = 'K';
        char c2 = '?';
        // java da charlari matematiksel islemlerde kullanirsaniz java o char larin ascii degerlerini kullanir.
        System.out.println(c1 + c2); // 138
    }
}
