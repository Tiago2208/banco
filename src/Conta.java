public class Conta {
    double saldo;
    String tipo;
    String numero;
    String agencia;
    double limite;
    boolean ativa;
    Data dataDeAbertura;
    Cliente cliente;

    boolean sacar(double quantidade) {
        double novoSaldo = this.saldo - quantidade;
        if (novoSaldo >= 0) {
            this.saldo = novoSaldo;
            return true;
        } else {
            System.out.println("Saldo insuficiente!");
            return false;
        }

    }

    void depositar(double quantidade) {
        if (quantidade <= 0) {
            System.out.println("Valor inválido!");

        } else {
            this.saldo += quantidade;

        }
    }

    void pix(double valorPix, Conta contaDestino) {
      if(this.sacar(valorPix)) {
          contaDestino.depositar(valorPix);
          System.out.println("Seu pix de " + valorPix + " foi feito com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }

    }
    double calcularRendimento(double taxa) {
        return this.saldo * taxa;

    }

    String recuperarDadosParaImpressao(){
        return "Nome do Titular: " + this.cliente.nomeCompleto + "\n" +
                "AG: " + this.agencia + "\n" + 
                "CC: " + this.numero + "\n" + 
                "Data de abertura: " + this.dataDeAbertura.toString() + "\n" +
                "Saldo: R$ " + String.format("%.2f", this.saldo);
    }

}