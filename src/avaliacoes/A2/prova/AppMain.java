package avaliacoes.A2.prova;

public class AppMain {
    public static void main(String[] args) {
        try {

            ItensAEmbalar itens = new ItensAEmbalar();

            PratoRedondo prato1 = new PratoRedondo(10, 5);
            PratoRedondo prato2 = new PratoRedondo(7, 2);
            MalaRetangular mala1 = new MalaRetangular(5, 3, 10);

            System.out.println(prato1.calculaArea());
            System.out.println(prato1.getDescricaoEmbalagem());
            System.out.println(mala1.getDescricaoEmbalagem());


            itens.adicionaItem(prato1);
            itens.adicionaItem(prato2);
            itens.adicionaItem(mala1);


            System.out.println(itens.calculaQtdeTotalDeEmbalar());
            System.out.println(itens.listaItensAEmbalar());
            System.out.println(itens);

            System.out.println(prato1.calculaQtdeEmbalagem());
            System.out.println(prato2.calculaQtdeEmbalagem());
            System.out.println(mala1.calculaQtdeEmbalagem());

            System.out.println();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}