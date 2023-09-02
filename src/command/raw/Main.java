package command.raw;

import command.solution.GerarPedidoDados;
import command.solution.Orcamento;
import command.solution.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100.0"), 6);
        String cliente = "Cliente 1";
        LocalDateTime data = LocalDateTime.now();

        Pedido pedido = new Pedido(cliente, data, orcamento);
        System.out.println("Salvar pedido no banco de dados");
        System.out.println("Enviar email com dados do novo pedido para o cliente");

    }
}
