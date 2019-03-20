package reusing;

public class Cartoon extends Drawing{

	
	
	Cartoon(){
		super();
		System.out.println("Cartoon()");
	}
	
	public static void main(String[] args) {
		Cartoon cartoon=new Cartoon();
		cartoon.toString();
	}
	
}
