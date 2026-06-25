package aula_04_repeticoes;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

        int inicio, fim;

        System.out.print("Digite o primeiro número do intervalo: ");
        inicio = leia.nextInt();

        System.out.print("Digite o último número do intervalo: ");
        fim = leia.nextInt();

        if (inicio >= fim) {
            System.out.println("\nIntervalo inválido!");
        } else {

            System.out.println("\nNo intervalo entre " + inicio + " e " + fim + ":\n");

            for (int i = inicio; i <= fim; i++) {

                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i + " é múltiplo de 3 e 5");
                }
            }
        }

        leia.close();
    }
}


