package facade.solution;

import java.math.BigDecimal;

public class GerarPedidoDados {

    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidadeItens;

    public GerarPedidoDados(String cliente, BigDecimal valorOrcamento, int quantidadeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeItens = quantidadeItens;
    }

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }
}
