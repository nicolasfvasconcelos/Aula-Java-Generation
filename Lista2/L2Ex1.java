package Turma15;
import java.util.Scanner;
public class L2Ex1 {
	public static void main(String args[]) 
	{
		float n1, n2, n3;
		
		Scanner ler = new Scanner(System.in);
		 System.out.println("Entre com o primeiro n�mero: ");
		 n1 = ler.nextFloat();
		 System.out.println("Entre com o segundo n�mero: ");
		 n2 = ler.nextFloat();
		 System.out.println("Entre com o terceiro n�mero: ");
		 n3 = ler.nextFloat();
		 
		 if (n1 > n2 && n1 > n3)
		 {
			 System.out.println("O primeiro n�mero � o maior valor digitado! \nN�mero: "+ n1);	 
		 }
		 
		 else if (n2 > n1 && n2 > n3) 
		 {
			 System.out.println("O segundo n�mero � o maior valor digitado! \nN�mero: "+ n2);
		 }
		 
		 else if (n3>n2 && n3>n1)
		 {
			 System.out.println("O terceiro n�mero � o maior valor digitado! \nN�mero: "+ n3);
		 }
		 
		
	}
}
