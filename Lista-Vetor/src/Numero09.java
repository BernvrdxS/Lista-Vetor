import java.util.Arrays;
import java.util.Scanner;

public class Numero09 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe um texto: ");
		String texto = entrada.nextLine();

		char letras[] = new char[texto.length()];

		for (int i = 0; i < letras.length; i++) {
			letras[i] = texto.charAt(i);

		}
		System.out.println(texto);
		System.out.println(Arrays.toString(letras));

		entrada.close();

	}

}
