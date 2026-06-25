package aula_03_condicionais;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

        int codigo, quantidade;
        String produto = "";
        double valorTotal = 0;

        System.out.println("*********************************************************");
        System.out.println("*                      LANCHONETE                       *");
        System.out.println("*********************************************************");
        System.out.println("* Código * Produto              * Preço                 *");
        System.out.println("*-------------------------------------------------------*");
        System.out.println("*   1    * Cachorro Quente      * R$ 10,00              *");
        System.out.println("*   2    * X-Salada             * R$ 15,00              *");
        System.out.println("*   3    * X-Bacon              * R$ 18,00              *");
        System.out.println("*   4    * Bauru                * R$ 12,00              *");
        System.out.println("*   5    * Refrigerante         * R$  8,00              *");
        System.out.println("*   6    * Suco de Laranja      * R$ 13,00              *");
        System.out.println("*********************************************************");

        System.out.print("\nCódigo do Produto: ");
        codigo = leia.nextInt();

        System.out.print("Quantidade: ");
        quantidade = leia.nextInt();

        switch (codigo) {

            case 1:
                produto = "Cachorro Quente";
                valorTotal = quantidade * 10.00;
                break;

            case 2:
                produto = "X-Salada";
                valorTotal = quantidade * 15.00;
                break;

            case 3:
                produto = "X-Bacon";
                valorTotal = quantidade * 18.00;
                break;

            case 4:
                produto = "Bauru";
                valorTotal = quantidade * 12.00;
                break;

            case 5:
                produto = "Refrigerante";
                valorTotal = quantidade * 8.00;
                break;

            case 6:
                produto = "Suco de Laranja";
                valorTotal = quantidade * 13.00;
                break;

            default:
                System.out.println("\nCódigo de produto inválido!");
                leia.close();
                return;
        }

        System.out.println("\n*********************************************************");
        System.out.println("Produto: " + produto);
        System.out.printf("Valor Total: R$ %.2f%n", valorTotal);
        System.out.println("*********************************************************");

        leia.close();
    }
}