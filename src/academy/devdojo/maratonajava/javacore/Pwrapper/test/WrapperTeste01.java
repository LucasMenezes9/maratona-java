package academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class WrapperTeste01 {
    public static void main(String[] args) {
        /*
           * As classes Whappers encapsulam os tipos primitivos e os transformam em objetos.
           * Whappers são classes que representam os tipos primitivos.
           * Para criar um wrapper é só pegar o tipo primitivo e colocar a primeira letra maiuscula
            com exceçao do 'int' e do 'char' que tem 1ª letra maiuscula e acrécimos .
           * Com Whappers (objetos) há possibilidade de chamar metodos.
         */
     byte byteP = 1;
     short shortP = 1;
     long longP = 10L;
     int intP = 1;
     float floatP = 10F;
     double doubleP = 100;
     char charP = 'W';
     boolean booleanP = false;


     Byte byteW = 1;
     Short shortW = 1;
     Integer intW = 1;  // autoboxing ou boxing - estou envelopando - colocando em uma caixa
     Long longW = 10L;  // autoboxing ou boxing - do tipo primitivo para o Wrapper
     Float floatW = 10F;
     Double doubleW = 100D;
     Character charW = 'W';
     Boolean booleanW = false;

     int i = intW ;  //unboxing - tenho o tipo primitivo e quero pegar o Whapper - o java transforma o Whapper em tipo primitivo
     int j = intW.intValue();  // aqui o unboxing está pegando o tipo primitivo do int (intW.intValue).
     Integer intW2 = Integer.parseInt("1");  // pegar de um valor de String com metodos estáticos
     //Integer intW3 = new Integer("2"); // poderia ser assim, mas não fica bem (fica feio usar assim).
     Float f = Float.parseFloat("1");
     // Character não tem a opção de fazer o '.parseCharacter' ele não aceita uma String.
     boolean verdadeiro = Boolean.parseBoolean("truE");
     System.out.println(verdadeiro);

     // O uso do Character dá muitas possibilidades de uso de métodos utilitários
     System.out.println(Character.isDigit('A')); // verifica se é digito, resutado: verdadeiro ou falso
     System.out.println(Character.isDigit('9'));
     System.out.println(Character.isLetterOrDigit('!'));
     System.out.println(Character.isUpperCase('A'));
     System.out.println(Character.isLowerCase('a'));
     System.out.println(Character.toUpperCase('a'));
     System.out.println(Character.toLowerCase('A'));
    }
}
