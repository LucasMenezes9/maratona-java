package academy.devdojo.maratonajava.javacore.Qstring.test;
// Strings são imultáveis e por causa disso a pereformance das Strings vai diminuindo quando aumeneta a quantidade utilizada.
// StringBuilder é uma classe q foi criada para resolver esse problema da String, funciona um pouco diferente das Strings.
// StringBuffer é o mesmo que StringBuilder, criada para ambiente multitrade, quando multiplas trades acessam o mesmo recurso ao mesmo tempo.

public class
StringPerformanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis(); // pega o tempo atual do seu sistema em milisegundos.
        concatString(30_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis(); // pega o tempo atual do seu sistema em milisegundos.
        concatStringBuilder(900_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis(); // pega o tempo atual do seu sistema em milisegundos.
        concatStringBuffer(900_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer " + (fim - inicio) + "ms");

    }
    // String - tem uma performance ruim com o aumento de acessos
    private static void concatString(int tamanho) {
        String texto = " ";
        for (int i = 0; i < tamanho; i++) {
            texto += i; // 0,01,012,013
        }
    }
   // StringBuilder funciona um pouco deferente das Strings melhorando o desempenho
    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i); // não é String e sim uma classe.
        }
    }
    // StringBuffer tem o metodo synchronized que só permite uma trade acessar determinado método por vez.
    private static void concatStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i); // não é String e sim uma classe.
        }
    }

}
