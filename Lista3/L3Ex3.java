package Turma15;

import java.util.Scanner;

public class L3Ex3 {
	
	public static void main(String args []) 
	{
		int idade = 0, menos = 0, mais =0;
		
		Scanner ler = new Scanner(System.in);
		
		
		while (idade != -99) 
		{
			System.out.println("Digite sua sua serie de idades: ");
			idade = ler.nextInt();
			
			if (idade >= 0 && idade < 21) 
			{
				menos = menos + 1;
			}
			else if (idade > 50 ) 
			{
				mais = mais + 1;
			}
		}
		System.out.println("Quantidade de pessoas com menos de 21 anos: " + menos);
		System.out.println("QUantidade de pessoas com mais de 50 anos: "+ mais);
	}

}
