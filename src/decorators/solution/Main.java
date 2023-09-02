package decorators.solution;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);

        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, new ISS(
                                                            new ICMS(
                                                                    null // ou new IPI()
                                                            )
        )));
    }
}
