import java.time.LocalDate;
import java.time.Month;

public class TestaConta {
    public static void main(String[] args) {
        LocalDate dataDeNascimento = LocalDate.of(2003, Month.AUGUST, 22);
        Cliente cliente = new Cliente("Tiago Andrade", "05424456604", dataDeNascimento, new Endereco());

        Conta contaCorrente = new Conta(cliente, "0001", "12345-6", "Conta Corrente");
        contaCorrente.depositar(100);
        System.out.println(Conta.getTotalDeContas());

        double rendimentoAbril = contaCorrente.calcularRendimento(0.1);
        System.out.println("O rendimento de abril é: " + rendimentoAbril);

        System.out.println(contaCorrente);

        Conta contaPoupanca = new Conta(cliente, "0001", "12345-6", "Conta Corrente");
        contaPoupanca.depositar(100);
        System.out.println(Conta.getTotalDeContas());
    }
}