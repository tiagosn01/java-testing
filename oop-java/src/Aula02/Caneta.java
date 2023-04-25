package Aula02;

public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.println("Uma caneta " + this.cor);
		System.out.println("está tampada? " + this.tampada);
		System.out.println("ponta " + this.ponta);
		System.out.println("carga " + this.carga);
	}
	
	void rabiscar() {
		if(this.tampada ==true) {
			System.out.println("Erro: Não é possível rabiscar");
		} else {
			System.out.println("Rabiscando...");
		}
	}
	
	void tampar() {
		this.tampada = true;
	}
	void destampar() {
			this.tampada = false;
		}
}
