package com.example.revisaoedesafios.calculadora;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Calculadora {
    public static void run() {
        System.out.println("Olá, seja bem vindo a Calculadora!\n");

        calculadoraInterface();
    }

    public static void calculadoraInterface() {
        Scanner scan = new Scanner(System.in);

        String operacao = escolhaOperacao(scan);

        System.out.println();

        if (operacao.equals("+") && operacao.equals("-") && operacao.equals("/") && operacao.equals("*")) {
            System.out.println("Operação incorreta.\n");
            calculadoraInterface();
        }
        else {
            Double valorUm = pegaValores(scan, 1);
            Double valorDois = pegaValores(scan, 1);
            Double resultado;

            switch (operacao) {
                case "+":
                    resultado = valorUm + valorDois;
                    System.out.println(resultado);
                    break;
                case "-":
                    resultado = valorUm - valorDois;
                    System.out.println(resultado);
                    break;
                case "*":
                    resultado = valorUm * valorDois;
                    System.out.println(resultado);
                    break;
                case "/":
                    if (valorDois == 0.0) {
                        System.out.println("Não é possível dividir por 0.");
                        break;
                    }
                    else resultado = valorUm * valorDois;
                    System.out.println(resultado);
                    run();
                    break;
            }
        }
    }

    private static String escolhaOperacao(Scanner scan) {
        System.out
                .printf("Para começar, selecione uma das operações abaixo (escreva o símbolo da operação):\n\n" +
                        "[+] Adição\n" +
                        "[-] Subtração\n" +
                        "[/] Divisão\n" +
                        "[*] Multiplicação\n\n" +
                        "Operação escolhida: ");

        String operacao = scan.nextLine();


        return operacao;
    }

    private static Double pegaValores(Scanner scan, int qualValor) {
        Double valor;
        if (qualValor == 1) {
            System.out.printf("Insira o primeiro valor: ");
            valor = scan.nextDouble();
        }
        else {
            System.out.printf("Insira o primeiro valor: ");
            valor = scan.nextDouble();
        }
        return valor;
    }
}
