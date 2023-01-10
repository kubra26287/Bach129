package day09Incrementdecrementternaryswitch;

public class Ternary01 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int r1 = a<7 ? a++ : b++; //post increment oldugu icin r1 20 olur
        System.out.println(r1); //20
        System.out.println(a); //10
        System.out.println(b); //21


        //Example 2 : Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
        //               -4 ==> -1 * -4     4 ==> 4     0 ==> 0
        // sayi sifirdan kucukse -1 ile carp degilse dokunma

        int c = -4;
        int r2 = c<0 ? -1*c : c;
        System.out.println(r2);
         int bi = 4;
        int ri = bi<0 ? -1*bi : bi;
        System.out.println(ri);

        //Example 3: iki sayinin isareti ayni ise bu sayilari carpan
        //isaretleri farkli ise "farkli isaretli sayilari carpmiyorum" mesaji veren kodu yaziniz

        int m = 5;
        int n = -6;
        //Object Java da butun "non- primitive data type larin "parent(baba)idir
        //object in parenti yoktur
        //farkli data typeleri icin ortak bir variable olusturmak istediginizde object kullanabilirsiniz
        //java da object insanlik alemin de hz Adem e benzer.
       Object r3 = (m>0 && n>0) || (m<0 && n<0) ? m*n : "Farkli isaretli sayilari carpamiyorum";
        System.out.println(r3);

        //Example 4 : size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz
        int p = -436;
        int r = Math.abs(p);//burada yeni variable olusturduk cunku kullanicinin verdigi - isaretli sayiyi degistirmeden
                            //sayiyi mutlak deger yaptik sonra r variable ina atamis olduk.
                            //eger direk p yi mutlak deger yapsaydik verilen sayiyi degistirmis olup +436 yapacaktik.

       String r4 =  (r>99 &&  r<1000)  ? p + " uc basamaklidir" : p + " uc basamakli degildir";
        System.out.println(r4);




    }//main
}//package
