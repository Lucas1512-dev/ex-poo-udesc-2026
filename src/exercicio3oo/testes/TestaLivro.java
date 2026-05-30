package exercicio3oo.testes;

import exercicio3oo.classes.Livro;

import java.util.Scanner;

public class TestaLivro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Livro novo = new Livro();

        System.out.print("Título :  ");
        novo.setTitulo(leitor.nextLine());

        System.out.print("Autor :  ");
        novo.setAutor(leitor.nextLine());

        System.out.print("Gênero :  ");
        novo.setGenero(leitor.nextLine());

        System.out.print("Emprestado (Sim: digitar true / Não: digitar false  :");
        novo.setEmprestado(leitor.nextBoolean());

        System.out.println("Título.....: " + novo.getTitulo());
        System.out.println("Autor......: " + novo.getAutor());
        System.out.println("Gênero........: " + novo.getGenero());
        System.out.println("Emprestado.: " + novo.getEmprestado());
    }
}