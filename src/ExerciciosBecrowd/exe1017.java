package ExerciciosBecrowd;

import java.util.Scanner;

public class exe1017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tempo = sc.nextInt();
        int velocidade = sc.nextInt();
        int deslocamento = velocidade * tempo;

        double consumo = (double) deslocamento / 12;

        System.out.printf("%.3f%n", consumo);
    }
}