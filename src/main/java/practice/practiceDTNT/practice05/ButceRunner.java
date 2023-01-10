package practice.practiceDTNT.practice05;

public class ButceRunner {
    public static void main(String[] args) {

        Butce baba = new Butce();       //contructor class ismi ile ayni olmali
        System.out.println("Maas oncesi Butce : "+Butce.butce);


        baba.maasAl(3000);
        System.out.println("Maas sonrasi Butce : "+Butce.butce);


        baba.harclikAl(100);
        baba.harclikHarca(20);
        System.out.println(baba.harclik);

        baba.butcedenHarca(500); //camasir makinesi aldigi icin butce etkilendi
        System.out.println(Butce.butce);

        Butce anne = new Butce();
        anne.maasAl(5000);
        anne.harclikAl(500);
        anne.harclikHarca(450);
        System.out.println(Butce.butce);
        System.out.println(anne.harclik);

        Butce oglan = new Butce();
        oglan.harclikAl(100);
        oglan.harclikHarca(30);
        System.out.println(Butce.butce);
        System.out.println(oglan.harclik);




    }//main
}
