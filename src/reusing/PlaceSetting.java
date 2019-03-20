package reusing;

//餐位餐具
public class PlaceSetting {
	
	public static void main(String[] args) {
		
		// 新的类产生现有类的对象
		Utensil utensil=new Fork(); //餐叉
		utensil =new Plate();
		utensil = new Spoon();
		
	}

}
