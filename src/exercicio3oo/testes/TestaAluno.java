package exercicio3oo.testes;

import exercicio3oo.classes.Aluno;

import java.util.Scanner;

public class TestaAluno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Aluno fulano = new Aluno();

        System.out.print("Nome:  ");
        fulano.setNome(leitor.nextLine());

        System.out.print("Matrícula:  ");
        fulano.setMatricula(leitor.nextLine());

        System.out.print("Idade:  ");
        fulano.setIdade(leitor.nextInt());

        System.out.print("Nota 1:  ");
        fulano.setNota1(leitor.nextInt());

        System.out.print("Nota 2:  ");
        fulano.setNota2(leitor.nextInt());

        System.out.print("Nota 3:  ");
        fulano.setNota3(leitor.nextInt());

        System.out.print("Nota 4:  ");
        fulano.setNota4(leitor.nextInt());

        System.out.printf("%nDados do Aluno%n");
        System.out.printf("----------------%n");
        System.out.printf("Nome......: %s%n", fulano.getNome());
        System.out.printf("Matrícula.: %s%n", fulano.getMatricula());
        System.out.printf("Idade.....: %d Anos%n", fulano.getIdade());
        System.out.printf("Nota 1....: %d%n", fulano.getNota1());
        System.out.printf("Nota 2....: %d%n", fulano.getNota2());
        System.out.printf("Nota 3....: %d%n", fulano.getNota3());
        System.out.printf("Nota 4....: %d%n", fulano.getNota4());

        double media = (fulano.getNota1() + fulano.getNota2() + fulano.getNota3() + fulano.getNota4()) / 4.0;

        System.out.printf("Média ....: %.2f%n", media);

        //leitor.close();
    }

}
