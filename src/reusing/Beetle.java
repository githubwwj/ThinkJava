package reusing;

//¼×³æ
public class Beetle extends Insect {

	Beetle() {
		System.out.println("Beetle()");
	}

	int k = printValue();
	static int q = printValue();

	public static void main(String[] args) {
		System.out.println("---main----");
		Beetle beetle = new Beetle();
		System.out.println("beetle.k=" + beetle.k
				+ "  beetle.q=" + Beetle.q
				+"  beetle.i="+beetle.i);
	}
//	Insect  printValue
//	Beetle  printValue
//	---main----
//	Insect()
//	Beetle  printValue
//	Beetle()
//	beetle.k=30  beetle.q=30  beetle.i=10
	
	static int printValue() {
		System.out.println("Beetle  printValue");
		return 30;
	}

}
