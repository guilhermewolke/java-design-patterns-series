package proxy.raw;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        String cliente = "Cliente 1";
        BigDecimal valor = new BigDecimal("10");
        int quantidade = Integer.parseInt("1");

        PedidosFacade facade = new PedidosFacade(cliente, valor, quantidade);
        facade.executar();
    }
}
