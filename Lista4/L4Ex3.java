package Turma15;

import java.util.Scanner;

public class L4Ex3 {
	
	public static void main(String args []) 
	
	{
		int[][] n1 = new int[4][6]; int [][] n2 = new int [4][6];
		int[][] m1 = new int[4][6]; int [][] m2 = new int [4][6];
		int linha = 4, coluna = 6, i, j; 
		
		Scanner leia = new Scanner(System.in);
		
		// Lendo as matrizes N1 e N2
		
		for(i=0;i<linha;i++)
		{
			for(j=0;j<coluna;j++) 
			{
				System.out.printf("Entre com a matrz N1[%d][%d]: ", (i+1), (j+1));
				n1[i][j] = leia.nextInt();
			}
		}
		
		for(i=0;i<linha;i++)
		{
			for(j=0;j<coluna;j++) 
			{
				System.out.printf("Entre com a matrz N2[%d][%d]: ", (i+1), (j+1));
				n2[i][j] = leia.nextInt();
			}
		}
		
		// Mostrando as matrizes N1 e N2
		
		System.out.println("\n N1 = ");
		for(i=0;i<linha;i++)
		{
			
			for(j=0;j<coluna;j++) 
			{
				
			System.out.printf(" %d ", n1[i][j]);				
		}
	}
		System.out.println("\n N2 = ");
		for(i=0;i<linha;i++)
		{
			
			for(j=0;j<coluna;j++) 
			{
				
			System.out.printf(" %d ", n2[i][j]);				
		}
	}
		
		// Fazendo a soma das matrizes
		for(i=0;i<linha;i++)
		{
			
			for(j=0;j<coluna;j++) 
			{
		
			m1[i][j] = n1[i][j] + n2[i][j];				
		}
	}
		// mostrando matriz soma
		
		System.out.println("\n M1= ");
		for(i=0;i<linha;i++)
		{
			
			for(j=0;j<coluna;j++) 
			{
				
			System.out.printf(" %d ", m1[i][j]);				
		}
	}
		
		// Fazendo a subtração das matrizes
				for(i=0;i<linha;i++)
				{
					
					for(j=0;j<coluna;j++) 
					{
				
					m2[i][j] = n1[i][j] - n2[i][j];				
				}
			}
				// mostrando matriz subtração
				
				System.out.println("\n M2= ");
				for(i=0;i<linha;i++)
				{
					
					for(j=0;j<coluna;j++) 
					{
						
					System.out.printf(" %d ", m2[i][j]);				
				}
			}
		
  }
}