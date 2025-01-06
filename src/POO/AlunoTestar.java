package POO;

import java.util.Scanner;

public class AlunoTestar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno Bruno = new Aluno();

        Bruno.setNome("Bruno");

        Aluno Alice = new Aluno("Maria Alice da silva pimentel", 12);
        System.out.println(Alice);

    }
}
