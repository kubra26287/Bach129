package day23datetimestringbuilder;

public class StringBuffer01 {
    /*
    String olusturmak icin String Class , StringBuilder Class, ve StringBuffer kullanabiliriz
    1) StringBuffer Java nin String uretmek icin olusturdugu ilk class dir Java 5 de uretilmistir
    StringBuffer synchronized dir ,StringBuilder Synchronized degildir
    StringBuffer "thread-safe dir ,Stringbuilder "thread-safe " degildir

    Note 1 : Immutable String lazim oldugunda String Class kullaniriz.
             Mutable String lazim oldugunda StringBuilder veya StringBuffer kullaniriz
             StringBuffer "Multithread" ve "Synchronization " lazim oldugunda kullanilir
             StringBuilder "Multithread" ve "Synchronization " gerekmezse tercih edilir
     */
    public static void main(String[] args) {
        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf);

        System.out.println(sbf.capacity());//20 16+java

    }
}
