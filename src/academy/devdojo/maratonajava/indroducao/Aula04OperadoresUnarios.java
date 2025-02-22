package academy.devdojo.maratonajava.indroducao;
/*          OPERADORES UNÁRIOS
    * São operadores que envolvem apenas um operando, diferente dos demais operadores que envolvem dois operando.
    * Pode ser de Incremento e Decremento.
    *
 */
public class Aula04OperadoresUnarios {
    public static void main(String[] args) {
        int contador1 = 0;
        int contador2 = 0;

        contador1 +=1;
        contador1 ++;  // incremento
        contador1 --;  // decremento
        System.out.println(contador1);

        ++ contador2;  // primeiro icrementa depois executa.
        System.out.println(contador2);

        contador2 ++;  // primeiro executa depois incrementa.
        System.out.println(contador2);

    }

}
