package pratica_avaliada_01;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		 // Cabe�alho
        System.out.println("*********************************************************");
        System.out.println("*               SISTEMA DE NOTAS DO ALUNO               *");
        System.out.println("*********************************************************");

        // Entrada de dados
        System.out.print("Nome do aluno: ");
        String nome = leia.nextLine();

        System.out.print("Nota final (0 a 10): ");
        float nota = leia.nextFloat();

        String situacao;

        // Classifica��o
        if (nota >= 7) {
            situacao = "APROVADO";
        } 
        else if (nota >= 5 && nota < 7) {
            situacao = "RECUPERA��O";
        } 
        else {
            situacao = "REPROVADO";
        }

        // Resultado
        System.out.println("*********************************************************");
        System.out.println("*                     RESULTADO                         *");
        System.out.println("*********************************************************");
        System.out.println("* Aluno: " + nome);
        System.out.println("* Nota: " + nota);
        System.out.println("* Situa��o: " + situacao);
        System.out.println("*********************************************************");

        leia.close();
    }
}

