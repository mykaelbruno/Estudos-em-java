package codes.primeiros;
//no java podemos usar acentuação em variáveis, mas não é uma boa prática, é comum ultilizar nomes em inglês;
//

import java.util.Scanner;
//scanner é uma classe externa, um bloco de código que ja vem pronto e que podemos importar para usar, tem um comportamento parecido com o "input" do python;
//A classe scanner vai ler um dispositivo de entrada, que nesse caso por padrão será o teclado;

public class SegundoPrograma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //cria um scanner (chamado de 'sc') que lê a entrada do teclado
        // 'System.in' indica a entrada padrão de dados, que é o teclado
        // desconsidere o new, você vai aprender a ultiliza-lo depois

        int n1, n2, n3;
        //declara as variáveis que vão ser utilizadas ao longo do código;

        System.out.print("Entre com o primeiro inteiro: ");
        n1 = sc.nextInt();
        // a varíável n1 vai receber um int digitado pelo usuário, esse trecho chama o objeto pelo seu nome (sc) e informa qual sua função vai ultilziar (.nextInt());
        //diferemte do input, ao chamar o scanner, você precisa fazer um print separado, pois ele não possui uma mensagem "embutida";
        System.out.print("Entre com o segundo inteiro: ");
        n2 = sc.nextInt();
        System.out.print("Entre com o terceiro inteiro: ");
        n3 = sc.nextInt();

        if (n1 > n2) {
            if (n1 > n3) {
                if (n2 < n3) {
                    System.out.println("O menor numero eh: " + n2);
                } else {
                    System.out.println("O menor numero eh: " + n3);
                }
                System.out.println("O maior numero eh: " + n1);
            } else {
                if (n1 < n2) {
                    System.out.println("O menor numero eh: " + n1);
                } else {
                    System.out.println("O menor numero eh: " + n2);
                }
                System.out.println("O maior numero eh: " + n3);
            }
        } else {
            if (n2 > n3) {
                if (n1 < n3) {
                    System.out.println("O menor numero eh: " + n1);
                } else {
                    System.out.println("O menor numero eh: " + n3);
                }
                System.out.println("O maior numero eh: " + n2);
            } else {
                if (n1 < n2) {
                    System.out.println("O menor numero eh: " + n1);
                } else {
                    System.out.println("O menor numero eh: " + n2);
                }
                System.out.println("O maior numero eh: " + n3);
            }
        }
        sc.close();
    }
}
