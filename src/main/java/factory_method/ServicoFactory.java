package factory_method;

public class ServicoFactory {
    public static Servico obterServico(String servico) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("factory_method.Servico" + servico);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Serviço inexistente");
        }
        if (!(objeto instanceof Servico)) {
            throw new IllegalArgumentException("Serviço inválido");
        }
        return (Servico) objeto;
    }
}
