package exercicio1oo.classes;

import java.util.Scanner;

public class TestaRetangulo {
    public static void main(String[] args) {
        Retangulo ret =  new Retangulo();

        ret.altura = 23;
        ret.largura = 14;

        System.out.println("Altura:" + ret.altura);
        System.out.println("Largura:" + ret.largura);

    }
}
