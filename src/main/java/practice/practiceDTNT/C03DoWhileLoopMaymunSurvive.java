package practice.practiceDTNT;

public class C03DoWhileLoopMaymunSurvive {
    public static void main(String[] args) {
/*
 //interwiew questions
    Adada yalnız bir maymun var
    Her gün 4 muz yemesi gerekiyor
    o adada sadece 165 muz var
    Maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.

    */
       int numberofbananas =165;//4  8  12...164 ==> geriye bir muz kalir
       int survivalDays =1;     //1  2  3 ...41      //42.gun olur
                                // ilk 4 muzu yedigi gun 1 den baslar
        boolean monkeyAlive= true;
     do {
         System.out.println("********maymunlar yasamak icin gunde 4 muz yer*****");
         numberofbananas-=4; //
         System.out.println("Kalan muz sayisi " +numberofbananas);
         survivalDays++;
         if (numberofbananas<4){
             monkeyAlive=false;
             System.out.println("bugun "+survivalDays+". gun yeterli muz kalmadi.Maymun sizlere omur");
             System.out.println("Maymun "+survivalDays+". gun oldu");
         }else {
             System.out.println("Bugun "+survivalDays+". gun Maymun yasiyor");
         }

     }while(monkeyAlive);
























    }//main

}
