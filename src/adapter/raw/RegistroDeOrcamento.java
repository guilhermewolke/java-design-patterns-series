package adapter.raw;

public class RegistroDeOrcamento {

    public void registrar(Orcamento orcamento) {
        if (!orcamento.isFinalizado()) {
            throw new RuntimeException("Orçamento não finalizado!");
        }
        System.out.println("Instanciando a classe da biblioteca HttpClient para fazer a conexão HTTP com o serviço externo");
        System.out.println("Definindo configurações para a conexão");
        System.out.println("Preparando o payload para o envio do conteúdo");
        System.out.println("Enviando o payload para o serviço externo");
        System.out.println("Tratando o retorno e possíveis erros de conexão");
    }
}
