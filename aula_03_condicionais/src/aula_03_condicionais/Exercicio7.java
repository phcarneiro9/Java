package aula_03_condicionais;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

        float saldo = 1000.00f;
        float valor;
        int operacao;

        System.out.println("************************************************");
        System.out.println("*               BANCO GENERATION               *");
        System.out.println("************************************************");
        System.out.println("* 1 - Saldo                                    *");
        System.out.println("* 2 - Saque                                    *");
        System.out.println("* 3 - Depósito                                 *");
        System.out.println("************************************************");

        System.out.print("\nOperação: ");
        operacao = leia.nextInt();

        switch (operacao) {

            case 1:
                System.out.println("\nOperação - Saldo");
                System.out.printf("Saldo: R$ %.2f%n", saldo);
                break;

            case 2:
                System.out.print("Valor: R$ ");
                valor = leia.nextFloat();

                System.out.println("\nOperação - Saque");

                if (valor > saldo) {
                    System.out.println("Saldo Insuficiente!");
                } else {
                    saldo = saldo - valor;
                    System.out.printf("Novo Saldo: R$ %.2f%n", saldo);
                }
                break;

            case 3:
                System.out.print("Valor: R$ ");
                valor = leia.nextFloat();

                System.out.println("\nOperação - Depósito");

                saldo = saldo + valor;

                System.out.printf("Novo Saldo: R$ %.2f%n", saldo);
                break;

            default:
                System.out.println("\nOperação Inválida!");
        }

        leia.close();
    }
}