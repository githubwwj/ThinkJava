package reusing;

public class PlaceSetting {
	
	public static void main(String[] args) {
		
		// 新的类产生现有类的对象
		Utensil utensil=new Fork();
		utensil =new Plate();
		utensil = new Spoon();
		
	}

}
