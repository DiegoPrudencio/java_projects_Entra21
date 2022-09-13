import java.util.Scanner;

public class CalcularMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double nota, resposta;
		double somarNotas = 0;
		double media = 0;
		byte contador = 0;
		
		
		do {
			
			Scanner tc = new Scanner(System.in);
			
			System.out.println("Digite uma nota: ");
			nota = tc.nextDouble();
			
			if (nota >= 0 && nota <= 10) {
				somarNotas = somarNotas + nota;
				contador++;
				
			} else {
				System.out.println("Essa nota não é válida, ensira uma nota válida.");
			}
			
		} while (continaurCalculando());
		
		
		media = somarNotas/contador;
		System.out.println("A média das notas é " + media);
		
		
	}
	
	static boolean continaurCalculando() {
		
		double resposta;
		boolean devoContinuar = true;
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Deseja adicionar outra nota? 1 - s / 2 - n ");
		resposta = tc.nextDouble();
		
		if (resposta == 1) {
			devoContinuar = true;
			
		} else if (resposta == 2) {
			devoContinuar = false;
			
		} else {
			System.out.println("Essa opção não é válida.");
		}
		
		return devoContinuar;
	

	}
	

}
