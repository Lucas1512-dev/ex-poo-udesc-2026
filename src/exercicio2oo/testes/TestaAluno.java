package exercicio2oo.testes;

import exercicio2oo.classes.Aluno;

import java.util.Scanner;

public class TestaAluno {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        Aluno fulano = new Aluno();

        System.out.print("Nome:  ");
        fulano.nome = leitor.nextLine();

        System.out.print("Matrícula:  ");
        fulano.matricula = leitor.nextLine();

        System.out.print("Idade:  ");
        fulano.idade = leitor.nextInt();

        System.out.print("Nota 1:  ");
        fulano.nota1 = leitor.nextInt();

        System.out.print("Nota 2:  ");
        fulano.nota2 = leitor.nextInt();

        System.out.print("Nota 3:  ");
        fulano.nota3 = leitor.nextInt();

        System.out.print("Nota 4:  ");
        fulano.nota4 = leitor.nextInt();
        System.out.println("\nDados do Aluno");
        System.out.println("----------------");
        System.out.println("Matrícula: " + fulano.matricula);
        System.out.println("Idade....: " + fulano.idade + " Anos");
        System.out.println("Nota 1...: " + fulano.nota1);
        System.out.println("Nota 2...: " + fulano.nota2);
        System.out.println("Nota 3...: " + fulano.nota3);
        System.out.println("Nota 4...: " + fulano.nota4);

        double media = (fulano.nota1 + fulano.nota2 + fulano.nota3 + fulano.nota4) / 4.0;
        System.out.println("Média ...: " + media);



    }

}
