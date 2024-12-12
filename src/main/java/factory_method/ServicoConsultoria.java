package factory_method;

public class ServicoConsultoria implements Servico{
    @Override
    public float obterCusto() {
        return 100f;
    }
}
