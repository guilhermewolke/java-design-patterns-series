package chainOfResponsability.solutionWithInterface;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento(new BigDecimal("100.0"), 6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("600.0"), 1);
        Orcamento orcamento3 = new Orcamento(new BigDecimal("400.0"), 1);

        DescontoInterface desconto = new DescontoPorQuantidadeDeItens();
        System.out.println(desconto.calcular(orcamento1)); //Imprime 10.0
        System.out.println(desconto.calcular(orcamento2)); //Imprime 30.0
        System.out.println(desconto.calcular(orcamento3)); //Imprime 0 (null)

    }
}
