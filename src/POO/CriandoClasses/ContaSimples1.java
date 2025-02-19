package POO.CriandoClasses;

import java.util.Objects;

public class ContaSimples1 {

    //contrutor não tem retorno, já os métodos retornam, se não retornarem nada, declare que eles rotornam void, mas precisam ter um retorno

    //atributos são informações guardadas pelo objeto
    private String nome;
    private String cpf;
    private int numero;
    private double saldo;

    //Métodos padrões:
    //ele não é um método, mas é construído e chamado de maneira semelhante, logo ele não retorna nada com return
    //O construtor cria um novo objeto ContaSimples1 a partir dos atributos passados, ele é chamado com a palavra reservada "new"
    public ContaSimples1(int numero, String nome, String cpf) throws Exception{
        if (numero <= 0) {throw new Exception("o número da conta deve ser maior do que 0!");}
        this.numero = numero;
        //o this aponta que esse "numero" se refere ao número deste obejto
        if (nome == null || nome.isEmpty()) {throw new Exception("O nome não pode ser nulo");}
        this.nome = nome;
        this.cpf = cpf;
        saldo = 0;
        //CONSTRUTOR NÃO PRECISA DE RETURN
    }

    //MÉTODOS ACESSORES
    //São responsáveis apenas por retornar o valor dos atributos, a sua execução é finalizada assim que chegar no primeiro return
    public double getSaldo() {
        return saldo;
    }

    //visibilidade tipoDeRetorno Nome(Atrubutos, Recebidos) {Corpo}
    public int getNumero() {
        return numero;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    //Métodos set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //MÉTODOS DE COMPORTAMENTOS
    public void sacar(double valor) throws Exception {
        if (valor < 0) {throw new Exception("O valor para saque deve ser maior que zero");}
        if (saldo <= valor) {throw new Exception("Saldo insuficiente.");}
        saldo -= valor;
    }

    public void depositar(double valor) throws Exception{
        if (valor <= 0) {throw new Exception("O valor para depósito deve ser maior que zero");}
        saldo += valor;
    }

    public void transferir(double valor, ContaSimples1 destino) throws Exception {
        if (saldo < valor) {throw new Exception("Saldo insuficiente para completar a transação");}
        saldo -= valor;
        destino.depositar(valor);
    }

    //método totring
    @Override
    public String toString() {
        return String.format("Conta Nº %d | Titular: %s | CPF: %s | Saldo: R$ %.2f", numero, nome, cpf, saldo);
    }

    //Método HashCode e Equals
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ContaSimples1 that = (ContaSimples1) o;
        return numero == that.numero && Objects.equals(nome, that.nome) && Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf, numero);
    }
}
