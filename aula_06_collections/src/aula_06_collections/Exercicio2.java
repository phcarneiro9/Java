package aula_06_collections;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int somaPrincipal = 0;
        int somaSecundaria = 0;

        // Entrada da matriz
        System.out.println("Digite os valores da matriz 3x3:");

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("matriz[" + linha + "][" + coluna + "] = ");
                matriz[linha][coluna] = leia.nextInt();
            }
        }

        // Diagonal Principal
        System.out.println("\nElementos da Diagonal Principal:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][i] + " ");
            somaPrincipal += matriz[i][i];
        }

        // Diagonal Secundária
        System.out.println("\n\nElementos da Diagonal Secundária:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][2 - i] + " ");
            somaSecundaria += matriz[i][2 - i];
        }

        // Somatórios
        System.out.println("\n\nSoma dos Elementos da Diagonal Principal: " + somaPrincipal);
        System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaSecundaria);

        leia.close();
    }
}