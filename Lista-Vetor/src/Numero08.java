import java.util.Random;
import java.util.Scanner;

public class Numero08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random random = new Random();

		String senha = "";
		char LetraRand;
		int senhaTam = 0;

		do {
			System.out.println("Informe a quantidade de caracteres para a senha: ");
			senhaTam = entrada.nextInt();
		} while (senhaTam > 26);

		char alfabeto[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

		int i, l = alfabeto.length;

		for (i = 0; i < senhaTam; i++) {
			if (i % 2 == 0) {
				do {
					LetraRand = alfabeto[random.nextInt(26)];
				} while ((LetraRand == 'a') || (LetraRand == 'e') || (LetraRand == 'i') || (LetraRand == 'o')
						|| (LetraRand == 'u'));
				senha = senha + LetraRand;
			} else {
				do {
					LetraRand = alfabeto[random.nextInt(26)];
				} while ((LetraRand != 'a') && (LetraRand != 'e') && (LetraRand != 'i') && (LetraRand != 'o')
						&& (LetraRand != 'u'));
				senha = senha + LetraRand;
			}
		}
		System.out.println("Sua senha é: " + senha);
		entrada.close();

	}
}
