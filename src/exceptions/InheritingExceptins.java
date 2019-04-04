package exceptions;

public class InheritingExceptins {

	
	static void f() throws SimpleException{ //异常函数声明
		//throws 后面时异常类
		System.out.println("f()");
		throw new SimpleException(); //throw 后面时异常对象
//		int a = 0;
	}
	
	public static void main(String[] args) {

		try {
			f();		
		}catch(SimpleException e) { //异常处理程序
			System.out.println("处理了这个简单异常");
			e.printStackTrace();
//			exceptions.SimpleException  异常名称代表发生了什么事
//			at exceptions.InheritingExceptins.f(InheritingExceptins.java:9)  发生在哪个地方
//			at exceptions.InheritingExceptins.main(InheritingExceptins.java:15)
		}
		//当异常处理程序结束后程序会由异常状态进入正常状态
		System.out.println("main over");
	}

}

class SimpleException extends Exception {

	SimpleException() {
		super();
	}

//	构造带指定详细消息
	SimpleException(String message) {
		super(message);
	}

}
