import java.util.Scanner;

public class Numero02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int vetor[] = new int[10];

		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Informe os valores do vetor: ", (i + 1));
			vetor[i] = entrada.nextInt();
		}

		for (int i = 9; i >= 0; i--) {
			System.out.println(vetor[i]);
		}

		entrada.close();
	}
}
