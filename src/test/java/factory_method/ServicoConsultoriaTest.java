package factory_method;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoConsultoriaTest {
    @Test
    void deveObterCustoConsultoria() {
        Servico servico = ServicoFactory.obterServico("Consultoria");
        assertEquals(100.0f, servico.obterCusto(), 0.01f);
    }
}
