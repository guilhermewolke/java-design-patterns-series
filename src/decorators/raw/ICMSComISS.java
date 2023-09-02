package decorators.raw;

import java.math.BigDecimal;

public class ICMSComISS implements Imposto {
    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        BigDecimal icms = new ICMS().calcular(orcamento);
        BigDecimal iss = new ISS().calcular(orcamento);

        return icms.add(iss);
    }
}
