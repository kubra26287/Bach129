package day04asciwrapperclassoperatorsmemoryusage;

public class Operator01 {
    public static void main(String[] args) {
        /*
          1) + - * / islemleri Java da matematikte kullanildigi gibi kullanilir
           note 1: int / int ==> int olur
           note 2: double / int ==> double   // cunku Java da matematiksel islemlerde farkli
           data type'lari kullnilirsa sonuc buyuk data type 'inda olur

           2) Java da "logical operator"lar vardir. (mantik operatoru)
           AND(&&) ve OR(||) islemleri " logical operatorlar" idir.
                             i) (AND isleminden True alabilmek icin hersey true olmalidir
                                AND islemi "perfectionisttir
                                AND isleminde bir tane false sonucu false yapar .)

                             ii) Or isleminde bir tane true sonucu true yapmaya yeter
                                Or isleminde sonucun false olmasi icin hersey folse olmalidir
                                OR islemi polyanna gibidir
                             iii) NOT Operatoru (!) true olani false, false olani true yapar
                             !true = false
                             !false = true
                             !!true = true
           3) karsilastirma operatoru
            < ,> , <= ,>= , ==> ,== , !=
           note: karsilastirma operatorlerini kullandiginizda kesinlikle boolean alirsiniz
             note: Biz AND islemi icin && kullaniriz ama & kullanim da gecerlidir.


             Farklari nedir?

             "&&"""" kullanim da ilk ifade false oldugunda digerlerini kontrol etmez ve hizli calisir
              "&" ilk ifade ne olursa olsun digerlerini kontorol eder bu yüzden yavas calisir
              bu yuzden biz hep "&&" bunu kullaniriz.

         */
         boolean first = 3<5;
         boolean second = 2+3 != 5;
         boolean third = 2+3*5 >= 19;
        System.out.println(first + "-" + second +"-" + third);

        System.out.println(first && second); //false
        System.out.println(first || second || third); //true
    }
}
