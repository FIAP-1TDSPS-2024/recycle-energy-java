
class Pessoa extends Cliente {
    private String nome;
    private String tipo = "Pessoa Física";
    private String endereco;
    private String telefone;
    private String email;
    private double consumo;
    private String cpf;

    public Pessoa(String nome, String endereco, String telefone, String email, String cpf) {
        super(nome, cpf, endereco, telefone, email);
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
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

    public String getCpf() {
        return cpf;
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
        return "Tipo de cliente: Pessoa Física";
    }
}
