package exercicio2oo.testes;

import exercicio2oo.classes.Livro;

import java.util.Scanner;

public class TestaLivro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Livro novo = new Livro();

        System.out.print("Título :  ");
        novo.titulo = leitor.nextLine();

        System.out.print("Autor :  ");
        novo.autor = leitor.nextLine();

        System.out.print("Gênero :  ");
        novo.genero = leitor.nextLine();

        System.out.print("Emprestado (Sim: digitar true / Não: digitar false  :");
        novo.emprestado = leitor.nextBoolean();

        System.out.println("Título.....: " + novo.titulo);
        System.out.println("Autor......: " + novo.autor);
        System.out.println("Gênero........: " + novo.genero);
        System.out.println("Emprestado.: " + novo.emprestado);
    }
}