package Turma15;

import java.util.Scanner;
public class L4Ex4 {
	public static void main(String args []) 
	{
		int[][] M = new int[3][3];
		int linha=3, coluna=3, i, j;
		
		Scanner ler = new Scanner(System.in);
		
		// Lendo os números da matriz
		
		System.out.println("Entre com os números da Matriz: ");
		for (i = 0; i<coluna; i++)
		{
			for (j =0; j<coluna; j++)
			{
				System.out.println("M[ " + (i+1)+" ][ " +(j+1)+ "]: ");
				M[i][j] = ler.nextInt();
			}
		}
		// exibindo a diagonal principal pela condição do if
		
		System.out.println("A diagonal principal da Matriz é: ");
		
		for (i= 0; i <linha; i++) 
		{
			for (j=0; j<coluna; j ++)
			{
				if (i == j) 
				{	
					System.out.println("\t" + M[i][j]);
				}
			}
		}
	}
	

}
 