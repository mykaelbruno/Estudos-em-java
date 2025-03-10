package avaliacoes.A2.simulado.maxTurismo;

import java.util.ArrayList;
import java.util.Objects;

public class VendasDaAgenciaDeTurismo {
    ArrayList<VendaDeTurismoIF> vendas = new ArrayList<VendaDeTurismoIF>() {
    };

    public int adicionaVenda(VendaDeTurismoIF item) {
        vendas.add(item);
        return vendas.indexOf(item);
    }

    public double getPrecoDeVenda (int posicao) {
        VendaDeTurismoIF venda = vendas.get(posicao);
        return venda.getPreco();
    }

    public double getPrecoTotal () {
        double precoTotal = 0;
        for (VendaDeTurismoIF venda : vendas){
            precoTotal += venda.getPreco();
        }
        return precoTotal;
    }

    public String listagemDeVendas (){
        String listagem = "";
        for (VendaDeTurismoIF venda : vendas) {
            listagem += venda.getDescricao() + "; ";
        }
        return listagem;
    }

    @Override
    public String toString() {
        String todasVendas = "";
        for (VendaDeTurismoIF venda : vendas){
            todasVendas += ">" + venda.getDescricao() + "\n";
        }
        return "Vendas realizadas: \n" + todasVendas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VendasDaAgenciaDeTurismo that = (VendasDaAgenciaDeTurismo) o;
        return Objects.equals(vendas, that.vendas);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(vendas);
    }
}
