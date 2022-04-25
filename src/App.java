public class App {
    public static void main(String[] args) throws Exception {
        Conta conta = new Conta();
        conta.agencia = "4034";
        conta.ativa = true;
        conta.limite = 10000;
        conta.numero = "41110";
        conta.tipo = "conta-corrente";
        conta.depositar(100);

        Conta novaConta = new Conta();
        novaConta.agencia = "3024";
        novaConta.ativa = true;
        novaConta.limite = 12000;
        novaConta.numero = "31110";
        novaConta.tipo = "conta-corrente";
        novaConta.depositar(100);
        conta.pix(60, novaConta);

        System.out.println("Saldo na conta é: " + conta.saldo);
        System.out.println("Saldo na conta é: " + novaConta.saldo);

        Cliente cliente = new Cliente();
        cliente.nomeCompleto = "Tiago Andrade";
        cliente.cpf = "03947164";
        cliente.dataDeNascimento = "22/08/2003";
        Endereco endereco = new Endereco();
        endereco.cep = "79071230";
        endereco.rua = "Rua da Paz";
        endereco.bairro = "Rita Vieira";
        endereco.complemento = "número 21";

        cliente.endereco = endereco;

        conta.cliente = cliente;
        novaConta.cliente = cliente;

        System.out.println("O nome do cliente é: " + conta.cliente.nomeCompleto);
        System.out.println("O seu saldo é: R$" + String.format("%.2f", conta.saldo));
        System.out.println("O endereço é: " + conta.cliente.endereco.rua + " " + conta.cliente.endereco.complemento
                + ", " + conta.cliente.endereco.bairro);
        System.out.println("Seu CEP é: " + conta.cliente.endereco.cep);
    }
}
