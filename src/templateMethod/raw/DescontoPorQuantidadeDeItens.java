package templateMethod.raw;

import java.math.BigDecimal;

public class DescontoPorQuantidadeDeItens extends Desconto {

    public DescontoPorQuantidadeDeItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        return proximo.calcular(orcamento);
    }
}
