package composite.raw;

import composite.raw.statuses.EmAnalise;
import composite.raw.statuses.Finalizado;
import composite.raw.statuses.Status;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento {

    private BigDecimal valor;
    private List<ItemOrcamento> itens;
    private Status status;

    public Orcamento() {
        this.valor = BigDecimal.ZERO;
        this.itens = new ArrayList<>();
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
        return this.itens.size();
    }

    public boolean isFinalizado() {
        return this.status instanceof Finalizado;
    }

    public void adicionarItem(ItemOrcamento item) {
        this.valor = this.valor.add(item.getValor());
        this.itens.add(item);
    }
}