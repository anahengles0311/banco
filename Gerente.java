package application;

public class Gerente extends Funcionario{

	private int senha;
	private int numeroDeFunciGeren;
	
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroDeFunciGeren() {
		return numeroDeFunciGeren;
	}

	public void setNumeroDeFunciGeren(int numeroDeFunciGeren) {
		this.numeroDeFunciGeren = numeroDeFunciGeren;
	}

	

	public boolean autentica(int senha) {
	
	if (this.senha == senha) {
		
		//No caso de garantido o acesso, levar o user para algum lugar especifico
		System.out.println("Acesso permitido");
		return true;
	}else {
		System.out.println("Acesso negado!");
		return false;
	}

	}
}
