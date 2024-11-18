class PontoDeColeta {
    private String tipo;
    private String endereco;
    private double capacidadeMax;
    private String status;

    public PontoDeColeta(String tipo, String endereco,
            double capacidadeMax, String status) {
        this.tipo = tipo;
        this.endereco = endereco;
        this.capacidadeMax = capacidadeMax;
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getCapacidadeMax() {
        return capacidadeMax;
    }

    public String getStatus() {
        return status;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCapacidadeMax(double capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String verificarStatusColeta() {
        return "Status do ponto de coleta: " + status;
    }
}