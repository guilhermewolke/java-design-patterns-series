package observer.solution;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String cliente = args[0];
        BigDecimal valor = new BigDecimal(args[1]);
        int quantidade = Integer.parseInt(args[2]);

        GerarPedidoDados dados = new GerarPedidoDados(cliente, valor, quantidade);

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
