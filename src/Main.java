import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PontoDeColeta pontoColeta = new PontoDeColeta("Ponto de coleta", "Rua A, 123", 1000, "Ativo");

        Residuo residuo = new Residuo("Papel", 1000, pontoColeta);

        System.out.println("\n\n======================");
        System.out.println("Informações do resíduo:");
        System.out.println("Tipo de resíduo: " + residuo.getTipoResiduo());
        System.out.println("Quantidade: " + residuo.getQuantidade());
        System.out.println("Ponto de coleta: " + residuo.getPontoDeColeta().getTipo());

        UnidadeDeConversao unidade = new UnidadeDeConversao("Unidade de conversão", 1000, "Conversão de papel",
                "Ativo");

        System.out.println("\n\n======================");
        System.out.println("Informações da unidade de conversão:");
        System.out.println("Localização: " + unidade.getLocalizacao());
        System.out.println("Capacidade: " + unidade.getCapacidade());
        System.out.println("Tipo de conversão: " + unidade.getTipoConversao());
        System.out.println("Status: " + unidade.getStatus());

        System.out.println(unidade.verificarCapacidade(1000));

        System.out.println(unidade.converterResiduo(residuo, unidade));

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\n======================");
        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();
        System.out.println("Digite o tipo: \n1 - Pessoa Física\n2 - Empresa");
        int tipoClienteNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o endereço do cliente:");
        String enderecoCliente = scanner.nextLine();
        System.out.println("Digite o telefone do cliente:");
        String telefoneCliente = scanner.nextLine();
        System.out.println("Digite o email do cliente:");
        String emailCliente = scanner.nextLine();
        System.out.println("Digite a data de registro:");
        String dataRegistro = scanner.nextLine();

        Cliente cliente = null;
        if (tipoClienteNumber == 1) {
            System.out.println("Digite o CPF do cliente:");
            String cpf = scanner.nextLine();

            cliente = new Pessoa(nomeCliente, enderecoCliente,
                    telefoneCliente, emailCliente, dataRegistro, cpf);
        } else {
            System.out.println("Digite o CNPJ do cliente:");
            String cnpj = scanner.nextLine();

            cliente = new Empresa(nomeCliente, enderecoCliente,
                    telefoneCliente, emailCliente, dataRegistro, cnpj);
        }

        System.out.println("Informações do cliente:");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Tipo: " + cliente.getTipo());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Data de Registro: " + cliente.getDataRegistro());

        System.out.println(cliente.verificarTipo());

        System.out.println("Digite o consumo do cliente(kWh):");
        double consumo = scanner.nextDouble();
        cliente.setConsumo(consumo);
        System.out.println("Consumo: " + cliente.getConsumo() + " kWh");

        Cobranca cobranca = new Cobranca(cliente);
        System.out.printf("Valor da cobrança: R$%.2f", cobranca.calcularCobranca());

        scanner.close();

    }
}