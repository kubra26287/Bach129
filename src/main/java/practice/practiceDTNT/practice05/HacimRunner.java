package practice.practiceDTNT.practice05;

public class HacimRunner {
    public static void main(String[] args) {

     //küp kare prizma ve  dikdortgen prizmanin
     //hacmini hesaplayan bir method olusuturunuz Method overloading

     Hacim hacim = new Hacim();  //obje olusturduk
        int karePrizma = hacim.hacimHesapla(5,6);
        int dikdortgenPrizma = hacim.hacimHesapla(5,6,7);
        int kup = hacim.hacimHesapla(5);

        System.out.println("karePrizma "+karePrizma);
        System.out.println("dikdortgenPrizma "+dikdortgenPrizma);
        System.out.println("kup "+kup);

    }//main
}
