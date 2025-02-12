package codes;

//Um array reúne várias variáveis dentro dele

import java.util.Arrays;

public class AprendendoArrays {
    public static void main(String[] args) {
        int[] numeros = new int[10]; //criou um numeros (tipo uma lista) com o nome 'numeros' do tipo int com 10 'espaços'.

        int indice = 0;
        while (indice < numeros.length) {
            if (indice % 2 == 0) {
                numeros[indice] = indice;
            } else {
                numeros[indice] = indice * 2;
            }
            indice++;
        }

        //i++  =>  i+=1
        for (int i = 0; i < numeros.length; i++)
            System.out.println(numeros[i]);

        System.out.println(numeros);
        System.out.println(Arrays.toString(numeros));
        System.out.println(numeros.toString());
    }
}
