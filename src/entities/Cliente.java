package entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String cpf;
    private String nome;
    private List<Conta> contas = new ArrayList<>();



    public Cliente() {
    }


    public Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addConta(Conta conta){
        contas.add(conta);
    }

    public void imprimeDados() {
        System.out.println(String.format("Nome: %s", this.nome));
        System.out.println(String.format("Cpf: %s", this.cpf));


    }
}
