package day11forloop;

public class ForLoop02 {
    public static void main(String[] args) {
        //Example verilen bir string de a characteri haric tüm characterleri yazdiriniz
        // "Madagaskar"  ==> Mdgskr
        String s = "Madagaskar";

        //1:yol
        String t = s.replace("a","");
        System.out.println(t); // Mdgskr
        //2.yol
        for (int i = 0;i<s.length(); i++ ){

            char ch = s.charAt(i);
            if(ch!= 'a'){
                System.out.println(ch);
            }
        }
        System.out.println();
        //3.yol
        for (int i = 0;i<s.length(); i++ ) {
            char ch = s.charAt(i);
            if (ch=='a') { // eger character a ise bos ver onu demek continue
                continue;     // continue keyword u bazi sartlar icin loopun adimlöarini atlamamizi saglar
            }
            System.out.print(ch);


        }



    }
}
