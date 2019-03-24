package interfaces.music;

//Ä¾ÖÆÀÖÆ÷
public class WoodWind extends Wind {
	
	@Override
	public void play(Note note) {
		System.out.println("WoodWind.play() "+note);
	}
	
	public void adjust() {
		System.out.println("WoodWind.adjust()");
	}

}
