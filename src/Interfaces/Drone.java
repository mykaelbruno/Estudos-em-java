package Interfaces;

public class Drone implements Voador{

    private String modelo;


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
}
