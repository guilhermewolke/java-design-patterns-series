package strategy.solution;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100.0"));
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, new ICMS())); // Imprime 10.00
        System.out.println(calculadora.calcular(orcamento, new ISS())); // Imprime 6.00
    }
}
