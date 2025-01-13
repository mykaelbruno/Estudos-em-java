package ExerciciosBecrowd;

import java.util.Scanner;

public class exe1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int anos = n / 365;
        n = n % 365;
        int meses = n / 30;
        n = n % 30;
        int dias = n;

        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", anos, meses, dias);
    }
}
