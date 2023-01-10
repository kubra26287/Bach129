package tekrarcalismalarim;

public class YildizliUcgen {
    public static void main(String[] args) {
//        2)            *
//                     * *
//                    *   *
//                   *     *
//                  * * * * *
//   Satir sayisini kullanicidan alarak yukaridaki sekli yazdiriniz


       int row=5;

        for (int i = 1; i <=row ; i++) {
            for (int j = i; j <row ; j++) {
                System.out.print("m");
            }

            for (int k = 1; k <=2*i-1 ; k++) {
                if ((k==1 || k==2*i-1) && i!=row){
                    System.out.print("*");
                }else if(i==row && k%2!=0){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
