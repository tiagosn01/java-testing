package Aula02;

public class Principal {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.color = "Blue";
		c1.tip = 0.5f;
		c1.capped = false;
		
		c1.cap();
		c1.scrawl();
		c1.status();
		
		Caneta c2 = new Caneta();
		c2.color = "Black";
		c2.tip = 1.0f;
		c2.capped = false;
		
		c2.status();
		c2.scrawl();
				
	}

}
