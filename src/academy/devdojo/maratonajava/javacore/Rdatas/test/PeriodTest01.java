package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Period;

/*
  * A classe Java 'Period' é usada para medir o tempo em anos, meses e dias. Ele herda a classe Object
   e implementa a interface ChronoPeriod.
  * Ela não aceita um 'LocalDateTime' apenas um 'LocalDate'.
  * Nessa classe não dá pra pegar a quantidade de meses ou anos em dias. Apenas na classe 'ChronoUnit'.
*/
public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);
        Period p1 = Period.between(now, nowAfterTwoYears);
        Period p2 = Period.ofDays(10);  // dias
        Period p3 = Period.ofWeeks(58);  // semanas
        Period p4 = Period.ofMonths(5);  // meses
        Period p5 = Period.ofYears(3);  // anos

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p3.getMonths());
        System.out.println(Period.between(LocalDate.now(), LocalDate.now().plusDays(p3.getDays())).getMonths());


    }
}
