package academy.devdojo.maratonajava.indroducao;

public class Aula04OperadoresAritimeticos {
    public static void main(String[] args) {
         //Operadores aritimeticos são: +, -, *,  /, %

        int numero1 = 10;
        int numero2 = 20;
        int subtracao = numero2 - numero1 ;
        int soma = numero1 + numero2; 
        int multiplicacao = numero2 * numero1;
        int divisao = numero2 / numero1;

        System.out.println(subtracao);
        System.out.println(soma);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println("Soma "+numero1 + numero2); //nesse caso o entende q o '+' é concatenação

    }
}
