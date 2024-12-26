package codes;

import java.util.Scanner;

public class SistemaDeAulas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo(a) ao sistema da Evolução - Sistema de ensino.");
        System.out.println("Qual função você deseja acessar ?");
        System.out.print("1 - Calculo de média" +
                "2 - Lista de alunos" +
                "3 - Pagamentos" +
                "4 - Sair");
        int opcao = sc.nextInt();

        while (opcao > 4 || opcao < 1) {
            System.out.println("opção inválida");
        }

        while (opcao != 4) {}
    }
}