package Turma15;

import java.util.Scanner;
public class L2Ex3Case {
	
	public static void main(String args []) 
	{
		int idade, op;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a op��o correspondente com a sua faixa de idade para saber sua categoria: \n (1) de 10 a 14 anos \n (2) de 15 a 17 anos \n (3) de 18 a 25 anos \n (4) Minha faixa de idade n�o aparece! ");
		op = ler.nextInt();
		
	switch	(op) {
	case 1:
		System.out.println("Sua categoria � INFANTIL!");
		break;
		
	case 2:
		System.out.println("Sua categoria � JUVENIL!");
		break;
		
	case 3:
		System.out.println("Sua categoria � ADULTO!");
		break;
		
	case 4: 
		System.out.println("Sua idade n�o est� categorizada! Por favor, converse com o respons�vel!");
		break;
		
		default:
			
			System.out.println("Op��o inv�lida! Por favor, tente novamente!");
	}
			
	}

}
