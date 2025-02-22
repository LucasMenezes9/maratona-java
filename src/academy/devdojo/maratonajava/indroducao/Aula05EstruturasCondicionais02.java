package academy.devdojo.maratonajava.indroducao;

import javax.swing.event.ListDataEvent;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // Idade < 15 categoria infantil
        // Idade >= 15 && idade < 18 categoria juvenil
        // Idade < 18 categoria adulto
        int idade = 20;
        String categoria;

        if (idade < 15){
            categoria = "categoria infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        }else {
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    }
}
