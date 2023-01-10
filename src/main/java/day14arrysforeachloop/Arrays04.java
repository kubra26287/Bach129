package day14arrysforeachloop;

public class Arrays04 {
    public static void main(String[] args) {
        //Example 1 ; String bir Array olusturunuz 6 eleman ekleyiniz yellow dan önceki elemanlari yazdiriniz

        String colors[] = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        for (String w : colors){
            if (w.equals("Yellow")){
                break;
            }

            System.out.println(w);
        }

        //Example 2 ; String bir Array olusturunuz 6 eleman ekleyiniz "yellow dan sonraki elemanlari yazdirini
        String color[] = new String[6];

        color[0] = "Red";
        color[1] = "Orange";
        color[2] = "Blue";
        color[3] = "Yellow";
        color[4] = "Green";
        color[5] = "Brown";
    //1.yol
        //elemanlari almaya son elemandan baslayacagim icin for-each- loop kullanamayiz
        for (int i = color.length-1; i>0; i--){ //for-each-loop tersten calismaz bu yuzden for loop kullaniriz


            if (color[i].equals("Yellow")){
                break;
            }

            System.out.println(color[i]);
        }
    //2. yol
        //yellow elemanlarinin indexini bul ve indexten daha buyuk olanlari yazdir

        int counter = 0;

        for (String w : color){


            if (w.equals("Yellow")){
                break;
            }
            counter++;
        }
        for (int i = counter+1; i<color.length; i++){
            System.out.println(color[i]);
        }












    }
}
