package Turma15;
import java.util.Scanner;
public class Ex4L1 {
	
	public static void main(String args []) 
	{
		int A, B, C, D;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println(" Entre com um número inteiro (A): ");
		A = ler.nextInt();
		System.out.println("Entre com mais um número inteiro (B): ");
		B = ler.nextInt();
		System.out.println("Entre com o último número inteiro (C): ");
		C = ler.nextInt();
		
		D =(int)((Math.pow((A+B), 2)) + (Math.pow((B+C), 2)))/2;
		
		System.out.println("A variável D é: "+ D);
		
	}

}
