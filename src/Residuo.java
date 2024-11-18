class Residuo {
    private String tipo;
    private double quantidade;
    private PontoDeColeta pontoDeColeta;

    public Residuo(String tipo, double quantidade, PontoDeColeta pontoDeColeta) {
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.pontoDeColeta = pontoDeColeta;
    }

    public String getTipo() {
        return tipo;
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
