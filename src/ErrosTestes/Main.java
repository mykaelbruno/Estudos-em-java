/*
package ErrosTestes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            //cria um loop infinito para pedir o scanner
            try {
                //"tenta" executar esse bloco
                System.out.println("Informe um divisor: ");
                int num = Integer.parseInt(sc.nextLine());
                //recebe uma sting e converte pra inteiro, para evitar bug de enter no buffer;

                //divide 5 pelo valor informado >ONDE OCORRE O ERRO<
                System.out.println(res);
                //caso não seja 0, ele vai dividir e seguir o código
                break;
                //ao seguir o código, chega no break, que finaliza o while e a execução geral do código
            } catch (ArithmeticException e) {
                //caso o divisor seja 0, ele gera o erro e pula direto para o catch, para ser tratado, ignorando o break, logo, continuando no loop
                System.err.println("Erro ao executar: " + e.getMessage());
                //informa o erro e continua a execução do código, continuando no loop
            }
        }

    }
    private Boolean numeroDividir(double num) {
        double res = 5 / num;
        if(num % 2 == 0) {

        }
         / num;

        return res;
    }
}
*/
