package chainOfResponsability.solutionWithAbstractClass;

import java.math.BigDecimal;

public class DescontoPorValorDoOrcamento extends Desconto {

    public DescontoPorValorDoOrcamento(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getValor().compareTo(new BigDecimal("500.0")) > 0) {
            return orcamento.getValor().multiply(new BigDecimal("0.05"));
        }

        return proximo.calcular(orcamento);
    }
}
