package academy.devdojo.maratonajava.indroducao;

public class Aula04OperadoresRelacionais {
    public static void main(String[] args) {
        // Operadores Relacionais: <, >, <=, >=, ==, !=
        // o resultado é sempre lógico

        boolean isDezMaiorVinte = 10 > 20;
        boolean isDezMenorVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        boolean isDezMaiorIgualDez = 10 >= 10;
        boolean isDezMenorIgualDez = 10 <= 10;


        System.out.println("isDezMaiorVinte: "+isDezMaiorVinte);
        System.out.println("isDezMenorVinte: "+isDezMenorVinte);
        System.out.println("isDezIgualVinte: "+isDezIgualVinte);
        System.out.println("isDezIgualDez: "+isDezIgualDez);
        System.out.println("isDezDiferenteDez: "+isDezDiferenteDez);
        System.out.println("isDezMaiorIgualDez: "+isDezMaiorIgualDez);
        System.out.println("isDezMenorIgualDez: "+isDezMenorIgualDez);


    }
}
