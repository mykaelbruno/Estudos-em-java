package codes;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioArraysLacos {
    public static void main(String[] args) {
        Scanner inserir = new Scanner(System.in);
        final int MENOR_VALOR = 1;
        final int MAIOR_VALOR = 10;
        final int MULTIPLOS_UM = 5;
        final int MULTIPLOS_DOIS = 9;

        int n = defineVetor("Informe o tamanho do primeiro vetor: ", inserir, MENOR_VALOR, MAIOR_VALOR);

        int m = defineVetor("Informe o tamanho do segundo vetor: ", inserir, MENOR_VALOR, MAIOR_VALOR);

        int[] vetorUm = new int[n];
        int[] vetorDois = new int[m];
        int[] vetorIntercalado = new int[n+m];


        for (int i = 0; i < vetorUm.length; i++) {
            vetorUm[i] = (i + 1) * MULTIPLOS_UM;
        }


        for (int i = 0; i < vetorDois.length; i++) {
            vetorDois[i] = (i + 1) * MULTIPLOS_DOIS;
        }

        int tamanhoMenorVetor = vetorUm.length < vetorDois.length ? vetorUm.length : vetorDois.length; // ? = então, : = senao

        int j = 0, i;
        for (i = 0; i < tamanhoMenorVetor; i++) {
            vetorIntercalado[j++] = vetorUm[i];
            vetorIntercalado[j++] = vetorDois[i];
        }

        int[] maiorVetor = vetorUm.length > vetorDois.length ? vetorUm : vetorDois;

        for (; j < vetorIntercalado.length; j++) { //elementos que sobraram array maior
            vetorIntercalado[j] = maiorVetor[i++];
        }

        System.out.println(Arrays.toString(vetorIntercalado));

    }

    private static int defineVetor(String x, Scanner inserir, int MENOR_VALOR, int MAIOR_VALOR) {
        System.out.println(x);
        int n = inserir.nextInt();
        if (n < MENOR_VALOR || n > MAIOR_VALOR) {
            System.exit(1);
        }
        return n;
    }
}

