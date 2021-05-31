package exercicioOOP;

public class Conta {
	private double saldo;
	private int numero;
	private String titular;
	
	public Conta() {}
	
	public boolean saca(double valor) {
		if(this.saldo < valor) {
			return false;
		}
		else{
			this.saldo = this.saldo - valor;
			return true;
		}
	}
	
	public void transfere(Conta destino, double valor) {
		if(this.saldo<valor) {
			System.out.println("Não foi possível executar a transferência pois o valor é maior que o saldo");
		}
		else {
			this.saldo -= valor;
			destino.saldo = destino.saldo + valor;
		}
	}
	
	boolean	transfere2(Conta	destino,	double	valor) {
		boolean	retirou	=	this.saca(valor);
		if	(retirou	==	false)	{
		//	não	deu	pra	sacar!
			return false;
		}
		else{
			destino.deposita(valor);
			return true;
		}
}

	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
