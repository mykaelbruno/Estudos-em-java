package codes;

import java.util.Scanner;

//Recebe nomes e idades, joga em um array e depois exibe no final do código
//Por Mykael Bruno.

public class ExibeNome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int QUANT_PESSOAS = 3; //Quantidades de pessoas a serem 'cadastradas'
        String[] nomes = new String[QUANT_PESSOAS];
        int[] idades = new int[QUANT_PESSOAS];

        recebeNomes(QUANT_PESSOAS, nomes, sc, idades);

        exibePessoas(nomes, idades);
    }

    private static void recebeNomes(int QUANT_PESSOAS, String[] nomes, Scanner sc, int[] idades) {
        for (int i = 0; i < QUANT_PESSOAS; i++) {
            System.out.print("Digite o seu nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Digite sua idade: ");
            idades[i] = sc.nextInt();
            sc.nextLine();
        }
        sc.close();
    }

    private static void exibePessoas(String[] nomes, int[] idades) {
        System.out.println("Pessoas informadas");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println((i+1) + "º " + nomes[i]+ ", " + idades[i]);
        }
    }
}