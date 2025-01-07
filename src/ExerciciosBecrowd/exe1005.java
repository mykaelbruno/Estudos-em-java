package ExerciciosBecrowd;

import java.util.Scanner;

public class exe1005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PESO_A = 3.5;
        final double PESO_B = 7.5;

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        sc.close();

        double media = (a * PESO_A + b * PESO_B) / (PESO_A + PESO_B);

        System.out.printf("MEDIA = %.5f%n", media);

    }
}
