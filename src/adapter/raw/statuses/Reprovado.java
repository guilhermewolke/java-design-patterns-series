package adapter.raw.statuses;

import adapter.raw.Orcamento;

public class Reprovado extends Status {
    public void finalizar(Orcamento orcamento) {
        orcamento.setStatus(new Finalizado());
    }

}
