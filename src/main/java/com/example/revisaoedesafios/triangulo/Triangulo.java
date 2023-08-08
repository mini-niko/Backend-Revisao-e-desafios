package com.example.revisaoedesafios.triangulo;

import java.util.Scanner;

public class Triangulo {
    public static void run() {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Bem vindo ao Triangulus 1.0\n\n" +
                "Para iniciar, insira o valor do primeiro lado: ");

        Double valorUm = scan.nextDouble();

        System.out.println();
        System.out.printf("Legal! Agora insira o valor do segundo lado: ");

        Double valorDois = scan.nextDouble();

        System.out.println();
        System.out.printf("Quase lá. Insira o valor do terceiro lado: ");

        Double valorTres = scan.nextDouble();

        System.out.println();
        if(valorUm.equals(valorDois) && valorDois.equals(valorTres)) {
            System.out.println("O seu triângulo é equilátero.");
        }
        else if (valorUm.equals(valorDois) || valorUm.equals(valorTres) || valorDois.equals(valorTres)) {
            System.out.println("O seu triângulo é isóceles.");
        }
        else {
            System.out.println("O seu triângulo é escaleno.");
        }

        System.out.println();
        run();
    }

}
