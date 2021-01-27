package Turma15;
import java.util.Scanner;
public class Ex8L1 {
	public static void main(String args[]) 
	{
		float custFab, percentImp, percentDist,custCons;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o valor do custo de fabrica: ");
		custFab = ler.nextFloat();
		
		percentImp = (float) 0.28 * custFab;
		percentDist =(float) 0.45 * custFab;
		
		custCons = (float) custFab + percentImp + percentDist;
		
		System.out.printf("O preço do carro é : R$ %2.2f ", custCons);
		
	}
	

}
