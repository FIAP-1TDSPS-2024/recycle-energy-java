
class UnidadeDeConversao {
    private String localizacao;
    private double capacidade;
    private String tipoConversao;
    private String status;

    public UnidadeDeConversao(String localizacao, double capacidade, String tipoConversao,
            String status) {
        this.localizacao = localizacao;
        this.capacidade = capacidade;
        this.tipoConversao = tipoConversao;
        this.status = status;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public String getTipoConversao() {
        return tipoConversao;
    }

    public String getStatus() {
        return status;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public void setTipoConversao(String tipoConversao) {
        this.tipoConversao = tipoConversao;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /*
     * Método que verifica se a capacidade da unidade é suficiente para processar o
     * resíduo, utilizando sobrecarga.
     */
    public String verificarCapacidade(double quantidade) {
        if (quantidade <= capacidade) {
            return "Capacidade suficiente para processar o resíduo.";
        } else {
            return "Capacidade insuficiente para processar o resíduo.";
        }
    }

    /*
     * Método que verifica a capacidade da unidade.
     */
    public String verificarCapacidade() {
        return "Capacidade da unidade: " + capacidade + " kWh.";
    }

    /*
     * Método que converte a quantidade de resíduo em energia.
     */
    public String converterResiduo(Residuo residuo, UnidadeDeConversao unidade) {
        double quantidadeEnergiaGerada = residuo.getQuantidade() * unidade.getCapacidade();

        return "Quantidade de energia gerada: " + quantidadeEnergiaGerada + " kWh.";
    }
}