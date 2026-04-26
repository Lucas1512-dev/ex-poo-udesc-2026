package exercicio1oo.classes;

import java.util.Scanner;

public class TestaContaBancaria {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        ContaBancaria nova = new ContaBancaria();

        System.out.print("Número da Conta:  ");
        nova.numeroConta = leitor.nextLine();

        System.out.print("Titular:  ");
        nova.titular = leitor.nextLine();

        System.out.print("Saldo:  ");
        nova.saldo = leitor.nextInt();

        System.out.println("Número da Conta...: " + nova.numeroConta);
        System.out.println("Titular...........: " + nova.titular);
        System.out.println("Saldo.............: " + nova.saldo);

    }
}
