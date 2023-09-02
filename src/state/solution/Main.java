package state.solution;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento(new BigDecimal("100.0"), 6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("600.0"), 1);
        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(orcamento1)); // Imprime 10.00
        System.out.println(calculadora.calcular(orcamento2)); // Imprime 30.00
        orcamento1.aplicarDescontoExtra();
        System.out.println(calculadora.calcular(orcamento1)); // Imprime 9.50
        orcamento1.aprovar();
        orcamento1.aplicarDescontoExtra();
        System.out.println(calculadora.calcular(orcamento1)); // Imprime 9.31
        orcamento1.finalizar();
        orcamento1.aplicarDescontoExtra();
        System.out.println(calculadora.calcular(orcamento1)); // Imprime 9.31:wq!
    }
}
