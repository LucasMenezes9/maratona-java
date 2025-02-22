package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

// Usando objetos nas listas.

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1","iPhone");
        Smartphone s2 = new Smartphone("22222","Pixel");
        Smartphone s3 = new Smartphone("33333","Samsung");
        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);
        //smartphones.clear();  // limpa o ArrayList<>
        for (Smartphone smartphone: smartphones) {
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("22222","Pixel");

        System.out.println(smartphones.contains(s4));  //verifica se o s4 '22222', 'Pixel' já está na lista com 'true'
        int indexSmatphone4 = smartphones.indexOf(s4); // vai trazer o indice do objeto que vc está passando.
        System.out.println(indexSmatphone4);  // se não encontrar o indice, retorna -1
        System.out.println(smartphones.get(indexSmatphone4)); // pega o indice 3, s4.
    }
}
