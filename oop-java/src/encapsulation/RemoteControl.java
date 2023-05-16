package encapsulation;

public class RemoteControl implements IControl{
	private int volume;
	private boolean online;
	private boolean playing;
	public RemoteControl(int volume, boolean online, boolean playing) {
		super();
		this.volume = volume;
		this.online = online;
		this.playing = playing;
	}
	private int getVolume() {
		return volume;
	}
	private void setVolume(int volume) {
		this.volume = volume;
	}
	private boolean isOnline() {
		return online;
	}
	private void setOnline(boolean online) {
		this.online = online;
	}
	private boolean isPlaying() {
		return playing;
	}
	private void setPlaying(boolean playing) {
		this.playing = playing;
	}
	
	@Override
	public void turnOn() {
		this.setOnline(true);
		
	}
	@Override
	public void turnOff() {
		this.setOnline(false);
		
	}
	@Override
	public void openMenu() {
		System.out.println("------MENU--------");
		System.out.println("Is Online? " + this.isOnline());
		System.out.println("Is playing? " + this.isPlaying());
		System.out.print("Volume: " + this.getVolume());
		
		for(int i = 0; i < this.getVolume(); i+=1) {
			System.out.print("|");		
			
		}
		System.out.println("");		
		
	}
	@Override
	public void closeMenu() {
		System.out.println("Closing menu");
		
	}
	@Override
	public void increaseVolume() {
		if(this.isOnline()) {
			this.setVolume(this.getVolume() + 1);
		}
		
	}
	@Override
	public void decreaseVolume() {
		if(this.isOnline()) {
			this.setVolume(this.getVolume() - 1);
		}
		
	}
	@Override
	public void turnOnMute() {
		if(this.isOnline() && this.getVolume() > 0) {
			this.setVolume(0);
		}
		
	}
	@Override
	public void turnOffMute() {
		if(this.isOnline() && this.getVolume() == 0) {
			this.setVolume(10);
		}
		
	}
	@Override
	public void play() {
		if(this.isOnline() && !(this.isPlaying())) {
			this.setPlaying(true);
		}
		
	}
	@Override
	public void pause() {
		if(this.isOnline() && this.isPlaying()) {
			this.setPlaying(false);
		}
		
		
	}
	
	
	
	
	
}
