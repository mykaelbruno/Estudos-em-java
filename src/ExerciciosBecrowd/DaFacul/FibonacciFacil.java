package ExerciciosBecrowd.DaFacul;

import java.util.Scanner;

//https://judge.beecrowd.com/pt/problems/view/1151

public class FibonacciFacil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1, c;

        System.out.print(a);
        if (n > 0) {
            System.out.print(" " + b);
        }

        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
        }
        System.out.println();
    }
}