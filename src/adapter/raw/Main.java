package adapter.raw;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
        orcamento.aprovar();
        orcamento.finalizar();

        //Implementação do adapter que fará a conexão HTTP com o serviço externo
        RegistroDeOrcamento registro = new RegistroDeOrcamento();
        registro.registrar(orcamento);
    }
}
