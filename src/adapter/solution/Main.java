package adapter.solution;

import adapter.solution.http.HttpAdapter;
import adapter.solution.http.JavaHttpClient;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
        orcamento.aprovar();
        orcamento.finalizar();

        //Implementação do adapter que fará a conexão HTTP com o serviço externo
        HttpAdapter client = new JavaHttpClient();
        RegistroDeOrcamento registro = new RegistroDeOrcamento(client);
        registro.registrar(orcamento);
    }
}
