package tekrarcalismalarim;

public class Tekrar1 {
    public static void main(String[] args) {
        //Example 1: Verilen bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz

        String str = "Germany";
        for (int i= 0; i <str.indexOf('a') ; i++) {
            char ch = str.charAt(i);
            System.out.print(ch);

        }


        System.out.println();



//Example 1: Verilen bir String'de son 'a' harfinden sonra ki tum character'leri ters sirada console'a yazdiriniz

        String k = "Istanbul";

        for (int i =k.length()-1; i >=0 ; i--) {
            char ch = k.charAt(i);
            if (ch=='a'){
                break;

            }
            System.out.print(ch);
        }


    }
}
