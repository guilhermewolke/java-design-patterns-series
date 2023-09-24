package proxy.raw;

import java.math.BigDecimal;
import java.util.Arrays;

public class PedidosFacade {
    private GerarPedidoDados dados;

    public PedidosFacade(String nomeCliente, BigDecimal valor, int quantidadeItens) {
        this.dados = new GerarPedidoDados(nomeCliente, valor, quantidadeItens);
    }

    public void executar() {
        GerarPedidoHandler gerador = new GerarPedidoHandler(Arrays.asList(
                new SalvarPedidoNoBancoDeDados(),
                new EnviarEmailPedido()
            /*
                new EmitirNotaFiscal(),
                new SepararEstoque(),
                new NotificarComprasParaEncomendarProdutosDoFornecedor(),
                etc...
            */
        ));

        gerador.executar(dados);

    }
}
