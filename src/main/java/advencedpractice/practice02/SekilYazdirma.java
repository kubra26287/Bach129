package advencedpractice.practice02;

public class SekilYazdirma {
    public static void main(String[] args) {
         /*  7)Şekli Yazdırınız:  (Q06_ForLoop_Sekil)
            A        A
            B B
            C C C
            D D D D
            E E E E E
            F F F F F F

           */
        char ch = 'A';  //dinamik olmasi icin bu konteyneri olusturduk soutun icine yazdik ve her seferinde harfin ascii degerinin i kadar artarak  degismesi icin +i yi
        for (int i = 0; i <6 ; i++) {
            for (int j =0; j <=i ; j++) {
                System.out.print((char)(ch+i)+" ");

            }
            System.out.println();
        }

    }
}
