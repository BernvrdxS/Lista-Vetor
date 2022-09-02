import java.util.Scanner;
import java.util.Arrays;

public class Numero01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int numero = 5;
		int vetor[] = new int[numero];
		int i;

		for (i = 0; i < numero; i++) {
			System.out.printf("Informe os valores do vetor: ", (i + 1), numero);
			vetor[i] = entrada.nextInt();
		}
		System.out.println("Os valores do vetor são: " + Arrays.toString(vetor));

		entrada.close();
	}
}