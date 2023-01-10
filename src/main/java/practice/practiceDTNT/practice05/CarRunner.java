package practice.practiceDTNT.practice05;

public class CarRunner {
    public static void main(String[] args) {

        Car car1 =new Car();
        Car car2 =new Car();
        Car car3 =new Car();
        Car car4 =new Car();
        // System.out.println(car1.counter); //calisir ama tavsiye edilmez cunku counter Static dir static ler class adiyla cagirilir

        System.out.println(Car.counter);//dogrusu budur
        System.out.println(car1.price);

        System.out.println(Car.counter);
        System.out.println(car2.price);


        System.out.println(Car.counter);
        System.out.println(car3.price);

        System.out.println(Car.counter);
        System.out.println(car4.price);





    }//main
}
