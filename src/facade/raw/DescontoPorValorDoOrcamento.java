package facade.raw;

import java.math.BigDecimal;

public class DescontoPorValorDoOrcamento extends Desconto {

    public DescontoPorValorDoOrcamento(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public boolean deveAplicarDesconto(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500.0")) > 0;
    }
}
