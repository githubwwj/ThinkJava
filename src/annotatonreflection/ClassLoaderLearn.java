package annotatonreflection;

public class ClassLoaderLearn {

	public static int a=15;
	
	static {
		System.out.println("static a="+a);
	}
	
	//----加载------
	//1 找到字节码文件,如何找到字节码文件
	//2 把字节码文件生成Class对象
	
	//-----链接------
	//1  字节码进行安全检查
	//2 int a 分配4个字节的内存  a=0
	//3 把类中的符号引用转换为直接引用
	
	//-----初始话------
	//类的静态变量赋予正确的初始值
	// a = 15
	
	public static void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		System.out.println("main a="+ClassLoaderLearn.a);
//		
//		ClassLoaderLearn classLoaderLearn=new ClassLoaderLearn();
		
//		try {
//			@SuppressWarnings("all")
//			Class<ClassLoaderLearn> clazz=(Class<ClassLoaderLearn>) Class.forName("annotatonreflection.ClassLoaderLearn");
//			System.out.println(clazz);
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		
//		ClassLoaderLearn.add(5,6);
		
		
	}

}
