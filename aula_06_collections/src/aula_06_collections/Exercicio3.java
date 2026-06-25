package aula_06_collections;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Exercicio3 {

	public static void main(String[] args) {
		
		  Scanner leia = new Scanner(System.in);
	        ArrayList<String> cores = new ArrayList<>();

	        // Entrada de dados
	        for (int i = 1; i <= 5; i++) {
	            System.out.print("Digite a " + i + "ª cor: ");
	            cores.add(leia.nextLine());
	        }

	        // Listar todas as cores
	        System.out.println("\nListar todas as cores:");
	        for (String cor : cores) {
	            System.out.println(cor);
	        }

	        // Ordenar as cores
	        Collections.sort(cores);

	        System.out.println("\nOrdenar as cores:");
	        for (String cor : cores) {
	            System.out.println(cor);
	        }

	        leia.close();
	    }
	}
