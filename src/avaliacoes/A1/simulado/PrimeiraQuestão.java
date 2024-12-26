//deletei uma parte do meio do códgio sem querer, tinha ficado ótimo, mas isso quebrou ele, preciso arrumar depois

/* package avaliacao;

import java.util.Scanner;
import java.util.ArrayList;

public class PrimeiraQuestão {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> divisiveisComum = new ArrayList<>();

        int n1 = recebeNum("Informe um número inteiro entre 0 e 10: ", sc, "O número precisa ser menor do que 10, tente novamente: ");

        int n2 = recebeNum("Informe um número inteiro Informe um número inteiro entre 0 e 10: ", sc, "O número precisa ser menor do que 10 e maior do que 0, tente novamente: ");

        for (int i = 1; i <= 200; i++) {
            if (i % n1 == 0 && i % n2 == 0) {
                divisiveisComum.add(i);
            }
        } divisiveisComum.size(); i++) {
            System.out.println(divisiveisComum.get(i));
        }
    }

    private static int recebeNum(String msg, Scanner sc, String error) {
        System.out.print(msg);
        int num = sc.nextInt();
        while (num > 10 || num < 0) {
            System.out.println(error);
            num = sc.nextInt();
        }
        return num;
    }
}*/