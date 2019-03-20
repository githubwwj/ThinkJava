package reusing;

public class FinalData {

	// 属性 <==> 域
	// 编译期常量
	static final int VALUE_1 = 10;
	public static final int VLAUE_2 = 20;

	// 用final修饰的域赋初值后是恒定不变的
	private final int like = 30;

	// final 修饰的对象引用不能改变,对象内容可以变
	final Value value = new Value(like);

	// final 修饰的域时没有初始化
	private final int j;
	private final Value value2;

	FinalData() {
		j = 10;
		value2 = new Value(j);
	}

	//类是如何加载的
	public static void main(String[] args) {
//		VALUE_1 =20;
//		value =new Value(VLAUE_2);
		FinalData finalData = new FinalData();
		
		finalData.value.i =30;
		
		System.out.println("j="+finalData.j
				+"  value.i="+finalData.value.i);
	}

	class Value {
		int i;

		Value(int i) {
			this.i = i;
		}
	}

}
