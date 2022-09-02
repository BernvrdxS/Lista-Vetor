import java.util.Scanner;

public class Numero13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int i = 0;
		int j = 0;
		int vetor[] = new int[10];
		int segundoVetor[] = new int[10];
		int terceiroVetor[] = new int[20];

		for (i = 0; i < 10; i++) {
			System.out.println("Informe um número para o primeiro vetor : ");
			vetor[i] = Integer.parseInt(entrada.nextLine());
		}
		for (i = 0; i < 10; i++) {
			System.out.println("Informe um número para o segundo vetor : ");
			segundoVetor[i] = Integer.parseInt(entrada.nextLine());
		}
		for (i = 0; i < 10; i++) {
			terceiroVetor[j] = vetor[i];
			j++;
			terceiroVetor[j] = segundoVetor[i];
			j++;
		}
		System.out.println("O vetor 3 será composto pelos elementos: ");
		for (i = 0; i < 20; i++) {
			System.out.println(terceiroVetor[i]);
		}
		entrada.close();
	}

}
