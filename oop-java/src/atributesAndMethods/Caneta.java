package atributesAndMethods;

public class Caneta {
	public String model;
	public String color;
	private float tip;
	protected int charge;
	private boolean capped;
	
	public void status() {
		System.out.println("One Pen " + this.color);
		System.out.println("is it covered? " + this.capped);
		System.out.println("tip " + this.tip);
		System.out.println("charge " + this.charge);
	}
	
	public void write() {
		if(this.capped ==true) {
			System.out.println("Error: Its not possible write");
		} else {
			System.out.println("Scratch...");
		}
	}
	
	public void scrawl() {
		if(this.capped ==true) {
			System.out.println("Error: Its not possible scribble");
		} else {
			System.out.println("Scratch...");
		}
	}
	
	protected void cap() {
		this.capped = true;
	}
	protected void uncap() {
			this.capped = false;
		}
}
