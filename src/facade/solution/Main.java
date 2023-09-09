package facade.solution;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        String cliente = args[0];
        BigDecimal valor = new BigDecimal(args[1]);
        int quantidade = Integer.parseInt(args[2]);

        PedidosFacade facade = new PedidosFacade(cliente, valor, quantidade);
        facade.executar();
    }
}
