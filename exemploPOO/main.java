package exemploPOO;

import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Banco bank = new Banco();
		
		System.out.print("Enter account number: ");
		bank.setNumberAc(input.nextInt());
		
		System.out.print("Enter account holder: ");
		bank.setAcHolder(input.next());
		
		System.out.print("Enter initial deposit value: ");
		bank.setBalance(input.nextDouble());
		
		
		bank.showData();
		
		System.out.print("Enter a deposit value: ");
		bank.deposit(input.nextDouble());
		
		System.out.print("Enter a withdraw value: ");
		bank.withdraw(input.nextDouble());
		
	}

}
