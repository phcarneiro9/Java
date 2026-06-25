package aula_03_condicionais;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

        float numero1, numero2;
        int operacao;

        System.out.println("************************************************");
        System.out.println("*              CALCULADORA JAVA                *");
        System.out.println("************************************************");
        System.out.println("* 1 - Soma                                     *");
        System.out.println("* 2 - Subtração                                *");
        System.out.println("* 3 - Multiplicação                            *");
        System.out.println("* 4 - Divisão                                  *");
        System.out.println("************************************************");

        System.out.print("\nDigite o 1º número: ");
        numero1 = leia.nextFloat();

        System.out.print("Digite o 2º número: ");
        numero2 = leia.nextFloat();

        System.out.print("Operação: ");
        operacao = leia.nextInt();

        System.out.println();

        switch (operacao) {

            case 1:
                System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
                break;

            case 2:
                System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
                break;

            case 3:
                System.out.println(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
                break;

            case 4:
                System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
                break;

            default:
                System.out.println("Operação Inválida!");
        }

        leia.close();
    }
}

