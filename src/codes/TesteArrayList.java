package codes;

import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1); //adiciona um valor ao arraylist c/ .add()
        numeros.add(2);

        System.out.println(numeros.get(1));     //acessa elementos do arraylist c/ . get()
        numeros.set(0, 174);                    //subtitui o valor espeíficado
        System.out.println(numeros.getFirst()); //pega o valor do primeiro indice

        System.out.println(numeros.size());     // exibe o tamanho do arraylist

        System.out.println(numeros.contains(2));    //exibe se ele contém um valor

        System.out.println(numeros.isEmpty());


        numeros.remove(1);
        System.out.println(numeros);


    }
}
