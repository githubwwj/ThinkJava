package polymorphic.music;

public class Music {

	/**
	 * 曲调
	 * 后期绑定  <==> 运行时绑定  <==> 动态绑定
	 * 前期绑定  <==> 程序还未执行 
	 * 通过动态绑定实现多态和对象有关
	 * 
	 * 普通方法访问权限修饰词
	 * public protected 包访问权限
	 * 
	 * 都不是普通方法
	 * private final static field
	 */
	public  static void tune(Instrument instrument) {
		instrument.play(Note.MIDDLE);
	}
	
	public static void main(String[] args) {
		Wind wind=new Wind();
		tune(wind);
	}

	//Wind play MIDDLE
	
}
