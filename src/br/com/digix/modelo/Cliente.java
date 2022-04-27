package br.com.digix.modelo;
import java.time.LocalDate;

public class Cliente {
    private static int id;
    private String nomeCompleto;
    private String cpf;
    private LocalDate dataDeNascimento;
    private Endereco endereco;

   public Cliente(String nomeCompleto, String cpf, LocalDate dataDeNascimento, Endereco endereco) {
        Cliente.id++;
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
        this.endereco = endereco;
    }

    public static int getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    @Override
    public String toString() {
        return "Nome do titular: " + this.getNomeCompleto() + "\n" +
                "CPF: " + this.getCpf();
    }

}
