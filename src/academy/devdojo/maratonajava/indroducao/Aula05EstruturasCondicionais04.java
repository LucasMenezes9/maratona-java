package academy.devdojo.maratonajava.indroducao;

public class Aula05EstruturasCondicionais04 {
    /*
    * $0         $34,712     9.12%
    * $34,713    $68,507    37,35%
    * $68,508    $          49%
    */
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double primeiraFaixa = 9.12 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.1250 / 100;
        double valorImposto;

        if(salarioAnual <= 34712){
            valorImposto = segundaFaixa * primeiraFaixa;
        }else if (salarioAnual >= 34713 && salarioAnual <= 68507){
            valorImposto = salarioAnual * segundaFaixa;
        }else{
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println("Valor do imposto = "+valorImposto);
        System.out.println("Salario + imposto = ");
    }

}
