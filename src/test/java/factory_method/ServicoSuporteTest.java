package factory_method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoSuporteTest {
    @Test
    void deveObterCustoSuporte() {
        Servico servico = ServicoFactory.obterServico("Suporte");
        assertEquals(50.0f, servico.obterCusto(), 0.01f);
    }
}
