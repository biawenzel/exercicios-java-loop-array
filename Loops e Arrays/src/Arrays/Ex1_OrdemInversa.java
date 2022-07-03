package Arrays;
/* Crie um vetor de 6 numeros inteiro e
mostre-os na ordem inversa.
 */

public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {5, -6, 89, 43, -9, 10};

        System.out.print("Vetor: ");
        int count = 0;
        while(count <= (vetor.length-1)) {
            System.out.print(vetor[count] + " "); //imprime o vetor na posição de count
            count++;
        }

        System.out.print("\nVetor inverso: ");
        for (int i = (vetor.length-1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

    }
}
