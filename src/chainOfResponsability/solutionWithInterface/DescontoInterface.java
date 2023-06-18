package chainOfResponsability.solutionWithInterface;

import java.math.BigDecimal;

public interface DescontoInterface {
    void setProximo(DescontoInterface proximo);
    BigDecimal calcular(Orcamento orcamento);
}
