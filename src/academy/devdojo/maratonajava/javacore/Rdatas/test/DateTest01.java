package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Date;
/* Não se utiliza mais a classe 'Date' apenas em sistemas legados.
   Ela utiliza um long e representa milisegundos desde 01/01/1970.
   Todos os métodos dessa classe estão obsoletos.
*/
public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1613061109953L); // long 100000
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }

}
