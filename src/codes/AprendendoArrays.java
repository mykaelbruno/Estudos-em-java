package codes;

//Um array reúne várias variáveis dentro dele

public class AprendendoArrays {
    public static void main(String[] args) {
        int[] array = new int[10]; //criou um array (tipo uma lista) com o nome 'array' do tipo int com 10 'espaços'.

        int indice = 0;
        while (indice < array.length) {
            if (indice % 2 == 0) {
                array[indice] = indice;
            } else {
                array[indice] = indice * 2;
            }
            indice++;
        }

        //i++  =>  i+=1
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);

    }
}
