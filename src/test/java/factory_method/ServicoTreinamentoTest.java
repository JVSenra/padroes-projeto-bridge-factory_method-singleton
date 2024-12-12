package factory_method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoTreinamentoTest {
    @Test
    void deveObterCustoSuporte() {
        Servico servico = ServicoFactory.obterServico("Treinamento");
        assertEquals(70.0f, servico.obterCusto(), 0.01f);
    }
}
