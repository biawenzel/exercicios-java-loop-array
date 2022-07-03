package Arrays;
/* Faça um programa que leia 20 numeros inteiros
aleatórios (entre 0 e 100), armazene-os num vetor.
Ao final, mostre os numeros e seus sucessores.
 */

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random(); //classe Random que cria numeros aleatorios

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Numeros aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.print("\nSucessores dos numeros: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }
    }
}
