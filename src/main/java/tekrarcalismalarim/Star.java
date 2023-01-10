package tekrarcalismalarim;

public class Star {
    public static void main(String[] args) {
        /*
 Example: Kulanicidan satir sayisini alarak asagidaki sekli yazdiriniz

       *
      * *
     *   *
    *     *
   * * * * *

 */
        //1 sekil once bir dikdortgene tamamlanir.
        //2  bosluklar hesaplanir
        //ilk basta bosluklar icin bir loop

        int row = 5;

        for (int i = 1; i <=row ; i++) {
            for (int j = i; j <row ; j++) {
                System.out.print(" ");       //bosluklar yan yana olsun diye ln silinir

            }
            for (int m = 1; m <=2*i-1 ; m++) {
                if (i==row || m==1 || m==2*i-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

















    }//main
}
