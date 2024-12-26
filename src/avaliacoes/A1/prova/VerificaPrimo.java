package avaliacoes.A1.prova;

import java.util.ArrayList;
import java.util.Scanner;

public class VerificaPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int QUANT_NUM = 5;
        int[] numeros = new int[QUANT_NUM];

        //RECEBE OS NÚMEROS INTEIROS E VERIFICA SE SATISFAZ A CONDIÇÃO
        for (int i = 0;i < QUANT_NUM;i++){
            System.out.print("Informe um numero entre 50 e 110 (incluindo estes numeros): ");
            int numero = sc.nextInt();
            while (numero < 50 || numero > 110){
                System.out.print("O número precisa ser entre 50 a 110, tente novamente: ");
                numero = sc.nextInt();
            }
            numeros[i] = numero;
        }

        //VERIFICA SE SÃO PRIMOS
        ArrayList<Integer> primos = new ArrayList<>();
        for (int i = 0; i < QUANT_NUM;i++){ //percorre o array numeros
            int quantDivisores = 0;
            for (int j = 1; j < numeros[i]; j++){ //percorre cada valor, de 1 até numeros[i]
                if (numeros[i] % j == 0){
                    quantDivisores++;
                }
                if (quantDivisores == 2) {
                    primos.add(numeros[i]);
                }
            }
        }

        System.out.println("Quantidade de números primos: " + primos.size());
        System.out.println("Os Seguintes números são primos: " + primos);
    }
}
