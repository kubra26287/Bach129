package practice.practiceDTNT.practice05;

public class StaticMember {  //Static Uyeler

    //ekran ciktisi nedir?


    public static void main(String[] args) {
        StaticMember sm1 = new StaticMember();
        StaticMember sm2 = new StaticMember();

       int z = sm1.karesiniAl();
        System.out.println("-x "+z+" -y"+sm2.y);


    }//main

    static int x;
    int y;
    StaticMember(){
        x+=10;
        y++;
    }//Constructor
    public static int karesiniAl(){
        return x*x;
    }


}
