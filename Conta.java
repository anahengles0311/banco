package application;

public class Conta {
	
	//Atributos
	
	int numero;
	String titular;
	double saldo;
		
	//metodos da conta
	boolean sacar(double quantidade) {		
		if (this.saldo < quantidade) {
			return false;
		} else {
			this.saldo -= quantidade;
			return true;
		}
	}

	void depositar(double quantidade) {
		this.saldo += quantidade;
	}
			
	void transfere (Conta destino, double valor) {
		if (this.saldo < valor) {
			System.out.println("Valor não suficiente...");
		}else {
			
		
		//atualizar o saldo, fazendo o saque
		this.saldo = this.saldo - valor;
		//efetua a transferência
		destino.saldo = destino.saldo + valor;
	}
	}
	void rendimento(double valor) {
		//recebe o valor pra poder executar
		//
		double juros = this.saldo;
		juros = this.saldo * (5.0 / 100.0);
		System.out.printf("Este é o rendimento mensal: %.2f\n", juros);
		this.saldo += juros;
		System.out.printf("Este é o valor total com o acréscimo do rendimento: %.2f\n", this.saldo);
		
	}
}
