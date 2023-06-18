package chainOfResponsability.solutionWithInterface;

public abstract class Desconto implements DescontoInterface {
    protected DescontoInterface proximo;

    public void setProximo(DescontoInterface proximo) {
        this.proximo = proximo;
    }
}
