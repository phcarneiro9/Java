package Aula_02_operadores;

import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float Salário;
		float Abono;
		float novoSalário;
		
		System.out.print("Digite o salário:");
		Salário = leia.nextFloat();
		
		System.out.print("Digite o abono:");
		Abono = leia.nextFloat();
		
		novoSalário = Salário + Abono;

        System.out.print("Novo salário: " + novoSalário);
        
        leia.close();

	}

}
