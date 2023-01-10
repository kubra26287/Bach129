package day10switchloops;


import java.util.Scanner;

public class Switch03 {


        public static void main(String[] args) {
            // Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
            // Type code to print abbreviation of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"
            // Kullanicidan bir ulke ismi aliniz.Alinan ulke adina gore kisaltmalari yazdiriniz

            Scanner input =new Scanner(System.in);
            System.out.println("Ülke adini giriniz");
            String countryName = input.nextLine();

            switch (countryName.toLowerCase()) {

                case "america":
                    System.out.println("US");
                    break;
                case "germany":

                    System.out.println("DE");
                    break;
                case "turkey":
                    System.out.println("TR");
                    break;
                case "india":
                    System.out.println("IN");
                    break;
                case "peru":
                    System.out.println("PE");
                    break;
                case "spain":
                    System.out.println("ES");
                    break;
                default:
                    System.out.println("bu ülke tanimli degildir...");

            }



        }

}
