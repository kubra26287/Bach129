package day21statickeyword;

import java.util.List;

public class StdRunner {
    public static void main(String[] args) {
        //stdName static oldugundan ona ulasmak icin object olusturmadik
        // sadece class ismini kullanmak yeterlidir
        System.out.println(Student.stdName);

        //age non-static oldugundan ona ulasmak icin object olusturmak
        // zorundayiz
        Student std1 = new Student();
        System.out.println(std1.age);

       // Student std2 = new Student();

      String initials =  Student.getInitials("sefa Eger");
        System.out.println(initials); //SE

        int vowels = std1.countVowels("tom cruise");
        System.out.println(vowels);//4

        String s = std1.getInitials("ali can"); //static olanlari object (std1.) ile cagirmak tavsiye edilez

        System.out.println(s);


    }
}
