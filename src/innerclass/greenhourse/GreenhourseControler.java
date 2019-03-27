package innerclass.greenhourse;

import innerclass.greenhourse.GreenhourseControls.Restart;

/**
 * ÂÌÉ«Ğ¡Îİ¿ØÖÆÆ÷
 * @author wwj
 *
 */
public class GreenhourseControler {

	public static void main(String[] args) {
		GreenhourseControls gControls=new GreenhourseControls();
		
		Event[] events = {
				gControls.new Clock(2000),
				gControls.new LightOn(3000),
				gControls.new LightOff(4000),
		};
		
		Restart restart= gControls.new Restart(5000,events);
		gControls.addEvent(restart);
		
		gControls.run();
	}

}
