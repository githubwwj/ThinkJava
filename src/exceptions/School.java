package exceptions;

public class School {

	public static void main(String[] args) {
		Techer techer = new Techer("王老师");
		try {
			techer.prelect();
		} catch (NoPlanException e) {
			System.out.println("不能讲课的原因:" + e.getMessage());
			System.out.println("换人");
		}
	}

}

class Techer {
	private String name;
	private Computer computer;

	public Techer(String name) {
		this.name = name;
		computer = new Computer();
	}

	public void prelect() throws NoPlanException {
		try {
			computer.run();
			System.out.println(name + "开始讲课");
		} catch (LanPingException e) {
			System.out.println(e.toString());
			computer.reset();
			prelect();
		} catch (MaoYangException e) {
			System.out.println("不能讲课了");
			throw new NoPlanException(e.getMessage());
		}

	}
}

class Computer {

	private int state = 2;

	public void run() throws LanPingException, MaoYangException {
		if (state == 1) {
			throw new LanPingException("电脑蓝屏");
		} else if (state == 2) {
			throw new MaoYangException("电脑冒烟");
		}
		System.out.println("开始运行");
	}

	public void reset() {
		state = 0;
		System.out.println("电脑重启");
	}

}

class LanPingException extends Exception {
	LanPingException(String message) {
		super(message);
	}
}

class MaoYangException extends Exception {
	MaoYangException(String message) {
		super(message);
	}
}

class NoPlanException extends Exception {
	NoPlanException(String message) {
		super(message);
	}
}
