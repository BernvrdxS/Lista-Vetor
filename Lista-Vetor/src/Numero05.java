import java.util.Scanner;

public class Numero05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int vetorPar = 0;
		int vetorImpar = 0;
		final int TAM = 20;
		int b;

		int[] num = new int[TAM];

		for (b = 0; b < TAM; b++) {
			System.out.println("Insira 20 números: ");
			num[b] = entrada.nextInt();
		}

		System.out.print("Números armazenados no vetor: ");
		for (b = 0; b < TAM; b++) {
			if (num[b] % 2 == 0) {
				vetorPar++;

			} else if (num[b] % 2 != 0) {
				vetorImpar++;
			}
			System.out.print(num[b] + " ");

		}

		int[] par = new int[vetorPar];
		int[] impar = new int[vetorImpar];

		int numPar = 0;
		int numImpar = 0;

		for (b = 0; b < TAM; b++) {
			if (num[b] % 2 == 0) {
				par[numPar] = num[b];
				numPar++;
			} else if (num[b] % 2 != 0) {
				impar[numImpar] = num[b];
				numImpar++;
			}
		}
		System.out.println();
		System.out.print("Números armazenados no vetor dos pares: ");
		for (int i : par) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("Números armazenados no vetor dos ímpares: ");
		for (int i : impar) {
			System.out.print(i + " ");
		}
		entrada.close();
	}

}
