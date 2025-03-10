package avaliacoes.A2.simulado.maxTurismo;

public class AppMain {
    public static void main(String[] args) {
       //Usei o main apenas para tester as classes
        try {
           VendaDeTurismoIF venda1 = new IngressoEvento(2,1,"Show_Guizzao", 70);
           System.out.println(venda1.getDescricao());
           System.out.println(venda1.getPreco());
       } catch (Exception e) {
           System.err.println(e.getMessage());
       }
    }
}