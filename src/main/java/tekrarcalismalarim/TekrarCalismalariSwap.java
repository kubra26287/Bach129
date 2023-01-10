package tekrarcalismalarim;

public class TekrarCalismalariSwap {
    public static void main(String[] args) {
        int a = 12;
        int b = 3;
        int temp  = 0;

      /*temp=a;
      a=b;
      b=temp;
        System.out.println("a: " +a);
        System.out.println("b: "+b);*/

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a: " +a);
        System.out.println("b: " +b);

        //byte data typeni int data type na ceviriniz

//long data type ini short data type ine cevirelim
        long g = 234567644;
        short h = (short)g;
        System.out.println(h);
// int data type ini floata ceviriniz

        int c = 345;
        float v = c;
        System.out.println(v);
        // double data type ini short data type ina cevir
        double y = 2.3455;
        short k = (short)y;
        System.out.println(k);



    }
}
