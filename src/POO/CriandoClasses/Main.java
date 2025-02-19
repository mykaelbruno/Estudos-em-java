package POO.CriandoClasses;

public class Main {
    public static void main(String[] args) {
        try {
            ContaSimples1 umaConta = new ContaSimples1(1, "João", "309140605-06");
            ContaSimples1 outraConta = new ContaSimples1(2, "José Bonifácio", "187987028-76");
            System.out.println("Nova conta aberta = " + umaConta);
            umaConta.depositar(1000);
            System.out.println("Saldo atualizado: " + umaConta.getSaldo());
            umaConta.sacar(300);
            System.out.println("Saldo final: " + umaConta.getSaldo());
            System.out.println(outraConta);
            umaConta.transferir(100, outraConta);
            System.out.println(umaConta);
            System.out.println(outraConta);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
