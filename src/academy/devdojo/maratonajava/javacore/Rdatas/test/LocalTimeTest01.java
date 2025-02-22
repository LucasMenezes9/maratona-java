package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

/* A classe Java LocalTime é uma classe imutável que representa o tempo com um formato padrão de
hora-minuto-segundo. Ele herda a classe Object e implementa a interface Comparable.*/
public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23,32,12);
        LocalTime timeNow = LocalTime.now();  // pegar a hora de agora
        System.out.println(time);
        System.out.println(timeNow);
        System.out.println(time.getHour()); // metodo para pegar hora
        System.out.println(time.getMinute()); // metodo para pegar minuto
        System.out.println(time.getSecond()); // metodo para pegar segundo
        System.out.println(time.get(ChronoField.HOUR_OF_DAY));
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIDNIGHT);



    }
}
