package academy.devdojo.maratonajava.indroducao;

public class Aula02TiposPrimitivosCating {
    /*
       * Os tipos primitivos possuem tamanhos específicos em cada tipo.
       * Quando vc escreve um valor inteiro diretamente no código o java entende como inteiro.
       * Já os valores decimal são diferentes
       * 'casting' é quando vc força o java a colocar o valor de uma variável na outra.
       * O casting não é uma prática tão boa. É melhor trocar o tipo (a variável).
     */
    public static void main(String[] args) {
        int idadePai = (int) 4200000000L;  // colocar um 'long' dentro de um 'int'.
        long numeroGrande = 123132L;
        long numeroGrandeCasting = (long) 155.42; // os numeros decimais são do float.
        double salarioDouble = 2000D;
        float salarioFloat = 2500F; // o 'F' indica que o valor é especificamente um float
        float salarioFloatCast = (float) 3500.00D;
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char numero = 65; // O 'char' traduz para a tabela ASCII
        char caractere = '\u0041';  // se for utilizar a tabela UNICOD '\u0041' que é a

        System.out.println("Idade do Pai: " + idadePai);  // o resultado é um numero cortado.
        System.out.println(numero +" - "+ caractere);
        System.out.println(salarioFloatCast);
        System.out.println(numeroGrandeCasting); // ele vai ignorar os numeros decimais
    }
}
