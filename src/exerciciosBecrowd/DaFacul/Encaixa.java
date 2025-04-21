package exerciciosBecrowd.DaFacul;

import java.util.Scanner;

//https://judge.beecrowd.com/pt/problems/view/1241

public class Encaixa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.nextLine();

        String[] saidas = new String[num];

        for (int i = 0; i < num; i++) {
            String numUsuario = sc.nextLine();
            String[] numSeparados = numUsuario.split(" ");

            String primeiroNum = numSeparados[0];
            String segundoNum = numSeparados[1];

            if (primeiroNum.endsWith(segundoNum)){
                saidas[i] = "encaixa";
            }
            else {
                saidas[i] = "nao encaixa";
            }
        }

        for (int i = 0; i < num; i++) {
            System.out.println(saidas[i]);
        }
    }
}
