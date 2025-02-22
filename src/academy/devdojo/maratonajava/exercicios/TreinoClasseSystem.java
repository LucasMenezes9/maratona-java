package academy.devdojo.maratonajava.exercicios;

public class TreinoClasseSystem {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis(); // pega o tempo atual do seu sistema em milisegundos.
        concatString(30_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String " + (fim - inicio) + "ms");

    }
    private static void concatString(int tamanho) {
        String texto = " ";
        for (int i = 0; i < tamanho; i++) {
            texto += i; // 0,01,012,013
        }
    }
}
