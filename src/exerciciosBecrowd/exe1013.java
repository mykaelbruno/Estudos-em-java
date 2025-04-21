package exerciciosBecrowd;

import java.util.Scanner;

public class exe1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int primeiroMaior = (a+b+Math.abs(a-b))/2;
        int maior = (primeiroMaior+c+Math.abs(primeiroMaior-c))/2;

        System.out.println(maior + " eh o maior");
    }
}
