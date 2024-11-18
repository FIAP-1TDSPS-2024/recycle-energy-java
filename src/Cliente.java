class Cliente {
    private String nome;
    private String tipo;
    private String endereco;
    private String telefone;
    private String email;
    private String dataRegistro;
    private double consumo;

    public Cliente(String nome, String tipo, String endereco, String telefone, String email,
            String dataRegistro) {
        this.nome = nome;
        this.tipo = tipo;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.dataRegistro = dataRegistro;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getDataRegistro() {
        return dataRegistro;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    /*
     * Método que verifica o tipo de cliente
     */
    public String verificarTipo() {
        return "Tipo de cliente: " + tipo;
    }
}