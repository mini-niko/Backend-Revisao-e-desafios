package com.example.revisaoedesafios.bancario;

import java.util.Scanner;

public class Banco {
    private static Scanner scan = new Scanner(System.in);
    private static Conta conta;

    public static void main(String[] args) {
        run();
    }
    public static void run() {
        System.out.printf("Olá! bem vindo ao Banco Java!");
        menuBanco();
    }

    private static void menuBanco() {
        System.out.printf("Por favor, selecione uma das opções abaixo:\n\n" +
                "1) Criar conta\n" +
                "2) Extrato da conta\n" +
                "3) Sacar da conta\n" +
                "4) Depósito da conta\n" +
                "5) Sair\n\n" +
                "Opção selecionada: ");

        String opcaoEscolhida = scan.nextLine();
        System.out.println();

        if(opcaoEscolhida.startsWith("1")) {
            criarContaMenu();
        }
        else if(opcaoEscolhida.startsWith("2")) {
            extratoContaMenu();
        }
        else if(opcaoEscolhida.startsWith("3")) {
            depositarContaMenu();
        }
        else if(opcaoEscolhida.startsWith("4")) {
            sacarContaMenu();
        }
        else {
            menuBanco();
        }

        // Como não foi setado nada, caso o usuario coloque a opção 5, ele não executa nada e finaliza o código =)
    }

    private static void criarContaMenu() {
        System.out.printf("Que bom que deseja criar uma conta no nosso banco! Mas precisamos de algumas informações: \n\n" +
                "Nome do titular: ");

        String titular = scan.nextLine();
        System.out.println();

        conta = new Conta(1, titular, 0.0);

        System.out.printf("Sua conta foi criada! Agora aproveite nossos benefícios :)\n\n" +
                "Pressione qualquer coisa para continuar...");

        scan.nextLine();
        System.out.println();

        run();
    }

    private static void extratoContaMenu() {

        if(conta == null) {
            System.out.println("Você deve criar uma conta primeiro!\n");
        }
        else {
            System.out.println("Olá " + conta.getTitular() + ", veja agora o extrato da sua conta: \n\n" +
                    "Id: " + conta.getId() + "\n" +
                    "Titular: " + conta.getTitular() + "\n" +
                    "Saldo: R$" + conta.getSaldo() + "\n");
        }
        System.out.println("Pressione qualquer tecla para continuar...");

        scan.nextLine();

        menuBanco();
    }

    private static void depositarContaMenu() {
        if(conta == null) {
            System.out.println("Você deve criar uma conta primeiro!\n");
        }
        else {
            System.out.printf("Deseja fazer um depósito para o " + conta.getTitular() + "? Vamos lá!\n\n" +
                    "Insira a quantia que deseja depositar: R$");

            String valorDepositoTexto = scan.nextLine();
            double valorDeposito = Double.valueOf(valorDepositoTexto    .replace(",", "."));

            conta.depositar(valorDeposito);

            System.out.println("O depósito foi feito com sucesso!\n" +
                    "________________________________________________\n\n" +
                    "   Comprovante do depósito\n\n" +
                    "   Nome do beneficiário: " + conta.getTitular() + "\n\n" +
                    "   Valor depositado: R$ " + valorDeposito + "\n\n" +
                    "________________________________________________\n");
        }
        System.out.println("Pressione qualquer tecla para continuar...");

        scan.nextLine();

        menuBanco();
    }

    private static void sacarContaMenu() {
        if(conta == null) {
            System.out.println("Você deve criar uma conta primeiro!\n");
        }
        else {
            System.out.printf("Deseja fazer um saque da conta do " + conta.getTitular() + "? Vamos lá!\n\n" +
                    "Insira a quantia que deseja sacar: R$");

            String valorSaqueTexto = scan.nextLine();
            double valorSaque = Double.valueOf(valorSaqueTexto.replace(",", "."));

            conta.sacar(valorSaque);

            System.out.println("O depósito foi feito com sucesso!\n" +
                    "________________________________________________\n\n" +
                    "   Comprovante do saque\n\n" +
                    "   Nome do titular: " + conta.getTitular() + "\n\n" +
                    "   Valor sacado: R$ " + valorSaque + "\n\n" +
                    "________________________________________________\n");

        }
        System.out.println("Pressione qualquer tecla para continuar...");

        scan.nextLine();

        menuBanco();
    }
}
