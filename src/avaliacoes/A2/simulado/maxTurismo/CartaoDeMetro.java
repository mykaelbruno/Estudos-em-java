package avaliacoes.A2.simulado.maxTurismo;

public class CartaoDeMetro implements VendaDeTurismoIF{
    private int qtDeViagens;
    public static final double VALOR_DE_UMA_VIAGEM = 7;

    public CartaoDeMetro(int qtDeViagens) throws Exception {
        verificaQuantViagens(qtDeViagens);
        this.qtDeViagens = qtDeViagens;
    }

    private static void verificaQuantViagens(int qtDeViagens) throws Exception {
        if (qtDeViagens <= 0) {
            throw new Exception("Quantidade de viagens deve ser maior que zero");
        }
    }

    public int getQtdeViagens() {
        return qtDeViagens;
    }

    public void setQtdeViagens(int qtDeViagens) {
        if (qtDeViagens > 0) {
            this.qtDeViagens = qtDeViagens;
        }
    }

    @Override
    public double getPreco() {
        if (qtDeViagens < 20){
            return VALOR_DE_UMA_VIAGEM * qtDeViagens;
        }
        return 0.8*(VALOR_DE_UMA_VIAGEM * qtDeViagens);
    }

    @Override
    public String getDescricao() {
        return qtDeViagens + " viagens de metro.";
    }

    @Override
    public String toString() {
        return "CartaoDeMetro [qtdeViagens=" + qtDeViagens + "]";
    }
}
