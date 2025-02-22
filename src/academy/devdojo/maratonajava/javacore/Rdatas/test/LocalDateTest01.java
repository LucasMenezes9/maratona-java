package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;
public class LocalDateTest01 {
    /*
     * Classe imultavel (não pode criar instancias utilizando 'new')
     * Criada na versão 8 do java
     * Sempre trabalhe com a 'LocalDate', exceto em sistemas legados.
     */
    public static void main(String[] args) {
        // Já sabemos criar datas com 'new Date()' e 'Calendar.getInstace()'
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());  // do pacote 'Calendar'
        System.out.println(Month.JANUARY.getValue());

        LocalDate date = LocalDate.of(2022, Month.JANUARY, 27);
        LocalDate agora = LocalDate.now();
        agora.plusWeeks(4); // LocalDate é imutável e não adicionará os 4 dias.

        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());  // pega o dia do mês.
        System.out.println(date.getDayOfWeek());  // nome do dia
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth());  // quantos dias tem o mês
        System.out.println(date.lengthOfYear());  // quantos dias tem o ano
        System.out.println(date.isLeapYear());  // descobrir se o ano é bissexto: v ou f
        System.out.println(date.get(ChronoField.YEAR_OF_ERA));
        System.out.println(date.get(ChronoField.YEAR));
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
        System.out.println(date);  //A data é impressa agora como geralmente é salva no banco de dados.
        System.out.println(agora);  //A data é impressa agora como geralmente é salva no banco de dados.
        System.out.println(LocalDate.MAX); //data maxima utilizavel
        System.out.println(LocalDate.MIN);  //data minima utilizavel
    }
}
