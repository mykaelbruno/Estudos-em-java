package codes.primeiros;

import java.util.Scanner;

public class SegundoPrograma3 {
    public static void main(String[] args) {
        final int NUMEROS_A_LER = 3;
        //com 'final', definimos uma constante, uma variável que não muda (chamávamos de regra de negócio em nos códigos do python);
        //Por convenção, nomeiam-se constantes com letras maiúsculas e '_' no lugar dos espaçços

        Scanner sc = new Scanner(System.in);

        int mínimo = Integer.MAX_VALUE;
        //A variável minimo recebe o valor máximo possivel do tipo int
        int máximo = Integer.MIN_VALUE;
        //A variável máximo recebe o valor minimo possivel do tipo int


        //o for vai repetir a quantidade de vezes definida na constante 'NUMEROS_A_LER', para cada loop ele testa se o número informado é maior/ menor que o mínimo/máximo (que começam setados com os limites do int), caso satisfaça as condições, o num substitui o valor da variável que no final é exibida.

        for (int i = 0; i < NUMEROS_A_LER; i++) {
            //define a var int 'i', e enquanto ela for menor do que 'NUMEROS_A_LER', roda o bloco e incrementa 1 a 'i';
            int num = recebeProximoInteiro(sc);
            mínimo = menorNumeroEntre(num, mínimo);
            máximo = maiorNumeroEntre(num, máximo);
        }
        sc.close();
        //finaliza a execução do scanner, não é obrigatório, mas é uma boa prática para gerenciar recursos;
        System.out.println("O menor numero eh: " + mínimo);
        System.out.println("O maior numero eh: " + máximo);
    }

    private static int maiorNumeroEntre(int num, int máximo) {
        return num > máximo ? num : máximo;
    }

    private static int menorNumeroEntre(int num, int minimo) {
        return num < minimo ?num: minimo;
    }

    private static int recebeProximoInteiro(Scanner sc) {
        System.out.print("Entre com o proximo inteiro:");
        int num = sc.nextInt();
        //chama o scan e ele joga o valor que o usuário informou dentro do int num
        return num;
    }
}