package composite.raw.statuses;

import decorators.raw.Orcamento;
import decorators.raw.statuses.Finalizado;

public class Reprovado extends Status {
    public void finalizar(Orcamento orcamento) {
        orcamento.setStatus(new Finalizado());
    }

}
