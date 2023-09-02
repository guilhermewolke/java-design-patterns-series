package adapter.solution.statuses;

import adapter.solution.Orcamento;

public class Reprovado extends Status {
    public void finalizar(Orcamento orcamento) {
        orcamento.setStatus(new Finalizado());
    }

}
