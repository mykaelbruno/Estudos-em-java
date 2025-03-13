package avaliacoes.A2.prova;

import java.util.Objects;

public class MalaRetangular implements ItemASerEmbaladoIF {
    private double lado1;
    private double lado2;
    private double peso;

    public MalaRetangular(double lado1, double lado2, double peso) throws Exception {
        verificaLado(lado1);
        verificaLado(lado2);
        verificaPeso(peso);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.peso = peso;
    }

    private static void verificaPeso(double peso) throws Exception {
        if (peso <= 0) {
            throw new Exception("O peso precisa ser maior do que zero.");
        }
    }

    private static void verificaLado(double lado1) throws Exception {
        if (lado1 <= 0) {
            throw new Exception("A medida do lado precisa ser maior do que zero.");
        }
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado1(double lado1) throws Exception {
        verificaLado(lado1);
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) throws Exception {
        verificaLado(lado2);
        this.lado2 = lado2;
    }

    public void setPeso(double peso) throws Exception {
        verificaPeso(peso);
        this.peso = peso;
    }

    @Override
    public double calculaArea() {
        return lado1 * lado2;
    }

    @Override
    public double calculaQtdeEmbalagem() {
        return getPeso() * calculaArea();
    }

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public String getDescricaoEmbalagem() {
        return "Mala regular: " + calculaQtdeEmbalagem();
    }

    @Override
    public String toString() {
        return "Mala Retangular: " +
                "lado 1 = " + lado1 +
                ", lado2 = " + lado2 +
                ", peso = " + peso + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MalaRetangular that = (MalaRetangular) o;
        return Double.compare(lado1, that.lado1) == 0 && Double.compare(lado2, that.lado2) == 0 && Double.compare(peso, that.peso) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lado1, lado2, peso);
    }

    @Override
    public int compareTo(ItemASerEmbaladoIF o) {
        return Double.compare(this.calculaArea(), o.calculaArea());
    }
}
