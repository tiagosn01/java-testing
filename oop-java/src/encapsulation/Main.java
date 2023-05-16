package encapsulation;

public class Main {

	public static void main(String[] args) {
		RemoteControl control = new RemoteControl(10, false, false);
		control.turnOn();
		control.openMenu();
		control.turnOnMute();
		control.openMenu();


	}

}
