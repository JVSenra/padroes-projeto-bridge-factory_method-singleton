package singleton;

public class InformacoesEmpresa {
    private InformacoesEmpresa() {};
    private static InformacoesEmpresa instance = new InformacoesEmpresa();
    public static InformacoesEmpresa getInstance() {
        return instance;
    }
    private String nomeEmpresa;
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
}
