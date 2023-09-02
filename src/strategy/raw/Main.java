package strategy.raw;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100.0"));
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, TipoImposto.ICMS)); // Imprime 10.00
        System.out.println(calculadora.calcular(orcamento, TipoImposto.ISS)); // Imprime 6.00
    }
}
