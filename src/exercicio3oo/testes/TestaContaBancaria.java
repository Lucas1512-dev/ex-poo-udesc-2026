package exercicio3oo.testes;

import exercicio3oo.classes.Aluno;
import exercicio3oo.classes.ContaBancaria;

import java.util.Scanner;

public class TestaContaBancaria {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        ContaBancaria nova = new ContaBancaria();

        System.out.print("Número da Conta:  ");
        nova.setNumeroConta(leitor.nextLine());

        System.out.print("Titular:  ");
        nova.setTitular(leitor.nextLine());

        System.out.print("Saldo:  ");
        nova.setSaldo(leitor.nextDouble());

        System.out.println("Número da Conta: " + nova.getNumeroConta());
        System.out.println("Titular........: " + nova.getTitular());
        System.out.println("Saldo..........: " + nova.getSaldo());
    }
}
