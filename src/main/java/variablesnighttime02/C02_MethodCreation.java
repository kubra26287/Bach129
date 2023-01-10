package variablesnighttime02;

public class C02_MethodCreation {
    public static void main(String[] args) {
        // dikdortgenin alanini hesaplayan kodu yaziniz ve kullaniniz
        System.out.println("Dikdortgenin Alani : "+dikdortgeninAlani(10, 5));

        System.out.println("dikdortgeninCevresi : "+dikdortgeninCevresi(12, 45));

        kareninAlani(25);
    }//main
    public static int dikdortgeninAlani(int a,int b){
        return a*b;
    }


    public static int dikdortgeninCevresi(int a,int b){
        return 2*(a+b);
    }//method body
    //karenin alanini hesaplatan kodu yaziniz

    public static void kareninAlani(int a){
        System.out.println("Karenin Alani :"+(a*a));
    }
}//class
