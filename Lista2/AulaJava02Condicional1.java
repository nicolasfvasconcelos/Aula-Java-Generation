package Turma15;

import java.util.Scanner;

public class AulaJava02Condicional1 {
	public static void main (String [] args)
	{
		float n1, n2, n3, media;
		try (Scanner mandaAi = new Scanner(System.in)) {
			System.out.println("Digite sua primeira nota: ");
			n1 = mandaAi.nextFloat();
			System.out.println("Digite sua segunda nota: ");
			n2 = mandaAi.nextFloat();
			System.out.println("Digite sua terceira nota: ");
			n3 = mandaAi.nextFloat();
	
		
		media = (n1+n2+n3)/3;
		System.out.printf("\nA media �: %2.2f ", media);
		
		
		if(media >=7 && media<=10) 
			{
				System.out.println("\nSITUA��O: APROVADO!!!");
			}
		
			else if(media <7 && media >=5) 
			{
			System.out.println("\nSITUA��O: RECUPERA��O!!! ");
			}
			
			else if (media <5 && media >=0) 
			{
			System.out.println("\nSITUA��O: REPROVADO!!! ESTUDE MAIS DA PR�XIMA VEZ!!");
			}
			
			else 
			{
			System.out.println("\nAlgo errado n�o est� certo! Verifique se os valores digitados est�o compreendidos entre 0 e 10!");
			}
				
		}	

	}

}
