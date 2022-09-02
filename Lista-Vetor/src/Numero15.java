import java.util.Scanner;

public class Numero15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		final int TAM = 5;
		int valores[] = new int[TAM];

		for (int i = 0; i < TAM; i++) {
			do {
				System.out.println("Informe um valor de 0 a 20: ");
				valores[i] = entrada.nextInt();

			} while ((valores[i] <= 0) || (valores[i] >= 20));
		}

		String texto = "#";

		for (int i = 0; i < TAM; i++) {
			System.out.println(valores[i] + ": " + texto.repeat(valores[i]));
		}

	}

}
