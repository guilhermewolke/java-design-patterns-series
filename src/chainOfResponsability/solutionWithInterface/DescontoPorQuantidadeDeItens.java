package chainOfResponsability.solutionWithInterface;

import java.math.BigDecimal;

public class DescontoPorQuantidadeDeItens extends Desconto {

    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1")).setScale(2);
        }
        this.setProximo(new DescontoPorValorDoOrcamento());
        return this.proximo.calcular(orcamento);
    }
}
