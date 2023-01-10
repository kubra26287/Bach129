import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class DateTime01 {

    public static void main(String[] args) {
        //Date Class
        Date myDate = new Date();
        System.out.println(myDate);// bu yazdirilan o anin tarih ve saatini verir
        System.out.println(myDate.getTime()); // getTime 1 ocak 1970 den itibaren gecen mili saniye miktarini veriyor. 1673123312704

        //Icinde bulundugumuz an nasil alinir?
        System.out.println(LocalDate.now());// 2023-01-07 yerel tarih
        System.out.println(LocalTime.now());//21:34:31.565602
        System.out.println(LocalDateTime.now());//2023-01-07 T 21:36:08.090313

        //Dunyanin her hangi bir saat dilimindeki saati nasil aliriz
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Berlin")));//2023-01-07T21:45:22.365743
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));//2023-01-08T05:45:22.365931

        //ileri ki bir tarihe nasil gidilir?
        System.out.println(LocalDateTime.now().plusYears(7).plusMonths(5).plusDays(35));//2030-07-12T21:51:53.210284

        //ileri ki bir tarihe nasil gidilir?
        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2));//2018-10-05

        // ileriki bir zamana nasil gidilir
        System.out.println(LocalTime.now().plusHours(3));//00:56:20.665461 o anki saat 21.56 idi
        System.out.println(LocalTime.now().minusMinutes(45));//21:13:07.923986  o an saat 21:58 idi saat

        //zamanda belli bir bolumu nasil aliriz ?
        System.out.println(LocalTime.now().getHour() +":" +LocalTime.now().getMinute());//22:0

        //Tarih de belli bir blumu nasil aliriz?
        System.out.println(LocalDate.now().getMonth() + ":" + LocalDate.now().getDayOfMonth());//JANUARY:7
        System.out.println(LocalDate.now().getMonthValue() + ":" + LocalDate.now().getDayOfMonth());//1:7

        //Iki tarih nasil karsilastirilir
        //02/13/2005
       boolean result = LocalDate.of(2005,02,13).isBefore(LocalDate.of(2007,03,01));
        System.out.println(result);

                                                                           
        //Tarihlerin formalari nasil degitirilir?                          //M tek yazilirsa ay no sunu yazar
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //3 tane buyuk M koyarsak yaziyla yazar (Jan)
                                                                           // ay yerine 4 tane M koyarsak ayin tamamini(Januar) yazar
        System.out.println(dtf.format(LocalDate.now()));//07/01/2023       // kucuk mm dakikayi verir o yuzden buyuk M yazariz
    }

}
