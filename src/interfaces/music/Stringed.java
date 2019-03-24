package interfaces.music;

public class Stringed extends Instrument {

	@Override
	public void play(Note note) {
		System.out.println("Stringed.play "+note);
	}

	@Override
	public void adjust() {
		System.out.println("Stringed.adjust");
	}

}
