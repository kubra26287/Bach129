package day20passbyvaluemethodoverloading;

public class PassByValue01 {
    public static void main(String[] args) {
/*
Java passByValue sayesinde variable larin orjinal degerlerini koruma altina alir
 */
    double shirt = 100;
     double studentShirtPrice = discount("student", shirt);
     double veteranShirtprice = discount("veteran", shirt);
     double seniorShirtprice = discount("senior", shirt);
        System.out.println(shirt); //100
        System.out.println(studentShirtPrice);
        System.out.println(veteranShirtprice);
        System.out.println(seniorShirtprice);
        shirt = discount("veteran", shirt);
        System.out.println(shirt);

    }
    public static double discount(String state, double price){
        switch (state){
            case "student":
                price = price*0.90;
                break;
            case "veteran" :
                price = price*0.80;
                break;
            case "senior":
                price =price *0.95;
                break;
            default:
                price = price;
        }
        return price;
    }
}
