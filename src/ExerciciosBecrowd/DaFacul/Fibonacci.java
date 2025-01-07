package ExerciciosBecrowd.DaFacul;

import java.util.Scanner;
import java.util.Arrays;

//https://judge.beecrowd.com/pt/problems/view/1176

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] casos = new int[t];
        for (int i = 0; i < t; i++) {
            casos[i] = sc.nextInt();
        }

        int maxN = Arrays.stream(casos).max().orElse(0);
        long[] fibonacci = new long[maxN + 1];
        fibonacci[0] = 0;
        if (maxN > 0) {
            fibonacci[1] = 1;
        }
        for (int i = 2; i <= maxN; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        for (int i = 0; i < t; i++) {
            System.out.println("Fib(" + casos[i] + ") = " + fibonacci[casos[i]]);
        }
    }
}