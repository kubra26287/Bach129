package day20passbyvaluemethodoverloading;

public class PassByValue02 {
    public static void main(String[] args) {
        String name = "Tom Hanks";
        String updateName = updateName(name,"Jr.");
        System.out.println(name);//burada isim degismez cunku java orjinali degistirmez, kopyasini kullanir
        System.out.println(updateName);//burada updateName e atadiktan sonra kopyayi degistirir

        name = updateName(name,"Jr.");
        System.out.println(name);// bu da degistirilmis olani orjinal degere atar ve orjinal name i degistirir
    }


    public static String updateName(String name, String add){
        name = name + " " +add; // araya bosluk koyduk cunku ismi degistirip yanina kelime yazinca arada bosluk olsun

        return name;

    }




}
