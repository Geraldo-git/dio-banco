package entities;

public class Poupanca extends Conta {

    public Poupanca(int numero, double saldo) {
        super(numero, saldo);
    }

    public Poupanca() {

    }

    @Override
    public void imprimeDados(){
        System.out.println("Dados de caderneta de poupança: ");
        System.out.println(String.format("Conta: %d",getNumero()));
        System.out.println(String.format("Saldo: %.2f",getSaldo()));
    }

}
