package exercicio2oo.testes;

import exercicio2oo.classes.Retangulo;

import java.util.Scanner;

public class TestaRetangulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Retangulo ret =  new Retangulo();

        System.out.print("Altura:  ");
        ret.altura = leitor.nextInt();

        System.out.print("Largura:  ");
        ret.largura = leitor.nextInt();

        System.out.print("Retângulo com as seguintes medidas de altura: " + ret.altura + " e largura: " + ret.largura);
    }
}
