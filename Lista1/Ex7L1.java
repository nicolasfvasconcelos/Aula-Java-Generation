package Turma15;
import java.util.Scanner;
public class Ex7L1 {
public static void main(String args []) 
{
	float a,b,c,d,e,f,x,y;
	
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Digite o coeficiente A: ");
	a = ler.nextFloat();
	System.out.println("Digite o coeficiente B: ");
	b = ler.nextFloat();
	System.out.println("Digite o coeficiente C: ");
	c = ler.nextFloat();
	System.out.println("Digite o coeficiente D: ");
	d = ler.nextFloat();
	System.out.println("Digite o coeficiente E: ");
	e = ler.nextFloat();
	System.out.println("Digite o coeficiente F: ");
	f = ler.nextFloat();
	
	x = ((c*e)-(b*f))/((a*e)-(b*d));
	y = ((a*f)-(c*d))/((a*e)-(b*d));
	
	System.out.println("\nX = "+ x);
	System.out.println("\nY = "+ y);
}
}
