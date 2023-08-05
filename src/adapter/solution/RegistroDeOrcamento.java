package adapter.solution;

import adapter.solution.http.HttpAdapter;

import java.util.Map;

public class RegistroDeOrcamento {
    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }
    public void registrar(Orcamento orcamento) {
        if (!orcamento.isFinalizado()) {
            throw new RuntimeException("Orçamento não finalizado!");
        }
        String url = "http://url.ficticia";
        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidadeItens", orcamento.getQuantidadeItens()
        );
        http.post(url, dados);
    }
}
