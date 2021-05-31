package exercicioOOP;

public class main {

	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		
		minhaConta.setSaldo(1000);
		minhaConta.setNumero(123190980);
		
		Conta myConta = new Conta();
		minhaConta.setSaldo(13288);
		minhaConta.setNumero(1352512);
		
		Cliente c = new Cliente();
		
		System.out.println("Saldo: "+ minhaConta.getSaldo());
		
		boolean sacou = minhaConta.saca(50);
			if(sacou) {
				System.out.println("Novo saldo: "+ minhaConta.getSaldo());
			}
			else {
				System.out.println("Saldo insuficiente para saque. Saldo: "+minhaConta.getSaldo());
			}
		
		
		
		
	}

}
