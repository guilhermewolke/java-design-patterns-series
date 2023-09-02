package decorators.raw;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {
    public SemDesconto() {
        super(null);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    @Override
    public boolean deveAplicarDesconto(Orcamento orcamento) {
        return true;
    }
}
