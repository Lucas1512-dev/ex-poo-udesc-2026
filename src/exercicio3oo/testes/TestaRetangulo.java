package exercicio3oo.testes;

import exercicio3oo.classes.Retangulo;

import java.util.Scanner;

public class TestaRetangulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Retangulo ret =  new Retangulo();

        System.out.print("Altura: ");
        ret.setAltura(leitor.nextInt());

        System.out.print("Largura: ");
        ret.setLargura(leitor.nextInt());

        System.out.print("Retângulo com as seguintes medidas de altura: " + ret.getAltura() + " e largura: " + ret.getLargura());
    }
}
