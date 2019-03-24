package interfaces.music;

public class Muisc {

	//Çúµ÷
	static void tune(Instrument instrument) {
		instrument.play(Note.MIDDLE);
		instrument.adjust();
	}

//	Çúµ÷
	static void tune(Instrument[] instruments) {
		for (Instrument instrumet : instruments) {
			instrumet.play(Note.HIGH);
		}
	}

	public static void main(String[] args) {

		Wind wind = new Wind();
		tune(wind);

		Instrument[] instrument = { new Wind(),
				new Stringed(), new WoodWind(), new Brass() };
		tune(instrument);

		// Wind.play() MIDDLE
		// Wind.adjust()

	}

}
