package tekrarcalismalarim;

public class Deneme1 {
    public static void main(String[] args) {
         /*  7)Şekli Yazdırınız:  (Q06_ForLoop_Sekil)
            A        A
            B B
            C C C
            D D D D
            E E E E E
            F F F F F F
        */
        char ch = 'A';
        for (int i = 0; i <6 ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print((char)(ch+i)+" ");

            }

            System.out.println();

        }

        for (int k = 0; k <6 ; k++) {
            for (int i =5; i >=k ; i--) {
                System.out.print((char)(ch+k)+" ");

            }
            System.out.println();
        }
    }
}
