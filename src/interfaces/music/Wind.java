package interfaces.music;

public class Wind extends Instrument {

	@Override
	public void play(Note note) {
		System.out.println("Wind.play() "+note);
	}
	
	public void adjust() {
		System.out.println("Wind.adjust()");
	}

}
