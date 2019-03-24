package interfaces.music;

public class Muisc {

	//Çúµ÷
	static void tune(Instrument instrument) {
		System.out.println(instrument.what());
		instrument.play(Note.MIDDLE);
		instrument.adjust();
	}

//	Çúµ÷
	static void tune(Instrument[] instruments) {
		for (Instrument instrumet : instruments) {
			System.out.println(instrumet.what());
			instrumet.play(Note.HIGH);
		}
	}

	public static void main(String[] args) {

		Wind wind = new Wind();
		tune(wind);

		Instrument[] instrument = { new Wind(),
				new Stringed(), new WoodWind(), new Brass() };
		tune(instrument);

//		Wind
//		Wind.play() MIDDLE
//		Wind.adjust()
//		Wind
//		Wind.play() HIGH
//		Stringed
//		Stringed.play HIGH
//		WoodWind
//		WoodWind.play() HIGH
//		Brass
//		Brass.play() HIGH


	}

}
