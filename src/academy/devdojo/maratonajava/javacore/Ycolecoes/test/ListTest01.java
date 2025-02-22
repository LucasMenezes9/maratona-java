package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
/* Como era feito antigamente na versão 1.4 do Java: List <String> nomes = new ArrayList<>();
   Já apartir da versão 1.5: List <String> nomes = new ArrayList<>();
   Pode trabaplhar com Object na variável de referência, mas não é indicado pq é Object é muito genérico.
*/

        List <String> nomes = new ArrayList<>(16); // não precisa definir o tipo no objeto, somente na variável de referência.
        List<String> nomes2 = new ArrayList<>();
        nomes.add("Lucas");
        nomes.add("Empresa LSM");
        nomes.remove(1); // remove o indice 1;
        nomes2.add("Menezes");
        nomes.addAll(nomes2); // Adiciona 'Menezes' do List nomes em nomes2.

        for (String nome: nomes){
            System.out.println(nome);
        }
        System.out.println("___________________");

        int size = nomes.size(); // Essa linha quebra a iteração infinita do 'fori'
        for (int i = 0; i < size; i++) {
            System.out.println(nomes.get(i));
// Deve ser utilizado classes Wrapper e não tipos primitivos na criação de coleções.
        }
        List<Integer> numeros = new ArrayList<>();
        numeros.add(0,2);
        numeros.add(1,3);
        numeros.add(2,4);
        numeros.remove(1);
        System.out.println(numeros);

    }
}
