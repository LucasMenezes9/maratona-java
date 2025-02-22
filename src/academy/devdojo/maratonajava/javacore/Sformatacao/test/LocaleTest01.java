package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

/*              Classe Local
  1 - Foi criada para trabalhar com internacionalização.
  2 - Pode formatar datas, moedas e numeros baseada na preferncia do usuário ou na localização da JVM.
  3 - Não é uma classe abstrata (possibilita trabalhar com diversos tipos de formatação).
*/
public class LocaleTest01 {
    public static void main(String[] args) {
        // segue duas ISOS (lingua = pt e o país = BR)
        Locale localeItaly = new Locale("it","IT");
        Locale localeSuica = new Locale("it","CH");
        Locale localeBrasil = new Locale("pt","BR");
        Locale localeIndia = new Locale("hi", "IN");
        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeSuica );
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeBrasil );
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);

        System.out.println("Italia " + df1.format(calendar.getTime()));
        System.out.println("Suíça " + df2.format(calendar.getTime()));
        System.out.println("Brasil " + df3.format(calendar.getTime()));
        System.out.println("India " + df4.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry(localeItaly));
        System.out.println(localeSuica.getDisplayCountry(localeSuica));
        System.out.println(localeBrasil.getDisplayCountry(localeBrasil));
        System.out.println(localeIndia.getDisplayCountry(localeIndia));



    }
}
