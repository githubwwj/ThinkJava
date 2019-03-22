package test;

public class StaticPolymorphism {

	public static void main(String[] args) {
		System.out.println("----main------");
		StaticSuper staticSuper = new StaticSub();
		System.out.println(StaticSuper.staticGet());
		System.out.println(staticSuper.dynamicGet());

	}

	static class StaticSuper {
		public static String staticGet() {
			System.out.println("----Base StaticSuper-----");
			return "Base staticGet";
		}

		public String dynamicGet() {
			return "Base dynamicGet()";
		}
	}

	static class StaticSub extends StaticSuper {
		public static String staticGet() {
			return "Child staticGet";
		}

		public String dynamicGet() {
			return "Child dynamicGet()";
		}
	}

}
