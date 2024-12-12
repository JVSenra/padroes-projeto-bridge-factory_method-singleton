package bridge;
import factory_method.ServicoFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class OrdemServicoOnlineTest {
    @Test
    void deveRetornarCustoServicoSuporte() {
        OrdemServicoOnline ordemServicoOnline = new OrdemServicoOnline();
        ordemServicoOnline.setServico(ServicoFactory.obterServico("Suporte"));
        assertEquals(50.0f, ordemServicoOnline.calcularCusto(), 0.01f);
    }

    @Test
    void deveRetornarCustoServicoTreinamento() {
        OrdemServicoOnline ordemServicoOnline = new OrdemServicoOnline();
        ordemServicoOnline.setServico(ServicoFactory.obterServico("Treinamento"));
        assertEquals(70.0f, ordemServicoOnline.calcularCusto(), 0.01f);
    }

    @Test
    void deveRetornarCustoServicoConsultoria() {
        OrdemServicoOnline ordemServicoOnline = new OrdemServicoOnline();
        ordemServicoOnline.setServico(ServicoFactory.obterServico("Consultoria"));
        assertEquals(100.0f, ordemServicoOnline.calcularCusto(), 0.01f);
    }
}
