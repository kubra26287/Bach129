package day19listsvarargs;

public class Varargs01 {
    /*

      Varargs'lar method olustururken "parametre" sayisinda bize esneklik saglar
      Method'un parantezleri icine yazilanlara "parametre" denir
      Method'u cagirirken kullanilan sayilara da "argument" denir.


      note bir methodda birden fazla varargs parametre kullanilamaz cunku ikicisi "unreachable" code olur
      note:Varargs ; varargs disindaki parametrelerle kullanilabilir ama Varargs her zaman son parametre olmalidir
 */



    public static void main(String[] args) {
        addTwoNumbers(3,5);

        add(4,5,6,7);


    }


    //iki sayiyi toplayan method olusturunuz
    public static void addTwoNumbers(int a,int b){
        System.out.println(a+b);
    }

   //istediginiz miktarda sayiyi toplamak icin bir method olusturunuz

    public static void add(int... a){ //data type ini yazip uc nokta sonra a ==> bu varargs dir
                                      //varargs array gibi calisir ama Array degildir
        int sum = 0;
        for (int w : a ) {
            sum+= w;

        }
        System.out.println(sum);
    }



}
