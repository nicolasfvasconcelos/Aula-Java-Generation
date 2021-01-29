package Turma15;

import java.util.Scanner;
public class L3Ex2 {

	public static void main (String args []) 
	{
		int x, num, par, impar, contPar=0, contImpar=0;
		
		Scanner ler = new Scanner(System.in);
		
		for (x = 1; x <= 10; x++) 
		{
			System.out.println("Digite DEZ números: ");
			num = ler.nextInt();
			if (num%2 ==0) 
			{
				contPar = contPar + 1;
			}
			else  
			{
				contImpar = contImpar + 1;
			}
		}
		System.out.println("A quantida de números PARES digitados é: "+ contPar );
		System.out.println("A quantidade de números IMPARES digitados é: " + contImpar);
	}
}
