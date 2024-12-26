package codes;

import java.util.Scanner;

public class CadastroDeOrdem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "ana";
        for (int i = 0; i < 4; i++) {
            System.out.print("Informe seu nome: ");
            nome = sc.nextLine();
            System.out.println("Seja bem vindo(a): " + nome + "! você é o " + (i + 1) + "ª usuário a se cadastrar");
        }

        System.out.print("Qual nome deseja consultar? ");
        String consulta = sc.nextLine();

        if (consulta == nome) {
            System.out.println("Bem vinda Ana!");
        } else {
            System.out.println("Sai fora!");
        }

    }
}