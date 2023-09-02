package decorators.raw;

import adapter.solution.Orcamento;

import java.time.LocalDateTime;

public class Pedido {

    private String cliente;
    private LocalDateTime data;
    private adapter.solution.Orcamento orcamento;

    public Pedido(String cliente, LocalDateTime data, adapter.solution.Orcamento orcamento) {
        this.cliente = cliente;
        this.data = data;
        this.orcamento = orcamento;
    }

    public String getCliente() {
        return cliente;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }
}
