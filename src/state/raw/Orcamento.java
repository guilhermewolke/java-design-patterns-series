package state.raw;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private int quantidadeItens;
    private String status;

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDoDescontoExtra = BigDecimal.ZERO;

        if (status.equals("EM ANALISE")) {
            valorDoDescontoExtra = new BigDecimal("0.05");
        } else if (status.equals("APROVADO")) {
            valorDoDescontoExtra = new BigDecimal("0.02");
        }

        this.valor = this.valor.subtract(valorDoDescontoExtra);
    }

    public void aprovar() {
        this.status = "APROVADO";
    }

    public void reprovar() {
        this.status = "REPROVADO";
    }

    public void finalizar() {
        this.status = "FINALIZADO";
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeItens() {
        return this.quantidadeItens;
    }

}
