package singleton;

public class InformacoesEmpresa {
    private InformacoesEmpresa() {};
    private static InformacoesEmpresa instance = new InformacoesEmpresa();
    public static InformacoesEmpresa getInstance() {
        return instance;
    }
    private float percentualAumentoPresencial;

    public float getPercentualAumentoPresencial() {
        return percentualAumentoPresencial;
    }
    public void setPercentualAumentoPresencial(float percentualAumentoPresencial) {
        this.percentualAumentoPresencial = percentualAumentoPresencial;
    }
}
