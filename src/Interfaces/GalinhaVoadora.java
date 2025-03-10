package Interfaces;

public class GalinhaVoadora implements Voador{
    private String nome;

    private double peso;


    //HERDADOS DA INTERFACE
    private double velocidade;
    @Override
    public void voar() {
        System.out.println("Voando...");
    }

    @Override
    public void planar() {
        System.out.println("Planando...");
    }

    @Override
    public void cair() {
        System.out.println("Cairando...");
    }


    //GET E SET
    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
