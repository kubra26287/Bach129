package day03scanner;

public class Runner {
    public static void main(String[] args) {

        //object nasil olusturulur?
        //class ismi   Object ismi    Atama Operatorü   "new" keyword      Constructor==>
            Car          myCar        =                     new               Car();


        System.out.println(myCar.fiyat);
        System.out.println(myCar.model);

        myCar.hareket();
        myCar.dur();


        Student tomhanks = new Student();
        System.out.println(tomhanks.name);

        System.out.println(tomhanks.grade);

        System.out.println(tomhanks.address);

        tomhanks.study();

        Kleidung mykleidung = new Kleidung();

        System.out.println(mykleidung.model);
        System.out.println(mykleidung.renk);

        mykleidung.sekil();

        Haus myHaus = new Haus();
        System.out.println(myHaus.preis);
        System.out.println(myHaus.mertrekare);
        System.out.println(myHaus.model);

        myHaus.özellik();




    }
}
