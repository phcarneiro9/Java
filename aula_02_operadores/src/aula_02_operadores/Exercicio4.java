package aula_02_operadores;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia =  new Scanner(System.in);
		
		float n1;
		float n2;
		float n3;
		float n4;
        float diferenca;
		
		System.out.print("Digite o Número 1: ");
		n1 = leia.nextFloat();

	    System.out.print("Digite o Número 2: ");  
	    n2 = leia.nextFloat();
	    
	    System.out.print("Digite o Número 3: ");  
	    n3 = leia.nextFloat();
	    
	    System.out.print("Digite o Número 4: ");  
	    n4 = leia.nextFloat();

	    diferenca = (n1 * n2) - (n3 * n4);

        System.out.println("\nDiferença: " + diferenca);
        
        leia.close();
		
	}

}