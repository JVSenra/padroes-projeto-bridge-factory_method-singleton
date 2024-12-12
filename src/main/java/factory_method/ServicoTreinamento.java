package factory_method;

public class ServicoTreinamento implements Servico{
    @Override
    public float obterCusto() {
        return 70f;
    }
}
