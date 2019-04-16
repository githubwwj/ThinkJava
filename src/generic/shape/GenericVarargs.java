package generic.shape;

public class GenericVarargs {
	
	public static <T> void print(T... t) {
		for(T e:t) {
			System.out.print(e+"\t");	
		}
		System.out.println();
	}

	public static void main(String[] args) {
		print("hello","world");
		print(5,10);
		print(5.2f,10.3f);
	}

}
