package POO;

import java.util.Scanner;

public class CarroTestar {
    public static void main(String[] args) {

        Carro celta = new Carro();
        celta.modelo = "Celta";
        celta.cor = "Preto";
        celta.anoFabricacao = 2009;
        celta.velocidade = 120;

        celta.acelerar(20);
        System.out.println(celta.velocidade);

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a distancia percorrida: ");
        double distancia = sc.nextDouble();
        double tempo = celta.tempoViagem(distancia);
        System.out.println("Tempo viajando: " + tempo);

        Carro uno = new Carro();
        Carro fox = new Carro("fox", "VW", 108, 12);
    }
}
