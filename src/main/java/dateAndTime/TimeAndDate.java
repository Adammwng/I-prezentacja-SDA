package dateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeAndDate {
    public static void main(String[] args) {
        System.out.println(" Jaki dzień był 147 dni temu?");
        System.out.println(LocalDate.now().minusDays(147));
        System.out.println("Jaki dzień będzie za 478 dni?");
        System.out.println(LocalDate.now().plusDays(478));
        System.out.println("Jaki będzie dzień i godzina będzie za 2 lata, 3 miesiące, 8 dni i 47 sekund?");
        System.out.println(LocalDateTime.now().plusYears(2).plusMonths(3).plusDays(8).plusSeconds(47));
        System.out.println("Czy 2 dni temu były przed 3 dni temu?");
        System.out.println(LocalDate.now().minusDays(2).isBefore(LocalDate.now().minusDays(3)));
        System.out.println("Czy 3 godziny temu są po 2 godziny i 58 minut temu?");
        System.out.println(LocalDateTime.now().minusHours(3).isAfter(LocalDateTime.now().minusHours(2).minusMinutes(58)));
        System.out.println("Czy mamy teraz rok przestępny (ang. leap year");
        System.out.println("Ile lat temu był ostatni rok przestępny?");
        System.out.println("Stwórz lokalny czas, z następującego literału: 13:58:20.100");

        //LocalDateTime.parse("2018-11-05", DateTimeFormatter.ofPattern("yyyy MM dd"));
        System.out.println("Stwórz lokalną datę, z następującego literału: 2018#11#24");
        System.out.println("Zapoznaj się z klasą DateTimeFormater i znajdź jakie litery symbolizują:\n" +
                "godzinę w 24h formacie, godzinę w 12h formacie, tydzień miesiąca, tydzień roku,\n" +
                "przesunięcie strefy czasowej.");

    }
}
