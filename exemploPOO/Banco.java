package exemploPOO;

public class Banco {

	private int numberAc;
	private String acHolder;
	private double balance;
	
	public Banco() {}
	
	public void showData() {
		System.out.println();
		System.out.println("Account Data:");
		System.out.println("Account: " + this.numberAc+", Holder: "+this.acHolder+", Balance: "+this.balance);
		System.out.println();
	}
	
	public void deposit(double deposit) {
		this.balance += deposit;
		System.out.println("Updated account data: ");
		showData();
	}
	
	public void withdraw(double withdraw) {
		if(withdraw>this.balance) {
			System.out.println("That's impossible complete this action. You don't have enough money.");
			System.out.println("Updated account data: ");
			showData();
		}
		else {
			this.balance -= (withdraw + 5);
			System.out.println("Success! A fee of 5$ has been sent on your email");
			System.out.println("Updated account data: ");
			showData();
		}
		
	}
	
	public int getNumberAc() {
		return numberAc;
	}
	public void setNumberAc(int numberAc) {
		this.numberAc = numberAc;
	}
	public String getAcHolder() {
		return acHolder;
	}
	public void setAcHolder(String acHolder) {
		this.acHolder = acHolder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String toString(){
		return "Account" +
				numberAc+
				", Holder: "+
				acHolder+
				", Balance: $"+
				String.format("%.2f", balance);
	}
	
}
