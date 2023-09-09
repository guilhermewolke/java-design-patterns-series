package composite.raw;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Orcamento antigo = new Orcamento();
        antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        antigo.reprovar();

        Orcamento novo = new Orcamento();
        novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));

        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(novo, new ISS(
                                                            new ICMS(
                                                                    null // ou new IPI()
                                                            )
        )));
    }
}
