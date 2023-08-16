package br.senai.sp.jandira;

import java.util.Scanner;
import java.util.Random;

public class RoletaRussa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroEscolhido;
        int numeroSorteado;

        System.out.println("Bem-vindo à Roleta!");
        System.out.print("Escolha um número (0-20): ");
        numeroEscolhido = scanner.nextInt();

        if (numeroEscolhido < 0 || numeroEscolhido > 20) {
            System.out.println("Número inválido. O programa será encerrado.");
            return;
        }

        System.out.println("A roleta está gerando o número");
        numeroSorteado = random.nextInt(21);

        System.out.println("O número sorteado foi: " + numeroSorteado);

        if (numeroEscolhido == numeroSorteado) {
            System.out.println("Parabéns! Você acertou o número. O programa será encerrado.");
        } else {
            System.out.println("Tente novamente na próxima vez.");
        }
    }
}
