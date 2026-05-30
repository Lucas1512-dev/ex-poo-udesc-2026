package exercicio3oo.testes;

import exercicio3oo.classes.Circulo;

import java.util.Scanner;

public class TestaCirculo {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        Circulo novo = new Circulo();

        System.out.print("Raio:  ");
        novo.setRaio(leitor.nextDouble());
        System.out.printf("Raio: %.2f%n", novo.getRaio());










    }
}
