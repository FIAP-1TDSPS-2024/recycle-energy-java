// Calcula a cobrança de um cliente
public class Cobranca {

    private Cliente cliente;

    public Cobranca(Cliente cliente) {
        this.cliente = cliente;

    }

    /*
     * Método que calcula a cobrança de um cliente
     */
    public double calcularCobranca() {
        double valor = 0;
        if (cliente.getTipo().equals("Pessoa Física")) {
            valor = cliente.getConsumo() * 0.3;
        } else if (cliente.getTipo().equals("Empresa")) {
            valor = cliente.getConsumo() * 0.5;
        }
        return valor;
    }
}
