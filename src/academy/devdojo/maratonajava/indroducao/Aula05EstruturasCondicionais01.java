package academy.devdojo.maratonajava.indroducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade1 = 18;
        int idade2 = 19;
        boolean isAutorizadoComprarBebida = idade1 >= 18;
        boolean isNaoAutorizadoComprarBebida = idade2 < 18;

        if (isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida alcólica");
        }
        if(! isAutorizadoComprarBebida) {  // '!' se não autorizado
            System.out.println("Não autorizado a comprar bebida alcólica");
        }
        boolean c = false;
        if (c = true){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
        if (isNaoAutorizadoComprarBebida){
            System.out.println("Não autorizado a comprar bebida alcólica");
        }else{
            System.out.println("Autorizado a comprar bebida alcólica");
        }
    }
}
