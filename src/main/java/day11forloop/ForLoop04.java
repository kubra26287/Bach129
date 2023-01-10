package day11forloop;

public class ForLoop04 {
    public static void main(String[] args) { //önemli soru
        //Example 1:  5 ten 8 e kadar tamsayilarin toplamini veren kodu yaziniz
        //     5+ 6 7 +8 ==> 26

        int sum = 0;//yeni dgeri memoryde saglamak icin yeni bir deger olusturup 0 (etkisiz eleman) koyariz

        for (int i=5; i<9; i++) {
            sum = sum + i;

        }
        System.out.println(sum);

        //Example 2: 7den 9 a kadar tam sayilarin carpimini veren kodu yaziniz
        //   7*8*9  ==> 584
        int multiply = 1; // 1 verdik cunku carpmada etkisiz eleman

        for (int i=7; i<10 ; i++){
            multiply =multiply * i;

        }
        System.out.println(multiply);
    }

}
