package Turma15;

import java.util.Scanner;

public class L4Ex1 {

	public static void main (String args []) 
	{
		int maior, menor, n;
		int vet[] = new int [5]; 
		
		Scanner ler = new Scanner(System.in);
		
		for (n=0; n<5;n++) 
		{
			menor = n;
			maior = n;
			System.out.printf("\n Digite o %d ° número: ", (n+1));
			vet[n] = ler.nextInt();
		}
		menor = vet[0];
		maior = vet[0];
		
		for(n=0; n<5; n++)
		{
			
			if(vet[n] < menor) 
			{
				menor = vet[n];		
			}
			if (vet[n] > maior) 
			{
				maior = vet[n];
			}
			 
		}
		 for (n=0; n<5; n++)
		 {
			 if (vet[n] == menor) { System.out.printf("\n Vetor[%d] = %d ---> MENOR VALOR", n,vet[n]);}
			 if (vet[n] == maior) {System.out.printf("\n Vetor[%d] = %d ---> MAIOR VALOR", n,vet[n]);}
			 else if (vet[n] != maior && vet[n] != menor){System.out.printf("\n Vetor[%d] = %d ---> VALOR COMUM", n,vet[n]);}
		 }
	}
}
