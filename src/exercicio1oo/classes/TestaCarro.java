package exercicio1oo.classes;

import java.util.Scanner;

public class TestaCarro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Carro novo = new Carro();

        System.out.print("Modelo :  ");
        novo.modelo = leitor.nextLine();

        System.out.print("Marca :  ");
        novo.marca = leitor.nextLine();

        System.out.print("Ano :  ");
        novo.ano = leitor.nextInt();

        System.out.print("Velocidade: ");
        novo.velocidade = leitor.nextDouble();

        System.out.println("Modelo.....: " + novo.modelo);
        System.out.println("Marca......: " + novo.marca);
        System.out.println("Ano........: " + novo.ano);
        System.out.println("Velocidade.: " + novo.velocidade + " Km/h");

    }
}