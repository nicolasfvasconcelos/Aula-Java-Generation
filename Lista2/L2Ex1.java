package Turma15;
import java.util.Scanner;
public class L2Ex1 {
	public static void main(String args[]) 
	{
		float n1, n2, n3;
		
		Scanner ler = new Scanner(System.in);
		 System.out.println("Entre com o primeiro número: ");
		 n1 = ler.nextFloat();
		 System.out.println("Entre com o segundo número: ");
		 n2 = ler.nextFloat();
		 System.out.println("Entre com o terceiro número: ");
		 n3 = ler.nextFloat();
		 
		 if (n1 > n2 && n1 > n3)
		 {
			 System.out.println("O primeiro número é o maior valor digitado! \nNúmero: "+ n1);	 
		 }
		 
		 else if (n2 > n1 && n2 > n3) 
		 {
			 System.out.println("O segundo número é o maior valor digitado! \nNúmero: "+ n2);
		 }
		 
		 else if (n3>n2 && n3>n1)
		 {
			 System.out.println("O terceiro número é o maior valor digitado! \nNúmero: "+ n3);
		 }
		 
		
	}
}
