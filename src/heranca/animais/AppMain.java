package heranca.animais;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um nome para o cachorro: ");
        String nome = sc.nextLine();

        Cachorro cachorro = new Cachorro(nome);

        System.out.println("Cachorro chamado " + cachorro.getNome());
        System.out.println("Coloquei o cachorro pra latir: ");
        cachorro.latir();
        System.out.println("\nColoquei o cachorro pra dormir:");
        cachorro.dormir();
        System.out.println("\nColoquei o cachorro pra comer, mas ele não estava com fome:");
        cachorro.comer();

        System.out.println("\nColoquei o cachorro pra brincar 2x, mas na segunda ele estava com fome:");
        cachorro.brincar();
        cachorro.brincar();

        System.out.println("\nColoquei o cachorro pra comer:");
        cachorro.comer();
        System.out.println("\nTentei brincar com o cachorro, mas:");
        cachorro.brincar();

        System.out.println("\nVamos descansar " + cachorro.getNome() + "!");
        cachorro.dormir();

        System.out.println("\nAgora ele esta pronto para brincar novamente!");
        cachorro.brincar();


    }
}
