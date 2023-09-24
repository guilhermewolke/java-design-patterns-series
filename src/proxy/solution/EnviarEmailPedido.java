package proxy.solution;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

    public void executarAcao (Pedido pedido) {

        System.out.println("Enviando email com dados do pedido");

        OrcamentoProxy proxy = new OrcamentoProxy(pedido.getOrcamento());

        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());

    }

}
