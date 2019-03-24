package interfaces.music;

//Í­ÖÆÀÖÆ÷
public class Brass extends Wind {
	
	@Override
	public void play(Note note) {
		System.out.println("Brass.play() "+note);
	}
	
	public void adjust() {
		System.out.println("Brass.adjust()");
	}

}
