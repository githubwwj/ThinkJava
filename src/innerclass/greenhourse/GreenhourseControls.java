package innerclass.greenhourse;

/**
 * 绿色小屋控制装置
 */
public class GreenhourseControls extends Control {

	private boolean light = false;

	class LightOn extends Event {

		private int temperature=5;
		
		public LightOn(long delayTime) {
			super(delayTime);
		}
		
		/**
		 * 事件是否触发
		 * true 触发
		 */
		public boolean ready() {
			return System.currentTimeMillis() >= getEventTime() 
					&& temperature>=5;
		}

		@Override
		public void action() {
			light = true;
			// 硬件代码
		}

		@Override
		public String toString() {
			return "LightOn";
		}
	}

	class LightOff extends Event {

		public LightOff(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			light = false;
			// 硬件代码
		}

		@Override
		public String toString() {
			return "LightOff";
		}
	}

	class Clock extends Event {

		public Clock(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			// 硬件代码
//			System.out.println("硬件准备打开闹钟");
		}

		@Override
		public String toString() {
			return "Clocking...";
		}
	}

	class Restart extends Event {

		private Event[] eventList;

		public Restart(long delayTime, Event[] eventList) {
			super(delayTime);
			this.eventList = eventList;
			for (Event e : eventList) {
				e.start();
				addEvent(e);
			}
		}

		@Override
		public void action() {
			// 硬件代码
			for (Event e : eventList) {
				e.start();
				addEvent(e);
			}
			start();
			addEvent(this);
		}

		@Override
		public String toString() {
			return "Restart System...";
		}
	}

}
