package day21statickeyword;

public class Student {
    /*
    1)Static varible veye static methodlar(class member) tum objeler icin ortak elemandir
    2)Static class memberlar uzerinde yapilan tum degisiklikler tum object leri etkiler
    3)Static class member lar Class`a, non_static class memberlar object`lere monte edilir
    Mesela bir class dan 100 tane object olusturdugunuzda non-Static olanlar 100 kere olusturulur
    ama Static olanlar object sayisindan bagimsiz olarak bir kez olusturulur.
    4) Static class member lara ulasmak icin object olusturmaya gerek duyulmaz,non-static class memberlara ulasmak icin
    object olusturmak sarttir.
    5)  Static variable in diger adi Class Variable,
        Non-static Variable in diger adi, Instance Variable veya object Variable dir


    Static variable'lara sadece classin ismi kullanilarak da ulasilabilir.
B Static olmayan variable'lara ulasabilmek icin object olusturmak zorundayiz.
C Static variable'larin diger adi class variable'dir. Instance variable'larin diger adi object variable'dir.
D Static variable'lar object'lerin ortak kullanimina aciktir fakat instance variable'lar degildir.

     */
   public static String stdName ="tom Hanks";//Static

   public int age = 13;  //non-static
    //ogrenci ismini ilk harflerini veren methodu olusturunuz  Static
    public static String getInitials(String name){
        String first = name.substring(0,1);
        String second = name.split(" ")[1].substring(0,1);
        return first + second;
    }

    // ogrenci ismindeki sesli harfleri sayan bir method olusturun  non-static

    public int countVowels(String name){

        int counter = 0;
        for (int i = 0; i <name.length() ; i++) {
            char ch = name.toLowerCase().charAt(i);
            switch (ch){
                case 'a' :
                case 'e' :
                case 'i' :
                case 'o' :
                case 'u' :
                    counter++;
                    break;
            }


        }
        return counter;

    }


}
