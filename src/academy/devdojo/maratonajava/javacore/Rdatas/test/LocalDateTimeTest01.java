package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/*  A classe 'LocalDateTime' é uma junção da classe 'LocalDate' e 'LocalTime' */
public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.of(2022, Month.AUGUST, 6);
        LocalTime time = LocalTime.of(9,45,21);
        LocalDate dateParse = LocalDate.parse("2025-08-06"); //pegando o valor diretamente de uma String
        LocalTime timeParse = LocalTime.parse("09:45:00"); //pegando o valor diretamente de uma String
        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateParse);
        System.out.println(timeParse);
        // Existe a possibilidade de fazer a junção da 'LocalTime' e 'LocalDate'.
        LocalDateTime ldt1 = date.atTime(time);
        System.out.println(ldt1);

    }

}
