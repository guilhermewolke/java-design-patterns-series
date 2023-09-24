package proxy.raw;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

    public void executarAcao (Pedido pedido) {

        System.out.println("Enviando email com dados do pedido");

        System.out.println(pedido.getOrcamento().getValor());
        System.out.println(pedido.getOrcamento().getValor());
    }

}
