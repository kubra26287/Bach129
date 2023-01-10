package day05typecastingstringmanipulations;

public class SwapValues {
    public static void main(String[] args) {
       // swap yer degistirmek demektir. 1. kapta patates ikinci kap ta domates var  SWAP yaparsak yer degistirir.


        int a = 12;
      int b = 5 ; // Swap den sonra ==> a= 5 ve b = 12
        int temp = 0; //temporary gecici demek (temp)

        System.out.println("a:"+ a);
        System.out.println("b:"+b);
      //1. Yol
        //1. adim:
        temp = a;
        //2.adim
        a = b;
        //3.adim
        b = temp;
        System.out.println("a:"+ a);
        System.out.println("b:"+ b);


        //2.YOL:
        int x = 12;
        int y = 5;

        x = x+ y;

        y = x - y;

        x = x - y;

        System.out.println("x:"+ x);
        System.out.println("y:" + y);



    }
}
