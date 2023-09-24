package proxy.solution;

import proxy.solution.statuses.EmAnalise;
import proxy.solution.statuses.Status;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Orcamento {

    protected BigDecimal valor;
    private int quantidadeItens;
    private Status status;

    public Orcamento() {
    }

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
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("Chamada do método getValor() às " + LocalDateTime.now().format(formatter));

        return valor;
    }

    public int getQuantidadeItens() {
        return this.quantidadeItens;
    }

}
