package POO;

//uma classe define um TIPO de objeto
//um objeto é uma instancia criada a partir de uma determinada classe

//na classe vcê define o "molde" do objeto, e na classe com o método main, referencamos ele

//atributos são características do objeto
//métodos são ações que podem ser executadas no objeto

public class Carro {
    //atributos
    String modelo;
    String cor;
    int anoFabricacao;
    int velocidade;
    //métodos
    void acelerar(int aceleracao){
        velocidade += aceleracao;
    }

    void buzinar () {
        System.out.println("BIBIIIBI");
    }

    double tempoViagem (double distancia) {
        double tempo = distancia / velocidade;
        return tempo;
    }

    //construtores
    //o construtor por padrão, tem o mesmo nome da classe
    Carro() {

    }
    //Dois construtores podem ter o mesmo nome, mas se diferenciar pelos parâmetros
    Carro(String modelo) {
        this.modelo = modelo;
    }

    Carro(String modelo, String cor, int anoFabricacao, int velocidade) {
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.velocidade = velocidade;
    }
}
