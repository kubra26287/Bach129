package day02datatypesmethodcreation;

public class Odev {

    public static void main(String[] args) {
        int sonuc = dikdörtgeninAlani(3,5);
        System.out.println(sonuc);


       long islem = dikdörtgeninCevresi(20,30);
        System.out.println(islem);

        double sonucu = daireninCevresi(3.14, 4);
        System.out.println(sonucu);

        float sonucun = daireninAlani(3 , 4);
        System.out.println(sonucun);

    }
    public static int dikdörtgeninAlani(int a, int b){
        return a*b;

    }
    private static long dikdörtgeninCevresi(long c,long d){
        return 2*(c+d);
    }

    protected static double daireninCevresi(double a, double b){
        return 2*a*b;
    }

    static float daireninAlani(float a,float b){
        return a*b*b;
    }








}
