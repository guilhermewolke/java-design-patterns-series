package command.solution.statuses;

import command.solution.Orcamento;

import java.math.BigDecimal;

public abstract class Status {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(BigDecimal.ZERO);
    }
    public void aprovar(Orcamento orcamento) {
        throw new RuntimeException("Este orçamento não pode ser aprovado");
    }

    public void reprovar(Orcamento orcamento) {
        throw new RuntimeException("Este orçamento não pode ser reprovado");
    }

    public void finalizar(Orcamento orcamento) {
        throw new RuntimeException("Este orçamento não pode ser finalizado");
    }
}
