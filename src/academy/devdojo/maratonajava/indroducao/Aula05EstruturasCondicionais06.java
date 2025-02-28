package academy.devdojo.maratonajava.indroducao;

/*A instrução switch funciona com tipos byte, short, int, long, enum, String e
alguns tipos wrapper como Byte, Short, Int e Long. Simplifica o 'if else'.
 */
public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Imprima o dia da semana, considerando 1 como domindo.
        /*byte dia = 5;
        if (dia ==1){
            System.out.printf("Domingo");
        } else if (dia == 2) {
            System.out.printf("Segunda");
        }*/
        byte dia = 4;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:  //posde ficar em qualquer lugar.
                System.out.println("Opção inválida");
                break;
        }
        char sexo = 'M';
        switch (sexo){
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Inválido");
                break;
        }
    }
}
