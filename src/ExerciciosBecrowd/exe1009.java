package ExerciciosBecrowd;

import java.util.Scanner;

public class exe1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double COMISSAO = 0.15;
        String nome = sc.nextLine();
        double salario = sc.nextFloat();
        double totalEmVendas = sc.nextFloat();

        double comissaoTotal = totalEmVendas * COMISSAO;
        double salarioTotal = salario + comissaoTotal;

        System.out.printf("TOTAL = R$ %.2f%n", salarioTotal);
    }
}

