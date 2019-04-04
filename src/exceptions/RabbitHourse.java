package exceptions;

import java.io.ObjectInputStream.GetField;

/**
 * 兔子的小屋
 * 
 * @author wwj
 *
 */
public class RabbitHourse {

	public String getName(Rabbit[] rabbits, int index)
			throws NullPointerException, ArrayIndexOutOfBoundsException, FuShuException {

		if (rabbits == null) {
			throw new NullPointerException();
		}
		if (index >= rabbits.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		if (index < 0) {
			throw new FuShuException();
		}

		return rabbits[index].name;
	}

	public static void main(String[] args) {
		RabbitHourse hourse = new RabbitHourse();
		Rabbit[] rabbits = { new Rabbit("小兔子1"), new Rabbit("小兔子2"), new Rabbit("小兔子3"), };
		try {
			hourse.getName(rabbits, -1);
		} catch (NullPointerException e) {
			System.out.println("空指针异常");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组索引越界异常");
		} catch (FuShuException e) {
			System.out.println("不能为负数");
			e.printStackTrace();
		}
		System.out.println("main over");

	}

}

class FuShuException extends Exception {

}

class Rabbit {
	String name;

	Rabbit(String name) {
		this.name = name;
	}
}