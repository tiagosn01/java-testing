package constructors;

public class Principal {

	public static void main(String[] args) {
		Caneta c1 = new Caneta("FaberCastle", "Blue");
		Caneta c2 = new Caneta("BIC", "Black");
//		c1.setModel("BIC");
//		c1.model = "BIC";
		
//		c1.setColor("Black");		
//		c1.color = "Black";
		
		c2.setColor("Red");
		c1.status(1);
		c2.status(2);
		
		
//		System.out.print("Pen " + c1.getModel() + " color " + c1.getColor());
		
		
		
	}

}
