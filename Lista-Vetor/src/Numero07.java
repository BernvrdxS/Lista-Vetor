import java.util.Arrays;
import java.util.Scanner;

public class Numero07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		{

			int n = 5;
			int numeros[];
			numeros = new int[n];
			int i;

			for (i = 0; i < n; i++) {
				System.out.print("Informe os n�meros inteiros: ");
				numeros[i] = entrada.nextInt();
			}

			int soma = 0;
			int multi = 0;

			for (i = 0; i < n; i++) {
				soma = soma + numeros[i];
			}

			for (i = 0; i < n; i++) {
				multi = numeros[i] * numeros[i];
			}

			System.out.println("Os n�meros informados foram: " + Arrays.toString(numeros));
			System.out.println("A soma dos n�meros �: " + soma);
			System.out.println("A multiplica��o dos n�meros �: " + multi);

			entrada.close();

		}

	}
}