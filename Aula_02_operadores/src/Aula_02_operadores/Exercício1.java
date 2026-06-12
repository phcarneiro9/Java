package Aula_02_operadores;

import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float Salário;
		float Abono;
		float novoSalário;
		
		System.out.println("Digite o salário:");
		Salário = leia.nextFloat();
		
		System.out.println("Digite o abono:");
		Abono = leia.nextFloat();
		
		novoSalário = Salário + Abono;

        System.out.println("Novo salário: " + novoSalário);					

	}

}
