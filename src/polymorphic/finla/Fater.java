package polymorphic.finla;

public class Fater {
	
	private final void f() {
		System.out.println("Fater.f()");
	}

	public static void main(String[] args) {
		
		Fater fater=new Child();
		fater.f();
		
	}

	//Fater.f()

}
