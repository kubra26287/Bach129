package tekrarcalismalarim;

public class YildizliUcgenDeneme {
    public static void main(String[] args) {
        int row = 5;


        for (int i =1; i <=row ; i++) {
            for (int bosluk = row; bosluk>=i ; bosluk--) {
                System.out.print("m");
            }

            for (int yildiz =1; yildiz <=i ; yildiz++) {

                if (yildiz==1 || yildiz==i){
                    System.out.print("* ");
                } else if (i==row) {
                    System.out.print("* ");

                }else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }


















    }
}
