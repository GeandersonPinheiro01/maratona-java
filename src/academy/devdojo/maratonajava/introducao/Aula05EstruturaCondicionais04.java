package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais04 {
    public static void main(String[] args) {
        // $ 0  $ 34,172  9.70%
        // $ 34173   $ 68,507  37.35%
        // $ 68,508  40.50%
        double salarioAnual =70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 40.50 / 100;
        double valor;

        if (salarioAnual <= 34.172) {
            valor= salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34.172 && salarioAnual <= 68.507) {
            valor = salarioAnual * segundaFaixa;
        } else {
            valor = salarioAnual * terceiraFaixa;
        }
        System.out.print(valor);
    }
}