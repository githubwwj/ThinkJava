package strings;
import static com.wwj.util.Print.print;

public class TestMyArrayList {

	public static void main(String[] args) {

		MyArrayList myArrayList = new MyArrayList(10);
		myArrayList.add(new Human("ÕÅÂé×Ó"));
		myArrayList.add("ÄãºÃ Ïã½¶");
		myArrayList.add("good");
		myArrayList.add("food");
		
		for (int i = 0; i < myArrayList.size(); i++) {
			print(myArrayList.get(i));
		}
		
		System.out.println("--------------");
		myArrayList.remove(1);
		myArrayList.remove(myArrayList.get(0));
		
		for (int i = 0; i < myArrayList.size(); i++) {
			print(myArrayList.get(i));
		}
		System.out.println("--------------");
		
//		myArrayList.get(-1);

	}

}
