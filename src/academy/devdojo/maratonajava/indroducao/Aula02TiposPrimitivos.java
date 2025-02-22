package academy.devdojo.maratonajava.indroducao;

public class Aula02TiposPrimitivos {
      /*  Tipos primitivos

       Temos 8 Tipos Primitivos: int; double; float; char; byte; short; long; bolean.
         * Palavras simples se usa: idade.
         * Palavras composta se usa: IdadeDoPai.
         * Se inicia uma variável com o valor de '='
         * Para concatenar, se utiliza sinal de '+'
         * Todos os tipos primitivos com exceção do 'bolean' são numéricos.
       */
      public static void main(String[] args) {

          int idadePai = 42;
          long numeroGrande = 123132;
          double salarioDouble = 2000;
          float salarioFloat = 2500;
          byte idadeByte = -128;
          short idadeShort = 10;
          boolean verdadeiro = true;
          boolean falso = false;
          char numero = 65; // O 'char' traduz para a tabela ASCII
          char caractere = '\u0041';  // se for utilizar a tabela UNICOD '\u0041' que é a
          String nome = "Lucas Menezes"; // String não é tipo primitivo, mas uma classe.
          //var nome2 = "vegeta"; 'var' só funciona apartir do java 10, estamos utilizando java 8.

          System.out.println("Idade do Pai: " + idadePai);
          System.out.println(numero +" - "+ caractere);
          System.out.println(nome);


      }



}
