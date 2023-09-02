package chainOfResponsability.solutionWithInterface;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {
    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return BigDecimal.ZERO.setScale(2);
    }
}
