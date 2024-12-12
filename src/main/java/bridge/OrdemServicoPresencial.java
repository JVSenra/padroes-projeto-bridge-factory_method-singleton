package bridge;

import singleton.InformacoesEmpresa;

public class OrdemServicoPresencial extends OrdemServico{
    @Override
    public float calcularCusto() {
        return this.servico.obterCusto() * (1 + InformacoesEmpresa.getInstance().getPercentualAumentoPresencial());
    }
}
