package Turma15;

import java.util.Scanner;

public class L4Ex2 {
	
		
		public static void main(String args [] ) 
		
		{
			int cont =0, n, soma = 0; 
			float media=0;
			int dado[] = new int[10];
			Scanner leia = new Scanner(System.in);
			for(n=0; n<10; n++) 
			{
				do {
				System.out.println("Digite a face do dado que está para cima: ");
				dado[n]= leia.nextInt();
				}
				while (dado[n] > 6 || dado[n] <1);
			}
			
			for(n=0; n<10; n++) 
			{
				soma = soma + dado[n];
			}
			
			for(n=0; n<10; n++) 
			{
				
				if (dado[n] ==6) {cont++;  }
			}
			
			media = (float) soma/10;
			for(n=0; n<10; n++) 
			{
				for(n=0; n<10; n++) 
				{
					System.out.println("Vet["+n+"] = "+ dado[n]);
				}
			}
			System.out.printf("Média: %2.2f ", media);
			System.out.println("\n O maior número apareceu " + cont + " vezes!");
			
		

	}

}
