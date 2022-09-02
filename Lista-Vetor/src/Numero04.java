import java.util.Scanner;

public class Numero04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner entrada = new Scanner(System.in);
	    
		char[] vet = {'a','b','c', 'd', 'e','f','g','h','i','j'};
		int countCons = 0;
	
				
		for(int i=0; i < vet.length; i++){
			if((vet[i] != 'a') && (vet[i] != 'e') && (vet[i] != 'i') &&
				(vet[i] != 'o') && (vet[i] != 'u')){
				countCons = countCons + 1;
				System.out.println(vet[i]);
	
			}
			
				System.out.println("Número de Consoantes: ");
	System.out.println(countCons);
	
	entrada.close();
	    }
	    

	}
}
	    
	
