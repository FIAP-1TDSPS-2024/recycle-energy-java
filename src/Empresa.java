class Empresa extends Cliente {
    private String nome;
    private String tipo;
    private String endereco;
    private String telefone;
    private String email;
    private String cnpj;
    private double consumo;

    public Empresa(String nome, String endereco, String telefone, String email, String cnpj) {
        super(nome, cnpj, endereco, telefone, email);
        this.nome = nome;
        this.tipo = "Empresa";
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.cnpj = cnpj;
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

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    /*
     * Método que verifica o tipo de cliente
     */
    @Override
    public String verificarTipo() {
        return "Tipo de cliente: Empresa";
    }

    public String getCnpj() {
        return cnpj;
    }
}
