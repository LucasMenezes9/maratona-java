package academy.devdojo.maratonajava.indroducao;
/*                 Exercício

   *Crie variávei para os campos emtre os sinais < > e imprima a seguinte mensagem:
       Eu <nome>, morando no endereço <endereço>,
        confirmo que recebi o salário de <salário>,
        na data <data>.
 */
public class Aula03TiposPrimitivosEx1 {
    public static void main(String[] args) {
        String nome = "Lucas";
        String endereco = "Rua das Patativas";
        double salario = 2500.25;
        String dataRecebimentoSalario = "10/10/2022";

        String relatorio= "Eu "+nome+ ", morando no endereço " +endereco+
                ", confirmo que recebi o salário de " +salario+
                ", na data " +dataRecebimentoSalario;

        System.out.println(relatorio);

    }
}
