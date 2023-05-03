package ExampleObjects;

public class BankAcc {
	public int numAcc;
	protected String type;
	private String owner;
	private double balance;
	private boolean status;
	

	public BankAcc() {
		super();
		this.balance = 0;
		this.status = false;
	}
	
	public void openAccount(String type) {
		this.setType(type);
		this.setStatus(true);
	
		if(type == "CC") {
			this.setBalance(50);
		} else if(type == "CP"){
			this.setBalance(150);
		}
	}
	
	public void closeAccount() {
		if(this.getBalance() > 0) {
			System.out.println("Account cannot be closed, because it has balance");
		} else if(this.getBalance() < 0) {
			System.out.println("Account cannot be closed, because it has debt");
		} else {
			this.setStatus(false);
			System.out.println("Account closed with success");
		}
			
	}
	
	public void deposit(float value) {
		
		if(this.getStatus()) {
			this.setBalance(this.getBalance() + value);
			System.out.println("Successful deposit");
		} else {
			System.out.println("Impossible deposit on closed account");
		}
		
	}
	
	public void withdraw(float value) {
		if(this.getStatus()) {
			if(this.getBalance() >= value) {
				this.setBalance(this.getBalance() - value);
				System.out.println("Successful withdraw");			
			}
		} else {
			System.out.println("Impossible withdraw, insufficient funds");
		}
	}
	
	public void payMontly() {
		int v = 0;
		if(this.getType() == "CC") {
			v = 12;
		} else if(type == "CP"){
			v = 20;
			this.setBalance(20);
		}
		
		if(this.getStatus()) {
			this.setBalance(this.getBalance() - v);
			System.out.println("Monthly fee paid successfully");
		}
	}





	
	public int getNumAcc() {
		return numAcc;
	}





	public void setNumAcc(int numAcc) {
		this.numAcc = numAcc;
	}



	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public boolean getStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}
	

	public void status() {
		System.out.println("--------------------------------------");
		System.out.println("Account "+ this.getNumAcc());
		System.out.println("Type: " + this.type);
		System.out.println("Owner: " + this.getOwner());
		System.out.println("Balance: " + this.getBalance());
		System.out.println("Status " + this.getStatus());
		System.out.println();
		
	}
	
	
}
