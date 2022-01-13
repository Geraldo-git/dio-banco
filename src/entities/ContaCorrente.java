package entities;

public class ContaCorrente extends Conta {


    public ContaCorrente(int numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public void imprimeDados(){
        System.out.println("Dados Consolidados cliente: ");
        System.out.println(String.format("Conta: %d",getNumero()));
        System.out.println(String.format("Saldo: %.2f",getSaldo()));
    }
}
