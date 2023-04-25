package Aula02;

public class Caneta {
	String model;
	String color;
	float tip;
	int charge;
	boolean capped;
	
	void status() {
		System.out.println("One Pen " + this.color);
		System.out.println("is it covered? " + this.capped);
		System.out.println("tip " + this.tip);
		System.out.println("charge " + this.charge);
	}
	
	void write() {
		if(this.capped ==true) {
			System.out.println("Error: Its not possible write");
		} else {
			System.out.println("Scratch...");
		}
	}
	
	void scrawl() {
		if(this.capped ==true) {
			System.out.println("Error: Its not possible scribble");
		} else {
			System.out.println("Scratch...");
		}
	}
	
	void cap() {
		this.capped = true;
	}
	void uncap() {
			this.capped = false;
		}
}
