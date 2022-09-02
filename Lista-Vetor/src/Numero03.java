import java.util.Scanner;

public class Numero03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe quantas notas.");
		int numero = entrada.nextInt();
		int vetor[] = new int[numero];
		int i;

		for (i = 0; i < numero; i++) {
			System.out.print("Informe suas notas: ");
			vetor[i] = entrada.nextInt();
		}

		float soma = 0;
		float media = 0;

		for (i = 0; i < numero; i++) {
			soma = soma + vetor[i];
			media = soma / numero;
		}

		System.out.println("As notas informadas são: " + i);
		System.out.println("A média das notas é: " + media);

		entrada.close();
	}
}
