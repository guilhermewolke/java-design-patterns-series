package observer.solution.statuses;

import observer.solution.Orcamento;

public class Reprovado extends Status {
    public void finalizar(Orcamento orcamento) {
        orcamento.setStatus(new Finalizado());
    }

}
