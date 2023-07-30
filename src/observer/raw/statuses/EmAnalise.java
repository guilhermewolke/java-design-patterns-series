package observer.raw.statuses;

import observer.raw.Orcamento;

import java.math.BigDecimal;

public class EmAnalise extends Status {
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    public void aprovar(Orcamento orcamento) {
        orcamento.setStatus(new Aprovado());
    }

    public void reprovar(Orcamento orcamento) {
        orcamento.setStatus(new Reprovado());
    }

}
