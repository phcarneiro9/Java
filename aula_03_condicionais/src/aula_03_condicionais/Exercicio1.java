package aula_03_condicionais;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

        int A, B, C;

        System.out.print("Digite o número A: ");
        A = leia.nextInt();

        System.out.print("Digite o número B: ");
        B = leia.nextInt();

        System.out.print("Digite o número C: ");
        C = leia.nextInt();

        int soma = A + B;

        if (soma > C) {
            System.out.println(A + " + " + B + " = " + soma + " > " + C);
            System.out.println("A Soma de A + B é Maior do que C");
        } else if (soma < C) {
            System.out.println(A + " + " + B + " = " + soma + " < " + C);
            System.out.println("A Soma de A + B é Menor do que C");
        } else {
            System.out.println(A + " + " + B + " = " + soma + " = " + C);
            System.out.println("A Soma de A + B é Igual a C");
        }

        leia.close();
    }
}