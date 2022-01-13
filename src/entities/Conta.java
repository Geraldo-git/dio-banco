package entities;

public class Conta {

    private int numero;
    private double saldo;

    public Conta(){}

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor){
        saldo -= valor;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void transferir(double valor, Conta conta){
        conta.depositar(valor);
        saldo -= valor;
    }

    public void imprimeDados(){
        System.out.println(String.format("Conta: %d",numero));
        System.out.println(String.format("Saldo: %.2f",saldo));
    }
}
