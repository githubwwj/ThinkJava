package exceptions;

public class SwitchFinally {

	static Switch switch1 = new Switch();

	public static void main(String[] args) {

		try {
			switch1.on();
			f();
			return ;
		}
//catch(Exception e) { 捕获所有的异常
//			
//		}
		catch (OnException e) {
			System.out.println(e.toString());
			switch1.off();
		} catch (OffException e) {
			System.out.println(e.toString());
			switch1.off();
		}finally{
			switch1.off();
		}
		
	}
	
	static void f() throws OnException,OffException{
	}

}

class OnException extends Exception {
}

class OffException extends Exception {
}

//开关类
class Switch {
	boolean state = false;

	public void on() {
		state = true;
		System.out.println(this);
	}

	public void off() {
		state = false;
		System.out.println(this);
	}

	public String toString() {
		return state ? "on" : "off";
	}

}
