package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

/* 1 - A classe 'calendar' é do pacote java.util
   2 - Ela é uma classe abstrata(não pode usar new)
*/
public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(); // '.getInstance' para pegar uma instancia da classe calendar
        if(c.getMinimalDaysInFirstWeek() == Calendar.SUNDAY){
            System.out.println("Domindo é o primeiro dia da semana");
        }
        System.out.println(c.get(Calendar.DAY_OF_WEEK)); // Dia da semana
        System.out.println(c.get(Calendar.DAY_OF_MONTH));  // dia do Mês
        System.out.println(c.get(Calendar.DAY_OF_YEAR));  // Dia do ano
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));  // Dia da semana no mês        Date date = c.getTime();

        c.add(Calendar.DAY_OF_MONTH, 2); // acrescenta dois dias
        c.add(Calendar.HOUR, 1);
        Date date = c.getTime();
        System.out.println(date);


    }
}
