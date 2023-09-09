package composite.raw;

import java.math.BigDecimal;

public abstract class Imposto {
    private Imposto outroImposto;

    public Imposto(Imposto imposto) {
        this.outroImposto = imposto;
    }

    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);
    public BigDecimal calcular(Orcamento orcamento) {
        BigDecimal valorImposto = realizarCalculo(orcamento);
        BigDecimal valorDoOutroImposto = BigDecimal.ZERO;

        if (outroImposto != null) {
            valorDoOutroImposto = outroImposto.realizarCalculo(orcamento);
        }
        return valorImposto.add(valorDoOutroImposto);
    }
}
