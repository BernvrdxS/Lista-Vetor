
import java.util.Scanner;

public class Numero06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		final int lengthAluno = 10;
		final int lengthNota = 4;
		int i = 0;
		int x;
		int alunos = 0;
		float media = 0, soma = 0;

		for (i = 0; i < lengthAluno; i++) {
			System.out.println("Insira as quatro notas desse aluno!");

			float nota[] = new float[lengthNota];
			for (x = 0; x < lengthNota; x++) {
				System.out.printf("Nota " + (x + 1) + ": ");
				nota[x] = entrada.nextFloat();
				soma = soma + nota[x];
			}

			media = soma / lengthNota;
			soma = 0;
			System.out.println("A m�dia desse aluno �: " + media);

			if (media >= 7) {
				alunos++;
			}
		}
		System.out.println("O n�mero de alunos com m�dia maior ou igual a 7.0 �: " + alunos);

		entrada.close();
	}
}
