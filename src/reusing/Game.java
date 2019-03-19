package reusing;

public class Game {

	Game(int i) {
		System.out.println("Game() i=" + i);
	}
	
	//游戏时间
	protected int duration ;
	
	protected void printGameDuration() {
		System.out.println("---游戏时长="+duration);
	}

}
