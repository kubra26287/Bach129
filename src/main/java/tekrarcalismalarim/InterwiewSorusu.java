package tekrarcalismalarim;

public class InterwiewSorusu {
    public static void main(String[] args) {
        /*
        adada yalniz bir maymun var her gun 4 muz yemesi gerekiyor
        o adada sadcee 165 muz var
        maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz
        */


        int numberOfBananes = 165;
        int survivalDays = 1;
        boolean monkeyAlive = true;

        do {
            System.out.println("Maymun hayatta kalmak icin gunde 4 muz yer");
            numberOfBananes -=4;
            System.out.println("Kalan muz sayisi "+numberOfBananes);
            survivalDays++;
                if (numberOfBananes<4){
                    monkeyAlive = false;
                    System.out.println("bugun " +survivalDays+". gun  Maymun oldu " );

                }else{
                    System.out.println(" Bugun " +survivalDays+". gun Maymun hala hayatta");
                }

        }while (monkeyAlive);













    }//main

}