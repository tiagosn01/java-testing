package Constructors;

public class Caneta {
	private String model;
	public Caneta(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	private String color;
	
	
	public void status(int ordenation) {
		System.out.println("Data of Pen "+ ordenation);
		System.out.println("Model: " + this.model);
		System.out.println("Color: " + this.color);
		System.out.println();
		
	}
	
	
}
