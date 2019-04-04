package exceptions;

import static com.wwj.util.Print.*;

class Pig {
	String name;

	Pig(String name) {
		this.name = name;
	}
}

public class PigSty {

	// RunntimeException 当运行时异常发生，程序发生了严重性错误，修改程序修正这个错误
	// [] [] []
	public String getPigName(Pig[] pigs, int index) {
		// java.lang.NullPointerException
		// java.lang.ArrayIndexOutOfBoundsException
		
//		if (pigs == null) {
//			throw new NullPointerException("小猪数组不允许为空");
//		}
//
//		if (index > pigs.length) {
//			throw new ArrayIndexOutOfBoundsException("哥们，你传递大于数组长度的索引是不是疯了？");
//		}
//		if (index < 0) {
//			throw new ArrayIndexOutOfBoundsException("哥们你传递小于0的数是真疯了!");
//		}
		String name = pigs[index].name;
		return name;
	}

	public static void main(String[] args) {

		PigSty pigSty = new PigSty();
		Pig[] pigs = { new Pig("小猪1"), new Pig("小猪2"), new Pig("小猪3") };

		print(pigSty.getPigName(pigs, 30));

	}

}
