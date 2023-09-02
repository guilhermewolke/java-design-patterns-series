package state.solution;

import state.solution.statuses.EmAnalise;
import state.solution.statuses.Status;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private int quantidadeItens;
    private Status status;

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.status = new EmAnalise();
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDoDescontoExtra = this.status.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDoDescontoExtra);
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void aprovar() {
        this.status.aprovar(this);
    }

    public void reprovar() {
        this.status.reprovar(this);
    }

    public void finalizar() {
        this.status.finalizar(this);
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeItens() {
        return this.quantidadeItens;
    }

}
