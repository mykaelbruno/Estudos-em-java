package ExerciciosBecrowd;

import java.util.Scanner;

public class exe1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int distanciaPercorrida = sc.nextInt();
        double combustivelGasto = sc.nextDouble();

        double consumoMedio = distanciaPercorrida / combustivelGasto;

        System.out.printf("%.3f km/l%n", consumoMedio);
    }
}
