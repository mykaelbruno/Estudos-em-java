package codes.primeiros;

import java.util.Scanner;

/*
 * "Ler 3 números inteiros da entrada, imprimir o menor
 * e o maior"
 *
 * Autor: Jacques Sauvé
 */

public class SegundoPrograma2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Entre com o primeiro inteiro: ");
        n1 = sc.nextInt();
        System.out.print("Entre com o segundo inteiro: ");
        n2 = sc.nextInt();
        System.out.print("Entre com o terceiro inteiro: ");
        n3 = sc.nextInt();
        int minimo;
        int maximo;
        if (n1 > n2) {
            if (n1 > n3) {
                if (n2 < n3) {
                    minimo = n2;
                } else {
                    minimo = n3;
                }
                maximo = n1;
            } else {
                if (n1 < n2) {
                    minimo = n1;
                } else {
                    minimo = n2;
                }
                maximo = n3;
            }
        } else {
            if (n2 > n3) {
                if (n1 < n3) {
                    minimo = n1;
                } else {
                    minimo = n3;
                }
                maximo = n2;
            } else {
                if (n1 < n2) {
                    minimo = n1;
                } else {
                    minimo = n3;
                }
                maximo = n3;
            }
        }
        sc.close();
        System.out.println("O menor numero eh: " + minimo);
        System.out.println("O maior numero eh: " + maximo);
    }
}
