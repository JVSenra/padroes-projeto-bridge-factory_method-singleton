package bridge;

public class OrdemServicoOnline extends OrdemServico{
    @Override
    public float calcularCusto() {
        return this.servico.obterCusto();
    }
}
