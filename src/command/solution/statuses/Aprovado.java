package command.solution.statuses;

import command.solution.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends Status {
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.02"));
    }

    public void finalizar(Orcamento orcamento) {
        orcamento.setStatus(new Finalizado());
    }
}
