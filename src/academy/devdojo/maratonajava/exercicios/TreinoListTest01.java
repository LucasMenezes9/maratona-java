package academy.devdojo.maratonajava.exercicios;

import java.util.ArrayList;
import java.util.List;

public class TreinoListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Lucas ");
        nomes.add("Santos ");
        nomes.add("Menezes");
        //nomes.add(121456789);

        for (String nome: nomes){
            System.out.print(nome);
        }
    }
}
