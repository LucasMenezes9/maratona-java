package academy.devdojo.maratonajava.javacore.Qstring.test;
/*                        Strings
          1. Strings no java são imultaveis.
          2. Ao se criar uma nova String deve tomar cuidado para n achar que está achar que está utilizand se está.
*/
public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Lucas";   // String constat pool (piscina constante de String).
        String nome2 = "Lucas";
        System.out.println(nome.equals(nome2)); // Comparando a referencia do objeto com 'equals'.
        System.out.println(nome == nome2); // '==' Verifica se nome e nome2 fazem referencia ao objeto 'Lucas'
        nome = nome.concat(" Menezes"); // Tentativa de acrescimo da String nome com o método 'concat'.
        System.out.println(nome); // Imultabilidade das Strings, não sofreu alteração apesar o true.
        String nome3 = new String("Lucas");
        System.out.println(nome3);
        System.out.println(nome3.intern());  // pega a referencia no pool de Strings


    }
}
