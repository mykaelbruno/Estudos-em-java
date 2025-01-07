package ExerciciosBecrowd;

import java.util.Scanner;

public class exe1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigoPeca1 = sc.nextInt();
        int quantPeca1 = sc.nextInt();
        double valorPeca1 = sc.nextDouble();

        int codigoPeca2 = sc.nextInt();
        int quantPeca2 = sc.nextInt();
        double valorPeca2 = sc.nextDouble();

        double total = (quantPeca1 * valorPeca1) + (quantPeca2 * valorPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
    }
}