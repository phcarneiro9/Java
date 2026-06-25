package aula_07_metodos;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        ArrayList<String> produtos = new ArrayList<>();
        ArrayList<Integer> quantidades = new ArrayList<>();

        int quantidadeProdutos = 2;

        for (int i = 0; i < quantidadeProdutos; i++) {

            System.out.println("Produto " + (i + 1));

            System.out.print("Nome do produto: ");
            produtos.add(leia.next());

            System.out.print("Quantidade em estoque: ");
            quantidades.add(leia.nextInt());
        }

        System.out.print("\nDigite o nome do produto para atualizar: ");
        String produtoAtualizar = leia.next();

        for (int i = 0; i < quantidadeProdutos; i++) {

            if (produtos.get(i).equalsIgnoreCase(produtoAtualizar)) {

                System.out.print("Nova quantidade: ");
                quantidades.set(i, leia.nextInt());
            }
        }

        System.out.println("\nEstoque:");

        for (int i = 0; i < quantidadeProdutos; i++) {

            System.out.println(
                "Produto: " + produtos.get(i) +
                " | Quantidade: " + quantidades.get(i)
            );
        }

        leia.close();
    }
}