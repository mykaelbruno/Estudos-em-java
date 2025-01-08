package POO;

public class Celular {
    private String marca;
    private String modelo;
    private int ram;
    private int rom;
    private double tela;

    public void print(){
        System.out.println("Print de tela salvo com sucesso!");
    }

    public void memoria() {
        System.out.println("O celular " + marca + modelo +  "tem de memória interna: " + rom + "GB de memória interna.");
    }

    public Celular(){

    }

    public Celular (String marca, String modelo, int ram, int rom, double tela){
        this.marca = marca;
        this.modelo = modelo;
        this.ram = ram;
        this.rom = rom;
        this.tela = tela;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public double getTela() {
        return tela;
    }

    public void setTela(double tela) {
        this.tela = tela;
    }
}
