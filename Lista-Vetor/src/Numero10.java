import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Numero10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe uma data: ");
		String data = entrada.next();
		String dataCompleta[] = data.split("/");

		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

		sdf.setLenient(false);
		try {
			sdf.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(Arrays.toString(dataCompleta));
		System.out.println(data);

		entrada.close();

	}
}
