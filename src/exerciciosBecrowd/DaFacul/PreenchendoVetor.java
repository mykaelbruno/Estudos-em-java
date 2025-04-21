package exerciciosBecrowd.DaFacul;

import java.util.Scanner;

//https://judge.beecrowd.com/pt/problems/view/1173

public class PreenchendoVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int[] N = new int[10];

        N[0] = V;
        for (int i = 1; i < 10; i++) {
            N[i] = N[i - 1] * 2;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("N[" + i + "] = " + N[i]);
        }
    }
}
