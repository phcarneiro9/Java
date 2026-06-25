package pratica_avaliada_01;

	import java.util.Scanner;

	public class Exercicio3 {

		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);

	        // Cabe�alho
	        System.out.println("======================================");
	        System.out.println("         CALCULADORA SIMPLES          ");
	        System.out.println("======================================");

	        // Entrada
	        System.out.print("N�mero 1: ");
	        float n1 = leia.nextFloat();

	        System.out.print("N�mero 2: ");
	        float n2 = leia.nextFloat();

	        System.out.print("Opera��o (1 +, 2 -, 3 *, 4 /): ");
	        int op = leia.nextInt();

	        System.out.println("======================================");
	        System.out.println("           RESULTADO                  ");
	        System.out.println("======================================");

	        // Decis�o
	        if (op == 1) {
	            System.out.println("Resultado: " + (n1 + n2));
	        }

	        if (op == 2) {
	            System.out.println("Resultado: " + (n1 - n2));
	        }

	        if (op == 3) {
	            System.out.println("Resultado: " + (n1 * n2));
	        }

	        if (op == 4) {
	            if (n2 != 0) {
	                System.out.println("Resultado: " + (n1 / n2));
	            } else {
	                System.out.println("Erro: divis�o por zero");
	            }
	        }

	        System.out.println("======================================");

	        leia.close();
	    }
	}

