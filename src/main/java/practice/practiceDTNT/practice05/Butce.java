package practice.practiceDTNT.practice05;

public class Butce {
    /*
    tum aile uyelerinin birikiminin bulundugu ortak ihtiyaclar icin
    kullandigi bir butce ile kisisel harcamalarin yapildigi harcliklarin oldugu
     basit bir ev butcesi kodu yaziniz
     */

    public static int butce;  //tum aileyi etkileyecegi icin Static olur
    public int harclik;


    public void harclikAl(int alinanHarclik){
        butce-=alinanHarclik; //ortak hesaptan alinan harclik icin butce den eksiltme hapariz
        harclik+=alinanHarclik;
    }

  public void butcedenHarca(int harcanacakPara){

        butce-=harcanacakPara;
  }

    public void harclikHarca(int harclikHarcamasi){
        harclik-=harclikHarcamasi;

    }

    public void maasAl(int alinanMaas){
        butce+=alinanMaas;
    }




}
