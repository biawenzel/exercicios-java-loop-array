package Loops;
/* Faça um programa que leia conjuntos de 1 valores,
* o 1º sendo nome do aluno e o 2º sendo sua idade.
* (Pare o programa inserindo o valor 0 no campo nome) */

import java.util.Scanner;

public class Ex1_NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //scanner vai ler

        String nome;
        int idade;

        while (true) {
            System.out.println("Nome: ");
            nome = scan.next(); //mét next retorna uma string
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt(); //nextInt pq é int
        }

        System.out.println("Continue aqui...");

    }
}
