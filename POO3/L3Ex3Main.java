package Turma15_POO3;

public class L3Ex3Main {
	
	public static void main(String args []) {
	
	// criando objetos das classes n�o abstratas
	
	L3Ex2Cachorro dog = new L3Ex2Cachorro();
	L3Ex1Cavalo horse = new L3Ex1Cavalo();
	L3Ex1Preguica sloth = new L3Ex1Preguica();
	
	//come�ando a trabalhar com as informa��es
	dog.setNome("Cachorro");
	dog.setIdade(10);
	System.out.println("*****Ficha de Animais*****");
	System.out.println("--------------------------");
	System.out.println("Animal: " +dog.getNome());
	System.out.println("Idade: "+ dog.getIdade());
	System.out.println("Modo de locomo��o: ");dog.locomocao();
	System.out.println("Som que emite: "); dog.som();
	System.out.println("--------------------------");
	System.out.println("");
	
	horse.setNome("Cavalo");
	horse.setIdade(20);
	System.out.println("*****Ficha de Animais*****");
	System.out.println("--------------------------");
	System.out.println("Animal: " + horse.getNome()); 
	System.out.println("Idade: "+ horse.getIdade());
	System.out.println("Modo de locomo��o: "); horse.locomocao();
	System.out.println("Som que emite: "); horse.som();
	System.out.println("--------------------------");
	System.out.println("");
	
	sloth.setNome("Pregui�a");
	sloth.setIdade(20);
	System.out.println("*****Ficha de Animais*****");
	System.out.println("--------------------------");
	System.out.println("Animal: " +sloth.getNome()); 
	System.out.println("Idade: "+sloth.getIdade()); 
	System.out.println("Modo de locomo��o: "); sloth.locomocao();
	System.out.println("Som que emite: "); sloth.som();
	System.out.println("--------------------------");
	
	}
}
