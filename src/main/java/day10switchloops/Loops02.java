package day10switchloops;

public class Loops02 {
    public static void main(String[] args) {
        //21 den 180 e kadar hem 4 hem de 6 ile bölünebilen tum tamsayilari ekrana yazdiran kodu yazdiriniz
         for (int i = 21; i<181; i++){
             if (i%4==0 && i%6==0){
                 System.out.print( i + " ");

             }
             System.out.println();

         }

         //Example 2 : size verilen kücuk harfle yazilmis String`in
        // indexi cift sayi olan characterlerini büyük harf yapiniz
        //yazdigimiz code belli senaryolar icin calsiyor tum senaryolar icin calismiyorsa bu code a "hard-code" denir
        //hard-code yanlis yazilmis code dur mutlaka duzeltilmelidir
        //note= bir string de son index = length() -1
        //ankara ==> AnKaRa

        String s = "ankara";

         for ( int i=0; i<s.length();i++   ){  //stringlerde index sifirdan basladigi icin 0 yapariz genelde
                                               // lenght i son characteri almasi icin yapariz ki String de
                                                // ne verilirse verilsin son charactere kadar alir.

             String ch = s.substring(i, i+1);

             if (i%2==0){
                 System.out.print(ch.toUpperCase() + " ");
             }


         }













    }//main
}
