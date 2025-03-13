package avaliacoes.A2.prova;

import java.util.ArrayList;
import java.util.Objects;

public class ItensAEmbalar {
    ArrayList<ItemASerEmbaladoIF> itens = new ArrayList<>();


    public int adicionaItem (ItemASerEmbaladoIF item) {
        itens.add(item);
        return itens.indexOf(item);
    }

    public double calculaQtdeTotalDeEmbalar() {
        double totalAEmbalar = 0;
        for (ItemASerEmbaladoIF item : itens) {
            totalAEmbalar += item.calculaQtdeEmbalagem();
        }
        return totalAEmbalar;
    }

    public String listaItensAEmbalar() {
        String todosItens = "-Lista de itens à embalar:\n";
        for (ItemASerEmbaladoIF item : itens) {
            todosItens += ">" + item + "\n";
        }
        return todosItens;
    }

    @Override
    public String toString() {
        String todosItens = "Itens adicionados a lista de embalagem:\n";
        int i = 1;
        for (ItemASerEmbaladoIF item : itens) {
            todosItens += i + "º - " + item + "\n";
            i++;
        }
        return todosItens;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItensAEmbalar that = (ItensAEmbalar) o;
        return Objects.equals(itens, that.itens);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(itens);
    }
}
