package codes.primeiros;

public class primeiroPrograma {
    public static void main(String[] args) {
        //Um programa (classe) deve sempre iniciar com letra maiúscula (por convenção).
        //java é fortemente tipada, você sempre precisa informar o tipo da variável, diferente de outras lingugagens, como pytohon
        //nomes de variáveis sempre com letras minusculas, e quando for nome composto, usar o segundo com letra maiúscula (não usar '_') pois o java diferencia.
        //void indica o vazio, a auxencia de tipo; presente só nos retornos dos métodos (no lugar do void, fica o tipo primitivo que o metodo (função) vai retorna
        /* Para declarar um float, você precisa usar um 'f' no final do valor; Exemplo:
        float Pi = 3.1415f;

        -Programa:
            Recebe 2 idades, depois compara imprime coisas diferentes dependendo de quem é a maior
         */

        String nome = "Paulo";
        int idadePaulo = 44;
        double pesoPaulo = 86.6;
        float alturaPaulo = 1.81f;

        String outroNome = "Rita";
        int idadeRita = 50;
        double pesoRita = 68.2;
        float alturaRita = 1.72f;

        if (pesoPaulo > pesoRita) {
            System.out.println(nome + " tem " + (pesoPaulo - pesoRita) + "Kg a mais que " + outroNome);
        } else if (pesoPaulo < pesoRita) {
            System.out.println(outroNome + " tem " + (pesoRita - pesoPaulo) + "Kg a mais que " + nome);
        }else {
            System.out.println(nome + " e " + outroNome + " pesam igual.");
        }
    }
}