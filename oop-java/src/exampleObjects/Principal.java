package exampleObjects;

public class Principal {

	public static void main(String[] args) {
		BankAcc c1 = new BankAcc();		

		c1.setNumAcc(111);
		c1.setOwner("Tiago");
		c1.openAccount("CC");
		
		BankAcc c2 = new BankAcc();		

		c2.setNumAcc(222);
		c2.setOwner("Maria");
		c2.openAccount("CP");
		
		
		c1.deposit(100);
		c2.deposit(500);
		
		
		
		c1.status();
		c2.status();
		
		
	}

}
