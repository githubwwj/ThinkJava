package innerclass.greenhourse;

import java.util.ArrayList;
import java.util.List;

/**
 * 事件控制器
 */
public class Control {

	private List<Event> eventList = new ArrayList<Event>();

	public void addEvent(Event event) {
		eventList.add(event);
	}

	/**
	 * 启动控制器
	 * 判断事件是否触发
	 * 如果触发调用相应的事件
	 */
	public void run() {
		while (eventList.size() > 0) {
			for (Event e : new ArrayList<Event>(eventList)) {
				if(e.ready()) {
					System.out.println(e);
					e.action();
					eventList.remove(e);
				}
			}
		}
	}

}
