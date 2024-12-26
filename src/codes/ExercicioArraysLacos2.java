package codes;

import java.util.Scanner;

//Código pronto, mas, revisar e estudar para entender os conceitos em detalhes

public class ExercicioArraysLacos2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Entrada do tamanho do primeiro vetor
        System.out.print("Digite o tamanho do primeiro vetor: ");
        int tamanho1 = sc.nextInt();
        while (tamanho1 < 1 || tamanho1 > 10) {
            System.out.print("Valor inválido, tente novamente: ");
            tamanho1 = sc.nextInt();
        }
        //Entrada do tamanho do segundo vetor
        System.out.print("Digite o tamanho do segundo vetor: ");
        int tamanho2 = sc.nextInt();
        while (tamanho2 < 1 || tamanho2 > 10) {
            System.out.print("Valor inválido, tente novamente: ");
            tamanho2 = sc.nextInt();
        }

        //Inicializando os vetores
        int[] vetor1 = new int[tamanho1]; // multiplos de 1  1,2,3,4,5
        int[] vetor2 = new int[tamanho2]; // multiplos de 10 10,20,30,40,50

        //Adicionando os múltiplos escolhidos ao vetor
        for (int i = 0;i < tamanho1; i++) {
            vetor1[i] = i+1;
        }
        for (int i = 0; i < tamanho2; i++) {
            vetor2[i] = (i+1)*10;
        }

        //vetor para guardar a intecalação dos dois
        int[] vetorIntercalacao = new int[tamanho1 + tamanho2];
        int posicao = 0; //uso para adicionar mais elementos na posição certa
        int menorQuantidade = 0;

        // atribui à menorQuantidade o tamanho do menor vetor
        if (tamanho1 < tamanho2) {
            menorQuantidade = tamanho1;
        } else {
            menorQuantidade = tamanho2;
        }

        for (int i = 0; i < menorQuantidade; i++) {
            vetorIntercalacao[posicao] = vetor1[i];
            posicao++;

            vetorIntercalacao[posicao] = vetor2[i];
            posicao++;
        }

        if (tamanho1 > tamanho2) {
            for (int i = menorQuantidade; i < tamanho1; i++){
                vetorIntercalacao[posicao] = vetor1[i];
                posicao++;
            }
        }else {
            for (int i = menorQuantidade; i < tamanho2; i++) {
                vetorIntercalacao[posicao] = vetor2[i];
                posicao++;
            }
        }


        //SAIDA
        for (int i = 0; i<vetorIntercalacao.length; i++){
            System.out.print(vetorIntercalacao[i] + " ");
        }

    }
}

