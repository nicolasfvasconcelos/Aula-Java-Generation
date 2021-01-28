package Turma15;

import java.util.Scanner;
public class L2Ex3Case {
	
	public static void main(String args []) 
	{
		int idade, op;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a opção correspondente com a sua faixa de idade para saber sua categoria: \n (1) de 10 a 14 anos \n (2) de 15 a 17 anos \n (3) de 18 a 25 anos \n (4) Minha faixa de idade não aparece! ");
		op = ler.nextInt();
		
	switch	(op) {
	case 1:
		System.out.println("Sua categoria é INFANTIL!");
		break;
		
	case 2:
		System.out.println("Sua categoria é JUVENIL!");
		break;
		
	case 3:
		System.out.println("Sua categoria é ADULTO!");
		break;
		
	case 4: 
		System.out.println("Sua idade não está categorizada! Por favor, converse com o responsável!");
		break;
		
		default:
			
			System.out.println("Opção inválida! Por favor, tente novamente!");
	}
			
	}

}
