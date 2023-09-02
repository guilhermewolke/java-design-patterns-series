package decorators.solution;

import java.math.BigDecimal;

public class ISS extends Imposto {

    public ISS(Imposto imposto) {
        super(imposto);
    }

    public BigDecimal realizarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
