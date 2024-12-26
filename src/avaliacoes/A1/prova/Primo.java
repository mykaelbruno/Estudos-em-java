package avaliacoes.A1.prova;

import java.util.ArrayList;
import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        final int QUANT_NUM = 5;
        int[] numeros = new int[QUANT_NUM];

        recebeNum(QUANT_NUM, numeros);

        ArrayList<Integer> primos = new ArrayList<>();
        testaPrimo(QUANT_NUM, numeros, primos);

        System.out.println("Quantidade de números primos: " + primos.size());
        System.out.println("Os Seguintes números são primos: " + primos);
    }

    private static void testaPrimo(int QUANT_NUM, int[] numeros, ArrayList<Integer> primos) {
        for (int i = 0; i < QUANT_NUM; i++){
            int divisores = 0;
            for (int j = 1; j <= numeros[i]; j++){
                if ( numeros[i] % j == 0){
                    divisores++;
                }
            }
            if (divisores == 2){
                primos.add(numeros[i]);
            }
        }
    }

    private static void recebeNum(int quantNum, int[] numeros) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < quantNum; i++){
            System.out.print("Informe um numero entre 50 e 110 (incluindo estes numeros): ");
            int numero = sc.nextInt();
            while (numero < 50 || numero > 110){
                System.out.print("O número precisa ser entre 50 a 110, tente novamente: ");
                numero = sc.nextInt();
            }
            numeros[i] = numero;
        }
    }
}
