package com.example.revisaoedesafios.quiz;

import java.util.Scanner;

public class Quiz {
    public static void run() {
        Scanner scan = new Scanner(System.in);
        int pontos = 0;

        String resposta;

        System.out.printf("Bem vindo ao Quisiz 1.0\n\n" +
                "1) Qual a minha cor favorita?\n\n" +
                "a- Não sei, sou daltônico\n" +
                "b- Vermelho\n" +
                "c- Batata\n\n" +
                "Resposta: ");

        resposta = scan.nextLine();

        System.out.println();
        if(resposta.equals("b") || resposta.equals("b-")) {
            System.out.println("Resposta correta!\n");
            pontos++;
        }
        else {
            System.out.println("Resposta errada :(\n");
        }

        System.out.println("2) Quem sou eu?\n\n" +
                "a- Maurício\n" +
                "b- O Mestre programador B)\n" +
                "c- Chico Alicates\n\n" +
                "Resposta: ");

        resposta = scan.nextLine();

        System.out.println();
        if(resposta.equals("a") || resposta.equals("a-")) {
            System.out.println("Resposta correta!\n");
            pontos++;
        }
        else {
            System.out.println("Resposta errada :(\n");
        }

        System.out.println("3) Qual o meu objetivo?\n\n" +
                "a- Dominar o mundo\n" +
                "b- Fazer uma bomba caseira com maizena e javascript\n" +
                "c- Aprender a programar\n\n" +
                "Resposta: ");

        resposta = scan.nextLine();

        System.out.println();
        if(resposta.equals("a") || resposta.equals("a-")) {
            System.out.println("Resposta correta!\n");
            pontos++;
        }
        else {
            System.out.println("Resposta errada :(\n");
        }

        System.out.println("Você acertou " + pontos + " perguntas\n");

        run();
    }
}
