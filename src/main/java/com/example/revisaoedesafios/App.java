package com.example.revisaoedesafios;

import com.example.revisaoedesafios.calculadora.Calculadora;
import com.example.revisaoedesafios.quiz.Quiz;
import com.example.revisaoedesafios.triangulo.Triangulo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        imprimirConsole();
    }

    public static void imprimirConsole() {
        Scanner scan = new Scanner(System.in);
        System.out
                .printf("Escolha quais das funções você deseja executar:\n\n" +
                        "1- Calculadora\n" +
                        "2- Triangulus 1.0\n" +
                        "3- Quiz\n\n" +
                        "Função escolhida: ");

        String funcao = scan.nextLine();
        System.out.println();

        switch (funcao) {
            case "1":
                Calculadora.run();
                break;
            case "2":
                Triangulo.run();
                break;
            case "3":
                Quiz.run();
                break;
            default:
                System.out.println("Nenhuma função escolhida.\n");
                imprimirConsole();
        }
    }
}
