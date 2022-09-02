import java.util.Arrays;
import java.util.Scanner;

public class Numero11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe várias palavras.");
		String palavras = entrada.next();
		String separadas[] = palavras.split(";");

		System.out.println(Arrays.toString(separadas));

		entrada.close();
	}
}
