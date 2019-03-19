package reusing;

/**
 * 洒水车系统
 * @author wwj
 *
 */
public class SprinklerSystem {

	// 组合
	// 在一个新的类中创建现有类的对象

	Water water = new Water();

	private String name; // 字符串也是一个对象
	private int i;
	private float f;
	// 域 <==> 属性 <==>成员

	@Override
	public String toString() {
		return "name=" + name + "   i=" + i
				+ "    f=" + f + "    water=" + water;
	}

	public static void main(String[] args) {
		SprinklerSystem sprinklerSystem = new SprinklerSystem();
		System.out.println(sprinklerSystem.toString());
	}

}
