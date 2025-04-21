package heranca.animais;

public class Animais {
    private String nome;
    private boolean energia;

    public void setEnergia(boolean energia) {
        this.energia = energia;
    }

    public Animais(String nome) {
        this.nome = nome;
        energia = true;
    }

    public boolean isEnergia() {
        return energia;
    }

    public void comer() {
        System.out.println(nome + " Está comendo");
    }

    public void dormir() {
        System.out.println(nome + " Está dormindo");
        energia = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
