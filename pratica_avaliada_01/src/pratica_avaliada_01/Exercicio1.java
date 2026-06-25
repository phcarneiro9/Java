package pratica_avaliada_01;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		// Cabe�alho
        System.out.println("*********************************************************");
        System.out.println("*                SISTEMA DE CONTROLE DE ACESSO          *");
        System.out.println("*********************************************************");
        
        // Entrada de dados
        System.out.print("Nome da pessoa: ");
        String nome = leia.nextLine();

        System.out.print("Idade: ");
        int idade = leia.nextInt();

        System.out.print("Possui autoriza��o dos respons�veis? (true/false): ");
        boolean autorizacao = leia.nextBoolean();

        System.out.println("*********************************************************");
        System.out.println("*                     RESULTADO                         *");
        System.out.println("*********************************************************");
        
         // Estrutura de decis�o
        if (idade >= 18) {
            System.out.println("* Acesso liberado para " + nome + "                   *");
        } 
        else if (idade < 18 && autorizacao == true) {
            System.out.println("* Acesso liberado com autoriza��o para " + nome + "   *");
        } 
        else {
            System.out.println("* Acesso NEGADO para " + nome + "                     *");
        }

        System.out.println("*********************************************************");

        leia.close();       
    }
}