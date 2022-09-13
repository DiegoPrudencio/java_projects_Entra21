package calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	double num1, num2, soma, subtracao, multiplicacao, divisao;
	int operacao;
	
	
	Scanner numberIn = new Scanner(System.in);
	
	System.out.println("Digite um número: ");
		num1 = numberIn.nextDouble();
		
	System.out.println("Digite outro número: ");
		num2 = numberIn.nextDouble();
	
	
	System.out.println("Qual operação você deseja fazer? 1. + | 2. - | 3. * | 4. / ");
		operacao = numberIn.nextInt();
	
		
		switch (operacao) {
		case 1: {
			soma = num1 + num2;
			System.out.println("A soma é: " + soma);
			break;
		}
		case 2: {
			subtracao = num1 - num2;
			System.out.println("A subtração é: " + subtracao);
			break;
		}
		case 3: {
			multiplicacao = num1 * num2;
			System.out.println("A multiplicação é: " + multiplicacao);
			break;
		}
		case 4: {
			divisao = num1 / num2;
			System.out.println("A divisão é: " + divisao);
			break;
		}
		default:
			System.out.println("Essa escolha não é válida");
		}
		
		numberIn.close();
	}

}
