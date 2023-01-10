package day22staticblacksconstructors;
/*
       Constructor nedir?
       class dan object uretmemize yarayan code blocklaridir

       Class olusturdugumuzda Java bize otomatik olarak bir constructor verir
       ama gorunmeyen bir constructor var burada;gozle gorulmeyen otomatik olarak verilen bu
        constructor lara "default constructor" denir.

        "default constructorlar "Car(){}"seklindedir. Isim her zaman class in ismiyle aynidir.
        Constructor sadece object uretmeye yarar
        Biz kendi constructor i olusturdugumuzda Java default constructor i siler

        Bir class da farkli parametreler kullanarak istediginiz kadar constructor
        olusturabilirsiniz

        farkli constructorlar sayesinde bir class dan farkli farkli object er olusturabiliriz

        INTERWIEW SORUSU :
       1) metohdlarda return type vardir
        Constructorlarda yoktur
       2) method isimleri yaptiklari ise gore developer tarafindan belirlenip yazilir
        Constructor isimleri class ismi ile ayni olmak zorundadir

        */
public class Car {
    String make ="Honda";
    String model = "Accord";
    int year = 2023;
    boolean hybrid = true;

    public Car(String make, String model,int year,boolean hybrid){
        this.make=make;
        this.model=model;
        this.year=year;
        this.hybrid=hybrid;

    }
    public Car(String make, String model){
        this.make=make;
        this.model=model;
        if(year==2023){
            this.year=0;
        }
        if (hybrid==true){
            this.hybrid=false;
        }

    }


    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    @Override
    public String toString() {  //burayi yapmak icin bu clasin icine sag tiklayip
                                 //generate tiklayip ToString e gelip tikliyoruz sinra hepsi seciliyken ok a basiyoruz
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';

        //Constructor otomatik olusturmak icin override nin uzerine
        // gelip sag tiklayip generate diyip constructor i secip
        // commend ile istedigimiz i secip ok diyoruz
    }
}
