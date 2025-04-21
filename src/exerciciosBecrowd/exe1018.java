package exerciciosBecrowd;

import java.util.Scanner;

public class exe1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        sc.close();

        System.out.println(valor);
        int[] cedulas =  {100, 50, 20, 10, 5, 2, 1};
        int[] quantcedulas = new int[7];
        for (int i = 0; i < cedulas.length; i++) {
            quantcedulas[i] = valor / cedulas[i];
            valor = valor % cedulas[i];
        }
        for (int i = 0; i < quantcedulas.length; i++) {
            System.out.printf("%d nota(s) de R$ %d,00%n", quantcedulas[i], cedulas[i]);
        }
    }
}
