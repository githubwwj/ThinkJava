package interfaces.music;

/**
 * ÀÖÆ÷
 */
public abstract class Instrument {
	
	public abstract void play(Note note) ; //Ñİ×à
	
	public abstract void adjust(); //µ÷Òô
	
	public String what() {
		return getClass().getSimpleName();
	}

}
