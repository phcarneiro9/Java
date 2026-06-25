package aula_07_metodos;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        ArrayList<String> alunos = new ArrayList<>();
        ArrayList<Integer> idades = new ArrayList<>();
        ArrayList<Double> notas = new ArrayList<>();

        double soma = 0;
        int quantidade = 3;

        for (int i = 0; i < quantidade; i++) {

            System.out.println("Aluno " + (i + 1));

            System.out.print("Nome: ");
            alunos.add(leia.next());

            System.out.print("Idade: ");
            idades.add(leia.nextInt());

            System.out.print("Nota final: ");
            notas.add(leia.nextDouble());

            soma += notas.get(i);
        }

        System.out.println("\nAlunos cadastrados:");

        for (int i = 0; i < quantidade; i++) {

            System.out.println("Nome: " + alunos.get(i));
            System.out.println("Idade: " + idades.get(i));
            System.out.println("Nota: " + notas.get(i));
            System.out.println();
        }

        double media = soma / quantidade;

        System.out.println("Media geral das notas: " + media);

        leia.close();
    }
}
