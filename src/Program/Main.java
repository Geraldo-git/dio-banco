package Program;

import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.Poupanca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char opt;
        Conta poupanca = new Poupanca();


        System.out.println("Digite o nome do Cliente: ");
        String nome = sc.nextLine();
        System.out.println("Digite o CPF do Cliente: ");
        String cpf = sc.nextLine();
        System.out.println("Digite o valor do deposito inicial: ");
        double saldo = sc.nextDouble();
        System.out.println("Digite o numero da conta");
        int numero = sc.nextInt();

        Conta conta = new ContaCorrente(numero, saldo);
        Cliente cliente = new Cliente(cpf, nome);
        cliente.addConta(conta);
        cliente.imprimeDados();
        conta.imprimeDados();

        System.out.println("Deseja abrir conta poupança (S/N)");
        opt = sc.next().charAt(0);
        if (opt == 's' || opt == 'S') {
            System.out.println("Digite o valor que deseja transferir da Conta Corrente para a poupança: ");
            poupanca = new Poupanca(conta.getNumero(), 0);
            double valor = sc.nextDouble();
            conta.transferir(valor,poupanca);
        }
        cliente.imprimeDados();
        conta.imprimeDados();
        poupanca.imprimeDados();
        sc.close();
    }
}
