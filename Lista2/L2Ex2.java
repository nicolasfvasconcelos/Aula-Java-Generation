package Turma15;
import java.util.Scanner;
public class L2Ex2 {
	public static void main(String args [])
	{
		float n1,n2,n3;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		n1 = ler.nextFloat();
		System.out.println("Digite o segundo número: ");
		n2 = ler.nextFloat();
		System.out.println("Digite o terceiro número: ");
		n3 = ler.nextFloat();
		
		if (n1 < n2 && n2 < n3) 
		{
			System.out.println("\nOrdem crescente: ");
			System.out.println("\n" + n1 + ", " + n2 + ", " + n3);
		}
				
		else if( n1 < n3 && n3 < n2)
		{
			System.out.println("\nOrdem crescente: ");
			System.out.println("\n" + n1 + ", " + n3 + ", " + n2);
		}
		
		else if(n2 < n1 && n1 < n3)
		{
			System.out.println("\nOrdem crescente: ");
			System.out.println("\n" + n2 + ", " + n1 + ", " + n3);
		}
		
		else if(n2 < n3 && n3 < n1)
		{
			System.out.println("\nOrdem crescente: ");
			System.out.println("\n" + n2 + ", " + n3 + ", " + n1);
		}
		
		else if(n3 < n1 && n1 < n2)
		{
			System.out.println("\nOrdem crescente: ");
			System.out.println("\n" + n3 + ", " + n1 + ", " + n2);
		}
		
		else if(n3 < n2 && n2 < n1)
		{
			System.out.println("\nOrdem crescente: ");
			System.out.println("\n" + n3 + ", " + n2 + ", " + n1);
		}
	}

}
