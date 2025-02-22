package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Attack on titan ");
        mangas.add("Berserk ");
        mangas.add("Hellsing Ultimate ");
        mangas.add("Pokemon ");
        mangas.add("Dragon bal z ");

        Collections.sort(mangas);  // Reorganiza a lista na ordem alfabetica.

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(95.88);
        dinheiros.add(88.32);
        dinheiros.add(21.31);

        for (String manga : mangas){
            System.out.println(manga);
        }
        System.out.println(dinheiros);
        Collections.sort(dinheiros); //Reorganiza na ordem do maior para o menor.
        System.out.println(dinheiros);



    }
}
