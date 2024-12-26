package POO;

public class Aluno {
    private String nome;
    private int idade;
    double nota;

    public void setNome (String nome) {
        this.nome = nome;
        System.out.println("Nome cadastrado com sucessso, " + nome);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
