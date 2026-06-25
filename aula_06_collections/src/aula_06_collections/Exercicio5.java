package aula_06_collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();
        Scanner leia = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n1 - Adicionar Cliente");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Chamar Cliente");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = leia.nextInt();
            leia.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Nome do cliente: ");
                    String nome = leia.nextLine();
                    fila.add(nome);
                    break;

                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("Fila vazia!");
                    } else {
                        for (String cliente : fila) {
                            System.out.println(cliente);
                        }
                    }
                    break;

                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("Fila vazia!");
                    } else {
                        System.out.println("Cliente chamado: " + fila.poll());
                    }
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        leia.close();
    }
}