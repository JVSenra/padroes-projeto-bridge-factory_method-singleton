package bridge;

import factory_method.Servico;
import singleton.InformacoesEmpresa;

public abstract class OrdemServico {
    protected Servico servico;
    protected float salarioBase;

    public OrdemServico() {
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public abstract float calcularCusto();
}
