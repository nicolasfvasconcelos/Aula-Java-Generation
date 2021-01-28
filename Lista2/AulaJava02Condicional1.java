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
		System.out.printf("\nA media é: %2.2f ", media);
		
		
		if(media >=7 && media<=10) 
			{
				System.out.println("\nSITUAÇÃO: APROVADO!!!");
			}
		
			else if(media <7 && media >=5) 
			{
			System.out.println("\nSITUAÇÃO: RECUPERAÇÃO!!! ");
			}
			
			else if (media <5 && media >=0) 
			{
			System.out.println("\nSITUAÇÃO: REPROVADO!!! ESTUDE MAIS DA PRÓXIMA VEZ!!");
			}
			
			else 
			{
			System.out.println("\nAlgo errado não está certo! Verifique se os valores digitados estão compreendidos entre 0 e 10!");
			}
				
		}	

	}

}
