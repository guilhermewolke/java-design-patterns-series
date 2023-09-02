package adapter.raw;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoPorQuantidadeDeItens(
                            new DescontoPorValorDoOrcamento(
                            new SemDesconto()
                            ));
        return desconto.calcular(orcamento);

    }
}
