package aula_03_condicionais;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número: ");
        numero = leia.nextInt();

        if (numero % 2 == 0) {
            if (numero >= 0) {
                System.out.println("O Número " + numero + " é par e positivo!");
            } else {
                System.out.println("O Número " + numero + " é par e negativo!");
            }
        } else {
            if (numero >= 0) {
                System.out.println("O Número " + numero + " é ímpar e positivo!");
            } else {
                System.out.println("O Número " + numero + " é ímpar e negativo!");
            }
        }

        leia.close();
    }
}
