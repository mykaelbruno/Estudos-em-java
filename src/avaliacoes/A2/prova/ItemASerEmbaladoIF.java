package avaliacoes.A2.prova;

public interface ItemASerEmbaladoIF extends Comparable<ItemASerEmbaladoIF> {
    public double calculaArea();
    public double calculaQtdeEmbalagem();
    public double getPeso();
    public String getDescricaoEmbalagem();
}