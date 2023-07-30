package observer.raw;

import java.time.LocalDateTime;

public class GerarPedidoHandler {

    //construtor com injeção de dependências: repositories, services etc...

    public void executar(GerarPedidoDados dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        SalvarPedidoNoBancoDeDados salvar = new SalvarPedidoNoBancoDeDados();
        EnviarEmailPedido enviar = new EnviarEmailPedido();

        salvar.executar(pedido);
        enviar.executar(pedido);
        //System.out.println("Salvar pedido no banco de dados"); // Que pode ser substituído pela abstração de inserção no banco de dados, de algum objeto repository
        //System.out.println("Enviar email com dados do novo pedido para o cliente"); // Que pode ser substituído pela abstração de algum service de disparo de emails
    }
}
