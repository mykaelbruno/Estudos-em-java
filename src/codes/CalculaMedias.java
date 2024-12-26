package codes;

import java.util.Arrays;
import java.util.Scanner;

public class CalculaMedias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas notas voce tem?");
        final int QTDE_DE_NOTAS = sc.nextInt();

        double[] notas = new double[QTDE_DE_NOTAS];

        if (QTDE_DE_NOTAS <= 0) {
            System.exit(1);
        }

        double somaDasNotas = 0;
        double primeiraNota = 0, ultimaNota = 0;

        recebeNotas(notas, sc);
        calculaMediaAritmetrica(notas);
        calculaMediaPrimeiraEUltimaNotas(notas);
    }

    private static void calculaMediaPrimeiraEUltimaNotas(double[] notas) {
        System.out.println("A sua média considerando a primeira e ultima notas é: " +
                (notas[0] + notas[notas.length - 1]) / 2);
    }

    private static void calculaMediaAritmetrica(double[] notas) {
        double somaDasNotas = 0;
        for (int i = 0; i < notas.length; i++) {
            somaDasNotas += notas[i];
        }
        System.out.println("A sua média total é: " + somaDasNotas / notas.length);
    }

    private static void recebeNotas(double[] notas, Scanner sc) {
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a proxima nota: ");
            notas[i] = sc.nextDouble();
        }
        System.out.println("Notas: " + Arrays.toString(notas));
    }
}
