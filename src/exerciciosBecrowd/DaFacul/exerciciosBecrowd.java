package exerciciosBecrowd.DaFacul;

import java.util.Scanner;

public class exerciciosBecrowd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        double ganho;
        double novoSalario;
        double percentual;

        if (salario <= 400) {
            percentual = 15;
            ganho = salario * (percentual / 100);
            novoSalario = salario + ganho;
        } else if (salario > 400 && salario <= 800) {
            percentual = 12;
            ganho = salario * (percentual / 100);
            novoSalario = salario + ganho;
        } else if (salario > 800 && salario <= 1200) {
            percentual = 10;
            ganho = salario * (percentual / 100);
            novoSalario = salario + ganho;
        } else if (salario > 1200 && salario <= 2000) {
            percentual = 7;
            ganho = salario * (percentual / 100);
            novoSalario = salario + ganho;
        } else {
            percentual = 4;
            ganho = salario * (percentual / 100);
            novoSalario = salario + ganho;
        }
        System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %.0f %%\n", novoSalario, ganho, percentual);
    }
}