package exerciciosBecrowd;

import java.util.Scanner;

public class exe1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14159;

        double raio = sc.nextDouble();
        double volume = (4.0 / 3.0) * PI * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f%n", volume);
    }
}