package Aula_02_operadores;

import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float SalárioBruto;
		float AdicionalNoturno;
		float HorasExtras;
		float Descontos;
		float SalárioLiquido;
		
		System.out.print("Digite o Salário Bruto:");
		SalárioBruto = leia.nextFloat();
		
		System.out.print("Digite o Adicional Noturno:");
		AdicionalNoturno = leia.nextFloat();
		
		System.out.print("Digite as Horas Extras:");
		HorasExtras = leia.nextFloat();

		System.out.print("Digite os Descontos:");
		Descontos = leia.nextFloat();
		
		SalárioLiquido = SalárioBruto + AdicionalNoturno + (HorasExtras * 5) - Descontos;

        System.out.print("\nSalário Líquido: " + SalárioLiquido);

        leia.close();

	}

}
