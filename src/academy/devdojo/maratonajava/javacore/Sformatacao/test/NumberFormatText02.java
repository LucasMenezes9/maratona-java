package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/*           Classe NumberFormat (Moedas)
    1 - É uma classe abstrata (não pode  utilizar 'new', não pode istanciar).
    2 - Para pegar um objeto desta classe se utiliza 'getInstace()' ou 'getNumberInstace()' ou "qualquer "getInstance' disponivel.
    3 - Formatação para numeros utilizando 'Locale'.
 */
public class NumberFormatText02 {
    public static void main(String[] args) {

        Locale localeUS = Locale.US;
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        Locale localeCN = Locale.CANADA;

        NumberFormat[] nfa = new NumberFormat[5];
        nfa[0] = NumberFormat.getCurrencyInstance(localeUS);
        nfa[1] = NumberFormat.getCurrencyInstance(localeBR);
        nfa[2] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);
        nfa[4] = NumberFormat.getCurrencyInstance(localeCN);

        double valor = 1000.2130;
        for (NumberFormat numberFormat : nfa) {
            //System.out.println(numberFormat.getMaximumFractionDigits());
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "$1,000.2130";
        try {
            System.out.println(nfa[0].parse(valorString)); // pega e imprime o valor da String. Se tiver um caractere inválido ele não faz o 'parse'.
        } catch (ParseException e) {
            e.printStackTrace();

        }
    }
}
