import java.util.Arrays;
import java.util.Scanner;

public class Numero12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in); 

		final int TAM = 3;
		int idade[] = new int [TAM];
		float altura[] = new float [TAM];
		int idadeMaisNova = 99;
		int idadeMaisVelha = 0;
		float maisAlto = 0;
		float maisBaixo = 0;
		float mediaAltura = 0;
		float mediaIdade = 0;
		float somaAltura = 0;
		float somaIdade = 0;
		float mediaIDAcima = 0;
		float mediaIDAbaixo = 0;
		float mediaAltAcima = 0;
		float mediaAltAbaixo = 0;
		
		for (int i = 0; i < TAM; i++) {
			System.out.print("Digite sua idade: ");
			idade[i] = entrada.nextInt();
			System.out.print("Informe sua altura: ");
			altura[i] = entrada.nextFloat();
			

		somaAltura = somaAltura + altura[i];
		somaIdade = somaIdade + idade[i];
		}
		
		mediaAltura = somaAltura / TAM;
		mediaIdade = somaIdade / TAM ;
		
		for (int i = 0; i < TAM; i++) {
            if (idade[i] < idadeMaisNova) {
                idadeMaisNova = idade[i];
            }
            if (idade[i] > idadeMaisVelha) {
                idadeMaisVelha = idade[i];
            }            
		}
        for ( int i = 0; i < TAM; i++) {
        	if (altura[i] < maisBaixo) {
        		maisBaixo = altura[i];
        	}
        	if (altura[i] > maisAlto) {
        		maisAlto = altura[i];
        	}
        }
		for (int i = 0; i < TAM; i++) {
            if (idade[i] < mediaIdade) {
                mediaIDAbaixo = idade[i];
            }
            else {
            	mediaIDAcima = idade[i];
                }
		}
		for (int i = 0; i < TAM; i++) {
            if (altura[i] < mediaAltura) {
            	mediaAltAbaixo = altura[i];
            }
            else {
            	mediaAltAcima = altura[i];
                }
		}
        
        

            
        	System.out.println("Ordem lida: ");
        	System.out.println("As idades dos usu�rios s�o: "+Arrays.toString(idade));
        	System.out.println("As alturas dos usu�rios s�o: "+Arrays.toString(altura));
        	System.out.println("A pessoa mais baixa informada, tem: " +maisBaixo+ "metro(s) de altura");
        	System.out.println("A pessoa mais alta informada, tem: " +maisAlto+ "metro(s) de altura");

			System.out.println("Ordem inversa: ");
			System.out.println("As alturas dos usu�riso s�o: "+Arrays.toString(altura));
			System.out.println("As idades dos usu�rios s�o: "+Arrays.toString(idade));
			System.out.println("A pessoa mais baixa informada, tem: " +maisBaixo+ "metro(s) de altura");
        	System.out.println("A pessoa mais alta informada, tem: " +maisAlto+ "metro(s) de altura");
        	System.out.println("As pessoas que est�o acima da m�dia de altura s�o: "+mediaAltAcima);
        	System.out.println("As pessoas que est�o abaixo da m�dia de altura s�o: "+mediaAltAbaixo);
        	System.out.println("As pessoas que est�o acima da m�dia de idade s�o: "+mediaIDAcima);
        	System.out.println("As pessoas que est�o abaixo da m�dia de idade s�o: "+mediaIDAbaixo);
        	
        	entrada.close();
	}
	
}

