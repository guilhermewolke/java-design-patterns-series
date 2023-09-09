package facade.solution;

import java.time.LocalDateTime;
import java.util.List;

public class GerarPedidoHandler {

    private List<AcaoAposGerarPedido> acoes;

    public GerarPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    //construtor com injeção de dependências: repositories, services etc...

    public void executar(GerarPedidoDados dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(a -> a.executarAcao(pedido));
    }
}
