package adapter.solution;

import java.math.BigDecimal;

public class DescontoPorQuantidadeDeItens extends Desconto {

    public DescontoPorQuantidadeDeItens(Desconto proximo) {
        super(proximo);
    }

    @Override
    public boolean deveAplicarDesconto(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
