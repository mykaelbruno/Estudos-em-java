package avaliacoes.A2.simulado.maxTurismo;

import java.util.Objects;
import java.util.concurrent.ExecutionException;

public class PasseioDeLancha implements VendaDeTurismoIF {
    private int numeroDePessoas;
    private int numeroDeHoras;
    public static final double PRECO_POR_HORA = 60;

    public PasseioDeLancha(int numeroDeHoras, int numeroDePessoas) throws Exception {
        verificaPessoas(numeroDePessoas);
        verificaHoras(numeroDeHoras);
        this.numeroDeHoras = numeroDeHoras;
        this.numeroDePessoas = numeroDePessoas;
    }

    private void verificaPessoas(int numPessoas) throws Exception {
        if (numPessoas < 1) {
            throw new Exception("O passeio deve ter ao menos uma pessoa.");
        }
    }
    private void verificaHoras (int horas) throws Exception {
        if (horas < 1 || horas > 10) {
            throw new Exception("O passeio deve ter entre 1 e 10 horas.");
        }
    }

    public int getNumeroDePessoas() {
        return numeroDePessoas;
    }

    public void setNumeroDePessoas(int numeroDePessoas) throws Exception {
        verificaPessoas(numeroDePessoas);
        this.numeroDePessoas = numeroDePessoas;
    }

    public int getNumeroDeHoras() {
        return numeroDeHoras;
    }

    public void setNumeroDeHoras(int numeroDeHoras) throws Exception {
        verificaHoras(numeroDeHoras);
        this.numeroDeHoras = numeroDeHoras;
    }

    @Override
    public String toString() {
        return "Passeio de lancha com " + numeroDePessoas + " pessoas durante " + numeroDeHoras;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PasseioDeLancha that = (PasseioDeLancha) o;
        return numeroDePessoas == that.numeroDePessoas && numeroDeHoras == that.numeroDeHoras && Double.compare(PRECO_POR_HORA, that.PRECO_POR_HORA) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroDePessoas, numeroDeHoras, PRECO_POR_HORA);
    }

    @Override
    public double getPreco() {
        return PRECO_POR_HORA * numeroDeHoras * numeroDePessoas;
    }

    @Override
    public String getDescricao() {
        return "Passeio de lancha com " + numeroDePessoas + " por: " + getPreco();
    }
}
