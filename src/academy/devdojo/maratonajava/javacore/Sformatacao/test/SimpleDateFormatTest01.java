package academy.devdojo.maratonajava.javacore.Sformatacao.test;
/*
* A 'Simple Date Format' oferece um puco mais de flexibilidade do que a 'Date Format'(vide documentação da classe).
* Tudo que for ligado a formatação está no pacote 'java.txt'.
*/
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));

        String pattern2 = "'Amsterdam' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf2 = new SimpleDateFormat(pattern2);
        System.out.println(sdf2.format(new Date()));

        try {
            System.out.println(sdf2.parse("Amsterdam 28 de março de 2024"));  // Fazendo o cantrário c/ 'parse' ele retorna em 'Date'.
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    // Muito bom pra quem trabalha com datas customizadas, tipo, para relatório.
}
