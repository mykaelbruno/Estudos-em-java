package avaliacoes.A1.simulado.tarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaTarefas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Tarefa> tarefas = new ArrayList<>();

        // adicionando tarefas p/ testar
        tarefas.add(new Tarefa(18, 12, 2024, "Aula online de Lógica de programação"));
        tarefas.add(new Tarefa(20, 12, 2024, "Estudar para a prova de Java"));
        tarefas.add(new Tarefa(23, 12, 2024, "Fazer trabalho de ADM II"));

        while (true) {
            System.out.println("\nMenu de Gerenciamento de Tarefas:");
            System.out.println("1. Listar todas as tarefas");
            System.out.println("2. Marcar tarefa como concluída");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                exibirTarefas(tarefas);
            } else if (opcao == 2) {
                marcarComoConcluida(tarefas, scanner);
            } else if (opcao == 3) {
                System.out.println("Programa encerrado.");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void exibirTarefas(ArrayList<Tarefa> tarefas) {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }

        System.out.println("\nTarefas cadastradas:");
        for (int i = 0; i < tarefas.size(); i++) {
            Tarefa tarefa = tarefas.get(i);
            System.out.println(i + " - " + tarefa.getDescricao() +
                    " | Concluída: " + (tarefa.isConcluida() ? "Sim" : "Não"));
        }
    }

    private static void marcarComoConcluida(ArrayList<Tarefa> tarefas, Scanner scanner) {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada para marcar como concluída.");
            return;
        }

        System.out.println("\nSelecione o índice da tarefa para marcar como concluída:");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println(i + " - " + tarefas.get(i).getDescricao());
        }

        System.out.print("Digite o índice: ");
        int indice = scanner.nextInt();

        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.get(indice).setConcluida(true);
            System.out.println("Tarefa marcada como concluída!");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
