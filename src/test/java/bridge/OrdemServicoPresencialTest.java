package bridge;

import factory_method.ServicoFactory;
import org.junit.jupiter.api.Test;
import singleton.InformacoesEmpresa;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrdemServicoPresencialTest {
    @Test
    void deveRetornarCustoServicoSuporte() {
        InformacoesEmpresa.getInstance().setPercentualAumentoPresencial(0.1f);
        OrdemServicoPresencial ordemServicoPresencial= new OrdemServicoPresencial();
        ordemServicoPresencial.setServico(ServicoFactory.obterServico("Suporte"));
        assertEquals(55.0f, ordemServicoPresencial.calcularCusto(), 0.01f);
    }

    @Test
    void deveRetornarCustoServicoTreinamento() {
        InformacoesEmpresa.getInstance().setPercentualAumentoPresencial(0.1f);
        OrdemServicoPresencial ordemServicoPresencial = new OrdemServicoPresencial();
        ordemServicoPresencial.setServico(ServicoFactory.obterServico("Treinamento"));
        assertEquals(77.0f, ordemServicoPresencial.calcularCusto(), 0.01f);
    }

    @Test
    void deveRetornarCustoServicoConsultoria() {
        InformacoesEmpresa.getInstance().setPercentualAumentoPresencial(0.1f);
        OrdemServicoPresencial ordemServicoPresencial = new OrdemServicoPresencial();
        ordemServicoPresencial.setServico(ServicoFactory.obterServico("Consultoria"));
        assertEquals(110.0f, ordemServicoPresencial.calcularCusto(), 0.01f);
    }
}
