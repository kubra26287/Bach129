package tekrarcalismalarim;

import java.util.Scanner;

public class ForLoopSekil {
    public static void main(String[] args) {
        /*
         6.soru: Verilen bir array'in istenen bir elemani icerip icermedigini kontrol edip, bize
            true veya false sonucu donen bir method olusturun.
*/


            String[] arr={"ali", "veli","ahmet","mehmet"};
            Scanner scan=new Scanner(System.in);
            System.out.println("aranan ismi giriniz");
            String arananIsim= scan.nextLine();

            boolean isimVarMi=true; // false
            for (String w : arr) {
                isimVarMi=true;
                if (w.equalsIgnoreCase(arananIsim)){
                    break;
                }else {
                    isimVarMi=false;
                }
            }
            //System.out.println(isimVarMi);
            if (isimVarMi){
                System.out.println("isim var");
            }else {
                System.out.println("yok");
            }



    }
}
