public class TestaConta {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nomeCompleto = "Tiago Andrade";

        Data hoje = new Data();
        hoje.dia = 25;
        hoje.mes = 4;
        hoje.ano = 2022;

        Conta contaCorrente = new Conta();
        contaCorrente.agencia = "0001";
        contaCorrente.numero = "12345-6";
        contaCorrente.ativa = true;
        contaCorrente.cliente = cliente;
        contaCorrente.dataDeAbertura = hoje;
        contaCorrente.limite = 300;
        contaCorrente.depositar(100);
        contaCorrente.tipo = "Conta Corrente";

        double rendimentoAbril = contaCorrente.calcularRendimento(0.1);
        System.out.println("O rendimento de abril é: " + rendimentoAbril);

        System.out.println(contaCorrente.recuperarDadosParaImpressao());

        Conta contaPoupanca = new Conta();
        contaPoupanca.agencia = "0001";
        contaPoupanca.numero = "12345-6";
        contaPoupanca.ativa = true;
        contaPoupanca.cliente = cliente;
        contaPoupanca.dataDeAbertura = hoje;
        contaPoupanca.limite = 0;
        contaPoupanca.depositar(100);
        contaPoupanca.tipo = "Conta Corrente";

        if (contaCorrente == contaPoupanca) {
            System.out.println("Contas iguais.");
        } else {
            System.out.println("Contas diferentes.");
        }

    }
}