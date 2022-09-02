import java.util.Scanner;

public class Numero14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		final int TAM = 3;
		int idades[] = new int[TAM];
		float alturas[] = new float[TAM];
		float soma = 0;

		for (int i = 0; i < TAM; i++) {
			System.out.print("Informe sua idade: ");
			idades[i] = entrada.nextInt();
			System.out.print("Informe sua altura: ");
			alturas[i] = entrada.nextFloat();
			soma = soma + alturas[i];
		}

		float mediaAltura = (soma / TAM);
		System.out.println(mediaAltura);

		int qntAlunos = 0;

		for (int i = 0; i < TAM; i++) {
			if ((idades[i] > 13) && (alturas[i] < mediaAltura)) {
				qntAlunos = qntAlunos + 1;
			}
		}

		System.out.println("A quantidade de alunos com mais de 13 anos inferior à média de altura é: " + qntAlunos);

		entrada.close();

	}
}
