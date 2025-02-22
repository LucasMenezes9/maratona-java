package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    //Strings funcionam como um Array, com índices e posições
    public static void main(String[] args) {
        String nome ="Luffy";
        String numeros = "012345";
        System.out.println(nome.charAt(0)); // retorna o char baseado no indice que começa no 0
        System.out.println(nome.length());  // para saber o tamenho da String
        System.out.println(nome.replace("f","L")); // troca caracteres 'f' da primeira posição por 'L'
        System.out.println(nome.toLowerCase()); // transforma maiusculas em munusculas
        System.out.println(nome.toUpperCase()); // transforma munusculas em maiusculas
        System.out.println(numeros.substring(3,numeros.length()));
        System.out.println(numeros.substring(3));
        System.out.println(nome.trim()); //remove os valores em branco do começo e do fim da String


    }
}
