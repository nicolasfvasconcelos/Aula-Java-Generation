package Turma15_POO3;

public class L3Ex3Main {
	
	public static void main(String args []) {
	
	// criando objetos das classes não abstratas
	
	L3Ex2Cachorro dog = new L3Ex2Cachorro();
	L3Ex1Cavalo horse = new L3Ex1Cavalo();
	L3Ex1Preguica sloth = new L3Ex1Preguica();
	
	//começando a trabalhar com as informações
	dog.setNome("Cachorro");
	dog.setIdade(10);
	System.out.println("*****Ficha de Animais*****");
	System.out.println("--------------------------");
	System.out.println("Animal: " +dog.getNome());
	System.out.println("Idade: "+ dog.getIdade());
	System.out.println("Modo de locomoção: ");dog.locomocao();
	System.out.println("Som que emite: "); dog.som();
	System.out.println("--------------------------");
	System.out.println("");
	
	horse.setNome("Cavalo");
	horse.setIdade(20);
	System.out.println("*****Ficha de Animais*****");
	System.out.println("--------------------------");
	System.out.println("Animal: " + horse.getNome()); 
	System.out.println("Idade: "+ horse.getIdade());
	System.out.println("Modo de locomoção: "); horse.locomocao();
	System.out.println("Som que emite: "); horse.som();
	System.out.println("--------------------------");
	System.out.println("");
	
	sloth.setNome("Preguiça");
	sloth.setIdade(20);
	System.out.println("*****Ficha de Animais*****");
	System.out.println("--------------------------");
	System.out.println("Animal: " +sloth.getNome()); 
	System.out.println("Idade: "+sloth.getIdade()); 
	System.out.println("Modo de locomoção: "); sloth.locomocao();
	System.out.println("Som que emite: "); sloth.som();
	System.out.println("--------------------------");
	
	}
}
