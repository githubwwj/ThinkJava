package innerclass.cursor;

//按顺序排好
public class Sequence {

	//序列的游标
	private int next = 0;
	//序列的集合
	private Object[] items;

	public Sequence(int len) {
		items = new Object[len];
	}

	public void add(Object obj) {
		if (next < items.length) {
			items[next++] = obj;
		}
	}

	//序列选择器
	private class SequenceSelector implements Selector {

		//序列选择器的游标
		private int next = 0;

		@Override
		public boolean end() {
			return next == items.length;
		}

		@Override
		public Object current() {
			return items[next];
		}

		@Override
		public void next() {
			next++;
		}
	}
	
	//获取选择器对象
	public Selector getSelector() {
		return new SequenceSelector();
	}
	
	public static void main(String[] args) {
		Sequence sequence=new Sequence(10);
		sequence.add("Hello World");
		sequence.add("Hello JAVA");
		Selector selector=sequence.getSelector();
		while(!selector.end()) {
			System.out.println(selector.current());
			selector.next();
		}
		
	}

}
