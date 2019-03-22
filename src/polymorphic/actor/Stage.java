package polymorphic.actor;

/**
 * 舞台
 */
public class Stage {

	Actor actor=new HappyActor();
	
	/**
	 * 切换演员
	 */
	public void changeActor() {
		actor=new SadActor();
		//动态选择类型
	}
	
	/**
	 * 演奏
	 */
	public void performActor() {
		actor.act();
	}

}
