package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
    // Diferentes da 'String', 'StringBuider e 'StringBuffer são classes multaveis.
        String nome = "Lucas";
        nome.concat("Menezes"); // 'concat' não funciona pq a String é inviolável.
        nome = nome.substring(0,3);
        System.out.println(nome); //Strings são imultaveis.

        StringBuilder sb = new StringBuilder("Lucas Menezes");
        sb.append(" é programador java"); // O metodo 'append' da StringBuilder funciona como um 'concat' da String
        // As Strings são concatenadas com sinal de '+'. Já o StringBuilder e o StringBuffer com o '.append'.
        sb.append(" e também").append(" Python").append(" JavaScript").append(" HTML").append(" etc");
        //sb.substring(0,2); // o 'substring' retorna uma String.
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        StringBuffer sbf = new StringBuffer("Lucas Santos");
        sbf.append(" Menezes");
        System.out.println(sbf);
    }
}
