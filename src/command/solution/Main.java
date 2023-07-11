package command.solution;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        String cliente = args[0];
        BigDecimal valor = new BigDecimal(args[1]);
        int quantidade = Integer.parseInt(args[2]);

        GerarPedidoDados dados = new GerarPedidoDados(cliente, valor, quantidade);
        GerarPedidoHandler gerador = new GerarPedidoHandler(/*Dependências injetadas aqui*/);
        gerador.executar(dados);
    }
}
