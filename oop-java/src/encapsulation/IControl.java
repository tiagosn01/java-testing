package encapsulation;

public interface IControl {
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void openMenu();
	public abstract void closeMenu();
	public abstract void increaseVolume();
	public abstract void decreaseVolume();
	public abstract void turnOnMute();
	public abstract void turnOffMute();
	public abstract void play();
	public abstract void pause();
}
