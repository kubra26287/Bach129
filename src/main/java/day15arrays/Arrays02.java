package day15arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Example2 :bir Stringdeki sesli harflerin sayisini bulan kodu yaziniuz

        String s = "Java brings you money";
        //1. yol
        int vowels = s.replaceAll("[^aeiouAEIOU]","").length();

        System.out.println(vowels);

        //2.yol use Array - Loop
        String letters[] = s.split(""); //letters harfler
        System.out.println(Arrays.toString(letters));

        int counter = 0;
        for (String w : letters) {
           switch (w.toLowerCase()){
               case "a":
               case "e":
               case "i":
               case "o":
               case "u":
                   counter++;
           }

        }
        System.out.println(counter);

















    }
}
