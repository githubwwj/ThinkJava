package innerclass.greenhourse;

public abstract class Event {

	// 事件触发时间
	private long eventTime;
	
	//时间延迟多久
	protected final long delayTime;
	
	public Event(long delayTime) {
		this.delayTime = delayTime;
		start();
	}
	
	//事件触发时间
	public void start() {
		eventTime = System.currentTimeMillis() + delayTime;
	}
	
	/**
	 * 事件是否触发
	 * true 触发
	 */
	public boolean ready() {
		return System.currentTimeMillis() >= eventTime;
	}
	
	//时间触发后做啥事由子类实现
	public abstract void action();

	public long getEventTime() {
		return eventTime;
	}
	
	
	
}
