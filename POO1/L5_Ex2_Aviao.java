package Turma15_POO;

public class L5_Ex2_Aviao {
	
	// Criando atributos
	public String passageiro;
	public String destino;
	public String empresa;
	public int qtdPassagem;
	
	
	// Construtor (não precisa do void) (para "brincar" com atributos)
	public L5_Ex2_Aviao(String nomePassageiro, String destino, String empresa, int qtdPassagem) 
	{
		this.passageiro = nomePassageiro;
		this.destino = destino;
		this.empresa = empresa;
		this.qtdPassagem = qtdPassagem;
	}
	
	public void viagem()
	{
		//Fazer algo sem retornar nada (void = vazio)
		String viagem = " "+qtdPassagem+" "+empresa+" "+destino;
	}
	
	//Agora os metodos que brincam com os dados
	
	public String getPassageiro() {
		return passageiro;
	}


	public void setPassageiro(String passageiro) {
		this.passageiro = passageiro;
	}


	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	public String getEmpresa() {
		return empresa;
	}


	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}


	public double getQtdPassagem() {
		return qtdPassagem;
	}


	public void setQtdPassagem(int qtdPassagem) {
		this.qtdPassagem = qtdPassagem;
	}
	
	
	
}
