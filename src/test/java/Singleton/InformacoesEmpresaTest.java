package Singleton;

import org.junit.jupiter.api.Test;
import singleton.InformacoesEmpresa;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InformacoesEmpresaTest {
    @Test
    void deveRetornarPercentualAumentoPresencial() {
        InformacoesEmpresa.getInstance().setPercentualAumentoPresencial(0.1f);
        assertEquals(0.1f,  InformacoesEmpresa.getInstance().getPercentualAumentoPresencial(), 0.01f);
    }
}
