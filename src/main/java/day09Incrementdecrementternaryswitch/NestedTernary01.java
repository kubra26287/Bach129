package day09Incrementdecrementternaryswitch;

public class NestedTernary01 {
    public static void main(String[] args) {


        //Example 1:
        //verilen yilin artik yil(Leap year) olup olmadigini kontrol eden kod
        // 1 yil 100 e bölünürse 400 e de bölünmelidir  1600 ==> Leap  1800 Leap degil
        //yil 100 e bolunmuyorsa 4 e bölünmelidir 2004 ==> Leap 2005==> Leap degil

        int year = 1500;
        String result = year%100==0 ? (year%400==0 ?  "Leap" : "Not Leap") : (year%4==0 ? "Leap " : "Not leap");
        System.out.println(result);

    }



}
