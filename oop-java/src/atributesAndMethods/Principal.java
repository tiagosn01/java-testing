package atributesAndMethods;

public class Principal {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.model = "Bic cristal";
		c1.color = "Blue";
		//c1.tip = 0.5f;
		c1.charge = 80;
		
		
		c1.uncap();
		c1.scrawl();
		c1.status();
		
		Caneta c2 = new Caneta();
		c2.color = "Black";
		
		
		c2.status();
		c2.scrawl();
				
	}

}
