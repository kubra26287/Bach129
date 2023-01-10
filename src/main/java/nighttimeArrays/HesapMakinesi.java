package nighttimeArrays;

public class HesapMakinesi {

    public void toplama(int... a){

        int toplam = 0;
        for (int w:a) {
            toplam+= w;
        }
        System.out.println(toplam);

    }//method

    public void cikarma (int... a){
        int fark = 0;
        for (int w:a) {
            fark-= w;
        }
        System.out.println("Fark : "+fark);

    }

    public void carpma(int... a){
        int carpim = 1;
        for (int w:a) {
            carpim*= w;
        }
        System.out.println("carpma: "+carpim);
    }
    public void bolme(int a,int b){
        if(b==0){
            System.out.println("Hicbir sayi sifira bolunemez");

        }else {
            System.out.println("Bolme : "+(a/b));
        }
    }
}//Class
