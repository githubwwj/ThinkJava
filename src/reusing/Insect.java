package reusing;
//À¥³æ
	
public class Insect {
	int i;
	static int j= printValue();
	
	Insect(){
		System.out.println("Insect()");
		i = 10;
	}
	
	static int printValue() {
		System.out.println("Insect  printValue");
		return 20;
	}

}
