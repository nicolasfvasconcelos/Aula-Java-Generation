package Turma15;
import java.util.Scanner;
public class Ex3L1 {
	public static void main(String args []) 
	{
		int hora, minuto, segundo, evento;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe a dura��o do Evento (em segundos): ");
		evento = ler.nextInt();
		hora = evento/3600;
		minuto = (evento%3600)/60;
		segundo = (evento%360)%60;
		
		System.out.println("A dura��o do evento �: " + hora + " hora(s), " + minuto + " minuto(s) e " + segundo + " segundo(s)");
	}

}
