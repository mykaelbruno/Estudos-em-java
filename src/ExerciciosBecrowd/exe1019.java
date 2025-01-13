package ExerciciosBecrowd;

import java.util.Scanner;

public class exe1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int horas = n / 3600;
        n = n % 3600;
        int minutos = n / 60;
        n = n % 60;
        int segundos = n;

        System.out.printf("%d:%d:%d%n", horas, minutos, segundos);
    }
}
