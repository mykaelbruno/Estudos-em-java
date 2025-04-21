package heranca.animais;

public class Cachorro extends Animais{
    private Boolean fome;

    public Cachorro(String nome) {
        super(nome); //o super se refere ao construtor da classe mãe, para instanciar um objeto do tipo da classe filha, mas usando seus atributos
        fome = false;
    }

    public void latir(){
        System.out.println("AU AU AU " + getNome() + " está latindo!");
    }

    @Override
    public void comer() {
        if (fome) {
            super.comer();
            this.fome = false;
        } else {
            System.out.println(getNome() + " Não está com fome!");
        }
    }

    public void brincar() {
        if (fome) {
            System.out.println(getNome() + " está com fome, alimente-o primeiro!");
        } else if (!this.isEnergia()) {
            System.out.println(getNome() + " está cansado, ele brincou muito!");
        } else {
            System.out.println("Brincando com " +getNome() + "...");
            fome = true;
            this.setEnergia(false);
        }
    }
}

