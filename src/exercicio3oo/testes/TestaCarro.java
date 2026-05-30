package exercicio3oo.testes;

import exercicio3oo.classes.Carro;

import java.util.Scanner;

public class TestaCarro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Carro novo = new Carro();

        System.out.print("Modelo :  ");
        novo.setModelo(leitor.nextLine());

        System.out.print("Marca :  ");
        novo.setMarca(leitor.nextLine());

        System.out.print("Ano :  ");
        novo.setAno(leitor.nextInt());

        System.out.print("Velocidade: ");
        novo.setVelocidade(leitor.nextDouble());

        System.out.printf("___________________%n");
        System.out.printf("       Carros      %n");
        System.out.printf("___________________%n");
        System.out.printf("Modelo.....: %s%n", novo.getModelo());
        System.out.printf("Marca......: %s%n", novo.getMarca());
        System.out.printf("Ano........: %d%n", novo.getAno());
        System.out.printf("Velocidade.: %2f Km/h%n", novo.getVelocidade());

    }
}