package observer.raw.statuses;

import observer.raw.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends Status {
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.02"));
    }

    public void finalizar(Orcamento orcamento) {
        orcamento.setStatus(new Finalizado());
    }
}
