package academy.devdojo.maratonajava.indroducao;
/*             OPERADORES DE ATRIBUIÇÃO
    * Foram criados para economisar um pouco de código.
    * São eles: =, +=, -=, *=, /-, %=
 */
public class Aula04OperaddoresDeAtribuicao {
    public static void main(String[] args) {

        double bonus = 1800;
        bonus += 1000;               //é o mesmo que: 'bonus = bonus + 1000;'
        System.out.println(bonus);
        bonus -= 1000;               //é o mesmo que: 'bonus = bonus - 1000;'
        System.out.println(bonus);
        bonus *= 2;                  //é o mesmo que: 'bonus = bonus * 2;'
        System.out.println(bonus);
        bonus /= 2;                  //é o mesmo que: 'bonus = bonus / 2;'
        System.out.println(bonus);
        bonus %= 2;
        System.out.println(bonus);

    }
}
