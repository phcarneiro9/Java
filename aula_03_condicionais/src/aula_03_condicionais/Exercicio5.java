package aula_03_condicionais;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

        String nome;
        String cargo = "";
        int codigo;
        double salario;
        double reajuste = 0;
        double novoSalario;

        System.out.println("*********************************************************");
        System.out.println("*                REAJUSTE DE SALÁRIO                    *");
        System.out.println("*********************************************************");
        System.out.println("* Código * Cargo              * Reajuste                *");
        System.out.println("*-------------------------------------------------------*");
        System.out.println("*   1    * Gerente            * 10%                     *");
        System.out.println("*   2    * Vendedor           *  7%                     *");
        System.out.println("*   3    * Supervisor         *  9%                     *");
        System.out.println("*   4    * Motorista          *  6%                     *");
        System.out.println("*   5    * Estoquista         *  5%                     *");
        System.out.println("*   6    * Técnico de TI      *  8%                     *");
        System.out.println("*********************************************************");

        System.out.print("\nNome do colaborador: ");
        nome = leia.nextLine();

        System.out.print("Código do cargo: ");
        codigo = leia.nextInt();

        System.out.print("Salário: R$ ");
        salario = leia.nextDouble();

        switch (codigo) {

            case 1:
                cargo = "Gerente";
                reajuste = 0.10;
                break;

            case 2:
                cargo = "Vendedor";
                reajuste = 0.07;
                break;

            case 3:
                cargo = "Supervisor";
                reajuste = 0.09;
                break;

            case 4:
                cargo = "Motorista";
                reajuste = 0.06;
                break;

            case 5:
                cargo = "Estoquista";
                reajuste = 0.05;
                break;

            case 6:
                cargo = "Técnico de TI";
                reajuste = 0.08;
                break;

            default:
                System.out.println("Código inválido!");
                leia.close();
                return;
        }

        novoSalario = salario + (salario * reajuste);

        System.out.println("\n*********************************************************");
        System.out.println("Nome do colaborador: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.printf("Salário reajustado: R$ %.2f%n", novoSalario);
        System.out.println("*********************************************************");

        leia.close();
    }
}