class Residuo {
    private String tipoResiduo;
    private double quantidade;
    private PontoDeColeta pontoDeColeta;

    public Residuo(String tipoResiduo, double quantidade, PontoDeColeta pontoDeColeta) {
        this.tipoResiduo = tipoResiduo;
        this.quantidade = quantidade;
        this.pontoDeColeta = pontoDeColeta;
    }

    public String getTipoResiduo() {
        return tipoResiduo;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public PontoDeColeta getPontoDeColeta() {
        return pontoDeColeta;
    }

    public String calcularPesoTotal(double pesoUnitario) {
        return "Peso total do resíduo: " + (quantidade * pesoUnitario) + " kg.";
    }

}
