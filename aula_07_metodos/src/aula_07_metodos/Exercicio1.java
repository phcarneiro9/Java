package aula_07_metodos;

import java.util.Scanner;

public class Exercicio1 {

    public static void analisarNumeros(int[] numeros) {

        int soma = 0;
        int maior = numeros[0];

        for (int numero : numeros) {

            soma += numero;

            if (numero > maior) {
                maior = numero;
            }
        }

        double media = (double) soma / numeros.length;

        System.out.println("Soma: " + soma);
        System.out.println("M�dia: " + media);
        System.out.println("Maior valor: " + maior);
    }

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o n�mero " + (i + 1) + ": ");
            numeros[i] = leia.nextInt();
        }

        analisarNumeros(numeros);

        leia.close();
    }
}