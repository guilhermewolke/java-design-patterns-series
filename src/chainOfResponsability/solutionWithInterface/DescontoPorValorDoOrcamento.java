package chainOfResponsability.solutionWithInterface;

import java.math.BigDecimal;

public class DescontoPorValorDoOrcamento extends Desconto {

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getValor().compareTo(new BigDecimal("500.0")) > 0) {
            return orcamento.getValor().multiply(new BigDecimal("0.05")).setScale(2);
        }
        this.setProximo(new SemDesconto());
        return this.proximo.calcular(orcamento);
    }
}
